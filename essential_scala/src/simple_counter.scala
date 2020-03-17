class Counter(val start:Int = 0){

   def inc(delta:Int=1) = new Counter(start + delta)

   def dec(delta:Int = 1) = new Counter(start - delta)

   def apply(in:Int):Int = in + start

}

val counterResult = new Counter(10).inc.dec.inc.inc.dec

println(counterResult.start)
