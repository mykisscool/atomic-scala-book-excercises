import com.atomicscala.AtomicTest._

val myValue1 = 20
val myValue2 = 10

// This fails
myValue1 is myValue2

/* Next excercise ... */

val myValue3 = 10
val myValue4 = 10

myValue3 is myValue4

/* Next excercise ... */

// They match
myValue2 is myValue3

/* Next excercise ... */

val myValue5: String = "10"

// This fails
myValue5 is myValue2

/* Next excercise ... */

def squareArea(x: Int): Int = { x * x }
def rectangleArea(x: Int, y: Int): Int = {x * y}
def trapezoidArea(x: Int, y: Int, h: Int): Double = {

  // Test found an error in method
  // (h / 2) * (x + y)

  (h.toDouble / 2) * (x + y)
}

squareArea(1) is 1
squareArea(2) is 4
squareArea(5) is 25

rectangleArea(2, 2) is 4
rectangleArea(5, 4) is 20

trapezoidArea(2, 2, 4) is 8
trapezoidArea(3, 4, 1) is 3.5
