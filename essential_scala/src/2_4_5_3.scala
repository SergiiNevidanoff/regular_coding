object calc{
  def square(num:Int) = num * num

  def cube(num:Int) = square(num)*num
 
  def square(num:Double) = num * num

  def cube(num:Double) = square(num)*num
}

println(s"10^2 = ${calc.square(10)}")
println(s"10^3 = ${calc.cube(10)}")
println(s"92.1^2 = ${calc.square(92.1)}")
println(s"12.5^3 = ${calc.cube(12.5)}")
