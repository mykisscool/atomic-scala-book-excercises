import com.atomicscala.AtomicTest._

class Cup2 {
  var percentFull = 0
  val max = 100

  def add(increase: Int): Int = {
    percentFull += increase

    if (percentFull > max) {
      percentFull = max
    }

    percentFull
  }
}

val cup2 = new Cup2

cup2.add(45) is 45
cup2.add(-15) is 30
cup2.add(-50) is -20

/* Next excercise ... */

class Cup3 {
  var percentFull = 0
  val max = 100
  val min = 0

  def add(increase: Int): Int = {
    percentFull += increase

    if (percentFull > max) {
      percentFull = max
    }

    if (percentFull < min) {
      percentFull = min
    }

    percentFull
  }
}

val cup3 = new Cup3

cup3.add(45) is 45
cup3.add(-55) is 0
cup3.add(10) is 10
cup3.add(-9) is 1
cup3.add(-2) is 0

/* Next excercise ... */

// This works
cup3.percentFull = 56
cup3.percentFull is 56

/* Next excercise ... */

class Cup4 {
  var percentFull = 0
  val max = 100
  val min = 0

  def add(increase: Int): Int = {
    percentFull += increase

    if (percentFull > max) {
      percentFull = max
    }

    if (percentFull < min) {
      percentFull = min
    }

    percentFull
  }

  def set(p: Int) = {
    percentFull = p
  }

  def get(): Int = {
    percentFull
  }

}

/* Next excercise */

val cup4 = new Cup4

cup4.set(56)
cup4.get() is 56