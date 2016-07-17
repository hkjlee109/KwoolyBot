import org.scalatest._
import com.kwoolytech.kwoolybot.Dice

class DiceSpecs extends FunSpec with Matchers {
  private var actual: List[String] = List()

  private def Initialize()                          = { actual = List() }
  private def ResultCallback(message: List[String]) = { actual = message }
  private def StringCommandToWordList(s: String)    = { s.split("\\s+").toList }

  it ("Should return nothing when the command is not supported") {
    Initialize()
    (new Dice(StringCommandToWordList("NoSuchCommand 1d6"), ResultCallback)).run()
    actual should be (List())
  }

  it ("Should return nothing when the sub command value is invalid.") {
    Initialize()

    (new Dice(StringCommandToWordList("roll 1x1"), ResultCallback)).run()
    actual should be (List())

  }

  it ("Dice: Should return multiple numbers when requested multiple results") {
    Initialize()

    (new Dice(StringCommandToWordList("roll 3d6"), ResultCallback)).run()
    actual.length should be (3)
  }

}
