val array = Array(1, 2, 3, 4, 5)
val total = (0 /: array) { _ + _ }
println(total)
