class Person(val first: String, val last: String) {
  def name: String = first + " " + last
}

object Person {

  def apply(fullName: String): Person = fullName.split("\\s") match {
    case Array(firstName, lastName) => new Person(firstName, lastName)
    case _ => new Person("", "")
  }

}

val dave = new Person("Dave", "Gurnell")
