object Num {

  def apply(n: Int): Num = new Num(n)

  def main(args: Array[String]) {
    println("sample test!")
  }
}

class Num(base: Int) {

  def +(a: Int): Int  = base + a
  def *(a: Int): Int  = base * a
  
}
