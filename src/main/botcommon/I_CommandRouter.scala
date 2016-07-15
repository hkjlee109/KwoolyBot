package com.kwoolytech.kwoolybot

trait I_CommandRouter {
  def onReceive(message: List[String])
}
