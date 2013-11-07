package scala101

object Euler4 extends App {

  implicit def megaInt(i:Int) = new MegaInt(i)

  var int = 10

  println(int.isPalindrome())

}

class MegaInt(i:Int) {
  def isPalindrome():Boolean = {
    i.toString == i.toString().reverse
  }
}
