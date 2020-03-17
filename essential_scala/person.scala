class Person(first:String, last:String){
val firstName = first
val lastName = last
def name = firstName + " " + lastName
}

class PersonShort(val firstName:String, val lastName:String){
  def name = firstName + " " + lastName
}

val dave = new Person("Dave","Gurnell")
