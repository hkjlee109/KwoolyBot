package com.kwoolytech.kwoolybot

case class Dice() {

  def run(command: List[String]): List[String] = {
    command.head match {
      case "roll" => roll(command.tail)
      case _ => List()
    }
  }

  private def roll(command: List[String]): List[String] = {
    val rollCmdPattern = "([0-9]+)d([0-9]+)".r

    command.head match {
      case rollCmdPattern(numTry, diceSize) => rollDice(numTry.toInt, diceSize.toInt)
      case _ => List()
    }
  }

  private def rollDice(numTry: Int, diceSize: Int): List[String] = {
    (1 to numTry).map { x => scala.util.Random.nextInt(diceSize) + 1 }
  }.toList.map(_.toString)

}