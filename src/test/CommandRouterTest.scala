import org.scalatest._
import com.kwoolytech.kwoolybot.CommandRouter

class CommandRouterSpecs extends FunSpec with Matchers {

  it ("Should return empty list when the bot is not supported") {
    CommandRouter().run("NoSuchBot roll 1d6") should be (None)
  }

}
