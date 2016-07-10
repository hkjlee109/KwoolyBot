package com.kwoolytech.kwoolybot

import org.scalatest._

class CommandRouterSpecs extends FunSpec with Matchers {

  it ("A simple dice roll") {
    CommandRouter().run("dice roll 1d6").length should be (1)
  }

}
