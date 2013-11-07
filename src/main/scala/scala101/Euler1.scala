package scala101

object Euler1 extends App {

  val result = (1 until 1000)
    .filter(i => i % 3 == 0 || i % 5 == 0).sum

  println(result)
}
