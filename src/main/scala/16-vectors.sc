import com.atomicscala.AtomicTest._

val v1 = Vector(1, 2, 3, 4.0, 5)
val v2 = Vector("a", "b", "c", "d")
val v3 = Vector("1", "2", "three", 4, "five")

/* Next excercise ... */

val v4 = Vector(Vector(1, 2, 3), Vector(4, 5, 6))

/* Next excercise ... */

val strings = Vector("The", "dog", "visited", "the", "firehouse")

for(s <- strings) {
  println(s)
}

var sentence: String = ""
for(s <- strings) {
  sentence += s + " "
}

sentence.toString() is "The dog visited the firehouse "


/* Next excercise ... */

val theString: String = sentence.replace("firehouse ", "firehouse!")
theString is "The dog visited the firehouse!"

/* Next excercise ... */

for(s <- strings) {
  println(s.reverse)
}

/* Next excercise ... */

for(s <- strings.reverse) {
  println(s)
}

/* Next excercise ... */

val v5 = Vector(1, 2, 3, 4, 5)
val v6 = Vector(6.0, 7.5, 9.0, 10.5, 12.0)

v5.sum is 15
v5.min is 1
v5.max is 5

v6.sum is 45.0
v6.min is 6.0
v6.max is 12

/* Next excercise ... */

val v7 = Vector("Michael", "Nicole", "Desmond", "Sydney", "Nolan", "Sawyer")
// println(v7.sum) // This will not work
println(v7.min)
println(v7.max)

/* Next excercise ... */
val r1 = Range(0, 10).inclusive.sum
r1 is 55

/* Next excercise ... */

val l1 = List(1, 2, 3, 4.0, 5)
val l2 = List("a", "b", "c", "d")
val l3 = List("1", "2", "three", 4, "five")

val s1 = Set(1, 2, 3, 4.0, 5)
val s2 = Set("a", "b", "c", "d")
val s3 = Set("1", "2", "three", 4, "five")

/* Next excercise ... */

println(l2.sorted)
println(l2.reverse)

// These methods don't exist for Set
// println(s2.sorted)
// println(s2.reverse)

/* Next excercise ... */

val myVector1 = Vector(1, 2, 3, 4, 5, 6)
val myVector2 = Vector(1, 2, 3, 4, 5, 6)

myVector1 is myVector2
