import com.atomicscala.AtomicTest._

var str = ""
val v = Vector(1, 2, 3, 4)
v.foreach(n => str += n)

str is "1234"

/* Next excercise ... */

str = ""
v.foreach(n => str += n + ",")

str is "1,2,3,4,"

/* Next excercise ... */

val dogYears = (n: Int) => n * 7
dogYears(10) is 70

/* Next excercise ... */

var s = ""
val v2 = Vector(1, 5, 7, 8)
v2.foreach(n => s += dogYears(n) + " ")

s is "7 35 49 56 "

/* Next excercise ... */

s = ""
v2.foreach(n => s += (n * 7) + " ")

s is "7 35 49 56 "

/* Next excercise ... */

val between = (x: Int, y: Int, z: Int) => if (x > y && x < z) true else false

between(70, 80, 90) is false
between(70, 60, 90) is true

/* Next excercise ... */

s = ""
val numbers = Vector(1, 2, 5, 3, 7)
numbers.foreach(n => s += (n * n) + " ")

s is "1 4 25 9 49 "

/* Next excercise ... */

val pluralize = (s: String) => s + "s"

pluralize("cat") is "cats"
pluralize("dog") is "dogs"
pluralize("silly") is "sillys"

/* Next excercise ... */

s = ""
val words = Vector("word", "cat", "animal")
words.foreach(w => s += pluralize(w) + " ")

s is "words cats animals "
