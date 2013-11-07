package scala101

object Euler2 extends App {

  lazy val fibs = {
    def tail(a:Int, b:Int):Stream[Int]
      = a #:: tail(b, a + b)
    tail(1, 1)
  }

  val result = fibs.takeWhile(_ <= 4000000)
                .filter(_ % 2 == 0).sum

  println(result)

}
