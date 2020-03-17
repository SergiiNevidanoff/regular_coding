class Person(first:String, last:String){
val firstName = first
val lastName = last
def name = firstName + " " + lastName
}

object Person{

  def apply(fullName:String) = fullName.map(full -> {
    val parts = full.split(" ")
    new Person(full(0), full(1)
  }

}

class PersonShort(val firstName:String, val lastName:String){
  def name = firstName + " " + lastName
}


val dave = new Person("Dave","Gurnell")
