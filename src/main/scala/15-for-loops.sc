import com.atomicscala.AtomicTest._

val r1 = Range(0, 10)
r1 is "Range 0 until 10"

/* Next excercise ... */

val r2 = Range(0, 10).inclusive
r2 is "Range 0 to 10"

/* Next excercise ... */

var total: Int = 0
for(i: Int <- Range(0, 10, 1).inclusive) {
  total += i
}

total is 55

/* Next excercise ... */

total = 0
for(i: Int <- Range(0, 11)) {
  if (i % 2 == 0) {
    total += i
  }
}

total is 30

/* Next excercise ... */
var evens: Int = 0
var odds: Int = 0

for(i: Int <- 0 to 10) {
  if (i % 2 == 0) {
    evens += i
  }
  else {
    odds += i
  }
}

evens is 30
odds is 25
