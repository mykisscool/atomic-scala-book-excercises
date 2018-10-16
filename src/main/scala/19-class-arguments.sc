import com.atomicscala.AtomicTest._

class Family(members: String*) {

  def familySize: Int = {
    var i: Int = 0
    for (member <- members) {
      i += 1
    }

    i
  }
}

val family1 = new Family("Mom", "Dad", "Sally", "Dick")
family1.familySize is 4

val family2 = new Family("Dad", "Mom", "Harry")
family2.familySize is 3

/* Next excercise ... */

class FlexibleFamily(val mother: String, val father: String, val children: String*) {

  def familySize: Int = {
    var i: Int = 0
    for (child <- children) {
      i += 1
    }

    i + 2
  }
}

val family3 = new FlexibleFamily("Mom", "Dad", "Sally", "Dick")
family3.familySize is 4

val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
family4.familySize is 3

/* Next excercise ... */

class Cup2 (var percentFull: Int = 0)

val cup = new Cup2(percentFull = 25)
cup.percentFull is 25

/* Next excercise ... */

class Cup5 (var percentFull: Int = 0) {

  val min = 0
  val max = 100

  def increase(water: Int*): Int = {

    for (i <- water) {

      percentFull += i

      if (percentFull > max) {
        percentFull = max
      }

      if (percentFull < min) {
        percentFull = min
      }
    }

    percentFull
  }
}

val cup5 = new Cup5(0)

cup5.increase(20, 30, 50, 20, 10, -10, -40, 10, 50) is 100
cup5.increase(10, 10, -10, 10, 90, 70, -70) is 30

/* Next excercise ... */

def squareThem(nums: Int*): Int = {

  var total: Int = 0

  for (num <- nums) {
    total += (num * num)
  }

  total
}

squareThem(2) is 4
squareThem(2, 4) is 20
squareThem(1, 2, 4) is 21
