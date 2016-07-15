package com.kwoolytech.kwoolybot

import org.scalatest._

class CommandRouterSpecs extends FunSpec with Matchers {

  it ("Should return empty list when the bot is not supported") {
    CommandRouter().run("NoSuchBot roll 1d6") should be (None)
  }

//  it ("Should return empty list when the command is not supported") {
//    CommandRouter().run("dice NoSuchCommand 1d6") should be (List())
//  }
//
//  it ("Should return empty list when the command input value is invalid.") {
//    CommandRouter().run("dice roll 1x1") should be (List())
//  }
//
//  it ("Dice: Should return single number when requested single result") {
//    CommandRouter().run("dice roll 1d6").length should be (1)
//  }
//
//  it ("Dice: Should return multiple numbers when requested multiple results") {
//    CommandRouter().run("dice roll 5d6").length should be (5)
//  }

}
