import com.atomicscala.AtomicTest._
import scala.collection.immutable.VectorBuilder

val v = Vector(1, 2, 3, 4)
v.map(n => n * 11 + 10) is Vector(21, 32, 43, 54)

/* Next excercise ... */

// Vector v remains unchanged
v.foreach(n => n * 11 + 10)
println(v)

/* Next excercise ... */

var vb1 = new VectorBuilder[Int]()

for(i <- v) {
  vb1 += i * 11 + 10
}

vb1.result() is Vector(21, 32, 43, 54)

/* Next excercise ... */

var vb2 = new VectorBuilder[Int]()

for(n <- v) {
  vb2 += n + 1
}

vb2.result is Vector(2, 3, 4, 5)

/* Next excercise ... */

val v2 = Vector(1, 10, 100, 1000)
var i = 0

for(n <- v2) {
  i += n
}

i is 1111

/* Next excercise ... */

def sumIt(i: Int*): Int = i.reduce((sum, n) => sum + n)

sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195
