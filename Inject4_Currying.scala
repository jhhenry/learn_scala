def inject(arr: Array[Int], initial: Int)(operation: (Int, Int) => Int) = {
  var carryOver = initial
  arr.foreach(element => carryOver = operation(carryOver, element))
  carryOver
}

val arr1 = Array(2,3,5,1,6,4)
val sum = inject(arr1, 0) {(carryOver, element) => carryOver + element}
println(s"Sum: $sum")
