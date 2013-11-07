package scala101

object HelloWorld {
  def main(args:Array[String]) {
    var message = "Hello"
    message += " world!"

    println(message.toUpperCase().reverse)
  }
}
