package com.kwoolytech.kwoolybot

case class CommandRouter() extends I_CommandRouter {

  def onReceive(message: List[String]) = {
    message.foreach(println)
  }

  def run(command: String) = {
    val _command = command.split("\\s+").toList

    _command.head match {
      case "dice" => Dice().run(_command.tail, onReceive)
      case _ => None
    }
  }

}