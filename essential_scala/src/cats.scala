class Cat(name:String, colour:String,val food:String){

}

object ChipShop{
   
   def willServe(cat:Cat) = cat.food == "Chips"
  
}

val oswald = new Cat(name="Oswald", colour="Black", food="Milk")

val henderson = new Cat(name="Henderson", colour="Ginger", food="Chips")

val quentin = new Cat(name="Quentin", colour="Tabby and white", food="Curry")

