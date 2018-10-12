import com.atomicscala.AtomicTest._

def matchColor(color: String): String = {
  if (color == "red") {
    "RED"
  }
  else if (color == "blue") {
    "BLUE"
  }
  else if (color == "green") {
    "GREEN"
  }
  else {
    "UNKNOWN COLOR: " + color
  }
}

matchColor("white") is "UNKNOWN COLOR: white"
matchColor("blue") is "BLUE"

/* Next excercise ... */

def oneOrTheOther(exp: Boolean): String = {
  exp match {
    case true => "True!"
    case _ => "It's false"
  }
}

val v = Vector(1)
val v2 = Vector(3, 4)

oneOrTheOther(v == v.reverse) is "True!"
oneOrTheOther(v2 == v2.reverse) is "It's false"

/* Next excercise ... */

def checkTruth(exp1: Boolean, exp2: Boolean): String = {
  exp1 match {
    case true =>
      if (exp2) "Both are true" else "First: true, second: false"
    case false =>
      if (exp2) "First: false, second: true" else "Both are false"
  }
}

checkTruth(true || false, true) is "Both are true"
checkTruth(1 > 0 && -1 < 0, 1 == 2) is "First: true, second: false"
checkTruth(1 >= 2, 1 >= 1) is "First: false, second: true"
checkTruth(true && false, false && true) is "Both are false"

/* Next excercise ... */

def forecast(percentage: Int): String = {
  percentage match {
    case 100 => "Sunny"
    case 80 => "Mostly Sunny"
    case 50 => "Partly Sunny"
    case 20 => "Mostly Cloudy"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }
}

forecast(100) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(20) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(15) is "Unknown"

/* Next excercise ... */

val v1 = Vector(100, 50, 50, 20, 0, 15)

for (p <- v1) {
  println("Forecast for " + p + ": " + forecast(p))
}
