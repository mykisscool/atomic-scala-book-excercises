import com.atomicscala.AtomicTest._

class SimpleTime(val hours: Int, val minutes: Int) {

  def -(dt: SimpleTime): SimpleTime = {

    if (hours < dt.hours
      || ((hours == dt.hours) && minutes < dt.minutes)) {

      new SimpleTime(0, 0)
    }
    else {

      var newHours: Int = hours - dt.hours
      var newMinutes: Int = minutes - dt.minutes

      if (minutes < dt.minutes) {
        newHours = newHours - 1
        newMinutes = (60 + minutes) - dt.minutes
      }

      new SimpleTime(newHours, newMinutes)
    }
  }
}

val someT1 = new SimpleTime(10, 30)
val someT2 = new SimpleTime(9, 30)
val someST = someT1 - someT2

someST.hours is 1
someST.minutes is 0

val someST2 = new SimpleTime(10, 30) - new SimpleTime(9, 45)

someST2.hours is 0
someST2.minutes is 45

/* Next excercise ... */

class FancyNumber1(num: Int) {
  def power(n: Int) = scala.math.pow(num, n).toInt
}

val a1 = new FancyNumber1(2)
a1.power(3) is 8

val b1 = new FancyNumber1(10)
b1.power(2) is 100

/* Next excercise ... */

class FancyNumber2(num: Int) {
  def power(n: Int) = scala.math.pow(num, n).toInt
  def ^(n: Int) = scala.math.pow(num, n).toInt
}

val a2 = new FancyNumber2(2)
a2.^(3) is 8

val b2 = new FancyNumber2(10)
b2 ^ 2 is 100

/* Next excercise ... */

class FancyNumber3(num: Int) {

  def this(num: Double) {
    this(num.toInt)
  }

  def power(n: Int) = scala.math.pow(num, n).toInt
  def ^(n: Int) = scala.math.pow(num, n).toInt
  def **(n: Int) = scala.math.pow(num, n).toInt
}

val a3 = new FancyNumber3(2.0)
a3.**(3) is 8

val b3 = new FancyNumber3(10.0)
b3 ** 2 is 100

