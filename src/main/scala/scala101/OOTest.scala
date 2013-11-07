package scala101

import java.util.UUID
import org.apache.log4j.Logger

object OOTest extends App {
  val user = new User()

  user.username = "Sam"

  println(user)
}

trait Loggable {
  self =>

  private val logger = Logger.getLogger(self.getClass)

  def debug(message:Any) {
    logger.debug(message)
  }

}

class User extends Entity with Loggable {
  var username = ""
  var password = ""

  override def toString() = {

    debug("in toString()!")

    "id = " + id + ", username=" + username
  }
}

abstract class Entity {
  val id = UUID.randomUUID()
}
