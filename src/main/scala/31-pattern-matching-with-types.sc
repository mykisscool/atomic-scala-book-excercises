import com.atomicscala.AtomicTest._

case class Person(name: String)

def plus1(x: Any): Any = {
  x match {
    case s: String => s + "s"
    case i: Int =>  i + 1
    case p: Person => s"$p + guest"
  }
}

plus1("car") is "cars"
plus1(67) is 68
plus1(Person("Joanna")) is "Person(Joanna) + guest"

/* Next excercise ... */

def convertToSize(x: Any): Any = {
  x match {
    case i: Int => i
    case d: Float => d
    case s: String => s.length
    case p: Person => 1
    case _ => 0
  }
}

convertToSize(45) is 45
convertToSize("car") is 3
convertToSize("truck") is 5
convertToSize(Person("Joanna")) is 1
convertToSize(45.6F) is 45.6F
convertToSize(Vector(1, 2, 3)) is 0

/* Next excercise ... */

def convertToSize2(x: Any): Any = {
  x match {
    case i: Int => i
    case d: Float => scala.math.round(d)
    case s: String => s.length
    case p: Person => 1
    case _ => 0
  }
}

convertToSize2(45) is 45
convertToSize2("car") is 3
convertToSize2("truck") is 5
convertToSize2(Person("Joanna")) is 1
convertToSize2(45.6F) is 46
convertToSize2(Vector(1, 2, 3)) is 0

/* Next excercise ... */

def quantify(n: Any): String = {
  val x = n match {
    case i: Int => i
    case d: Double => d
  }

  if (x < 100) "small"
  else if (x >= 100 && x < 1000) "medium"
  else "large"
}

quantify(100) is "medium"
quantify(20.56) is "small"
quantify(100000) is "large"
quantify(-15999) is "small"

/* Next excercise ... */

def forecast(percentage: Int): String = {
  percentage match {
    case _ if percentage > 80 => "Sunny"
    case _ if percentage > 50 => "Mostly Sunny"
    case _ if percentage > 20 => "Partly Sunny"
    case _ if percentage > 0 => "Mostly Cloudy"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }
}

forecast(100) is "Sunny"
forecast(81) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(51) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(21) is "Partly Sunny"
forecast(20) is "Mostly Cloudy"
forecast(1) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(-1) is "Unknown"
