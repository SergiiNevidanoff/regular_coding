object person {
  val firstName = "First"
  val lastName = "Last"

}

object alien {
  def greet = println(s"Hello, ${person.firstName}")
}

alien.greet
