package com.kwoolytech.kwoolybot

case class CommandRouter() {

  def run(command: String): List[String] = {
    val _command = command.split("\\s+").toList

    _command.head match {
      case "dice" => Dice().run(_command.tail)
      case _ => List()
    }
  }

}