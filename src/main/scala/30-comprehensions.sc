import com.atomicscala.AtomicTest._

def yielding2(v: List[Int]):List[Int] = {
  for {
    n <- v
    isOdd = n % 2 != 0

    if n < 10
    if isOdd
  } yield n
}

val theList = List(1, 2, 3, 4, 5, 6, 7,
  8, 10, 13, 14, 17)

yielding2(theList) is List(1, 3, 5, 7)

/* Next excercise ... */

def yielding3(v: Vector[Int]):Vector[Int] = {
  for {
    n <- v

    if n < 10
    if n % 2 != 0
  } yield n * 10 + 2
}

val v = Vector(1, 2, 3, 5, 6, 7, 8, 10,
  13, 14, 17)

yielding3(v) is Vector(12, 32, 52, 72)

/* Next excercise ... */

def yielding4(v: Vector[Int]):Vector[Int] = {

  // You can create these variables outside of the loop
  var n = 0
  var isOdd = false

  for {
    n <- v
    isOdd = n % 2 != 0

    // Reassignment to val
    // n += 1

    // Will not work
    // isOdd = n / 2

    if n < 10
    if isOdd
  } yield n * 10 + 2
}

val v2 = Vector(1, 2, 3, 5, 6, 7, 8, 10,
  13, 14, 17)

yielding3(v2) is Vector(12, 32, 52, 72)

/* Next excercise ... */

case class Activity(date: String, activity: String)

val activities = Vector(
  Activity("01-01", "Run"),
  Activity("01-03", "Ski"),
  Activity("01-04", "Run"),
  Activity("01-10", "Ski"),
  Activity("01-03", "Run"))

def getDates(activity: String, data: Vector[Activity]): Vector[String] = {

  var result = Vector[String]()

  for {
    n <- data
    if n.activity.equals(activity)
  } result = result :+ n.date

  result
}

getDates("Ski", activities) is Vector("01-03", "01-10")
getDates("Run", activities) is Vector("01-01", "01-04", "01-03")
getDates("Bike", activities) is Vector()

/* Next excercise ... */

def getActivities(date: String, data: Vector[Activity]): Vector[String] = {

  val result = for {
    n <- data
    if n.date.equals(date)
  } yield n.activity

  result
}

getActivities("01-01", activities) is Vector("Run")
getActivities("01-02", activities) is Vector()
getActivities("01-03", activities) is Vector("Ski", "Run")
getActivities("01-04", activities) is Vector("Run")
getActivities("01-10", activities) is Vector("Ski")
