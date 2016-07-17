package com.kwoolytech.kwoolybot

import com.kwoolytech.scalacommon._

class Dice(command: List[String], callback: List[String] => Unit) extends Bot {

  override def run() = {
    command.head match {
      case "roll" => roll(command.tail, callback)
      case _ => Syslog.debug(getClass + " Invalid dice command.")
    }
  }

  private def roll(command: List[String], callback: List[String] => Unit) = {
    val rollCmdPattern = "([0-9]+)d([0-9]+)".r

    command.head match {
      case rollCmdPattern(numTry, diceSize) => callback(rollDice(numTry.toInt, diceSize.toInt))
      case _ => Syslog.debug(getClass + " Invalid dice sub command.")
    }
  }

  private def rollDice(numTry: Int, diceSize: Int): List[String] = {
    (1 to numTry).map { x => scala.util.Random.nextInt(diceSize) + 1 }
  }.toList.map(_.toString)

}