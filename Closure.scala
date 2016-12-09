def loopThrough(number : Int) (closure : Int => Unit) {
  for (i <- 1 to number) { closure(i)}
}

var result = 0;
val addIt = { i:Int => result += i }

loopThrough(10) {elem => addIt(elem)}
println(s"Total of values from 1 to 10 is $result")

result = 0
loopThrough(5) {addIt}
println(s"Total of values from 1 to 5 is $result")

var product = 1
loopThrough(5) { product *= _ }
println(s"Total of values from 1 to 5 is $product")
