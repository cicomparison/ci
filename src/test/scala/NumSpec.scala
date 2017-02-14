import collection.mutable.Stack
import org.scalatest._

class NumSpec extends FlatSpec with Matchers {

  "3 add 2" should "produce the result 5" in {
    val three = Num(3) 
    assert (5 == (three + 2))
  }

  "3 multiply 3" should "produce the result 9" in {
    val three = Num(3) 
    assert (9 == (three * 3))
  }
}
