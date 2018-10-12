val r1 = Range(0, 10)
println(r1.step)

val r2 = Range(0, 10, 2)
println(r2.step)

/* Next excercise ... */

val s0: String = "This is an experiment"
val a0: Array[String] = s0.split(" ")

/* Next excercise ... */

var s1 = "Sally"
var s2 = "Sally"

if (s1.equals(s2)) {
  println("s1 and s2 are equal")
}
else {
  println("s1 and s2 are not equal")
}

/* Next excercise ... */

s2 = "Sam"

if (s1.equals(s2)) {
  println("s1 and s2 are equal")
}
else {
  println("s1 and s2 are not equal")
}

/* Next excercise ... */

val s3: String = s1.toUpperCase()

if (s1.contentEquals(s3)) {
  println("s1 and s3 are equal")
}
else {
  println("s1 and s3 are not equal")
}