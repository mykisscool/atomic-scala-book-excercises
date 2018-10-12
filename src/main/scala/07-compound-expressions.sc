val a: Int = 1
val b: Int = 5
val c: Int = 5

if (a <= c) {
  println("a is less than or equal to c")
}
else {
  println("a is not less than or equal to c")
}

if (b <= c) {
  println("b is less than or equal to c")
}
else {
  println("b is not less than or equal to c")
}

/* Next excersise ... */

if (a <= c && b <= c) {
  println("Both are")
}

if (a <= c || b <= c) {
  println("One is and one isn't")
}

// CompoundExpressions2.scala
val hour = 10

// true and true
val activity: String = "swimming"
val temperature: Int = 81

// true and false
// val activity: String = "swimming"
// val temperature: Int = 101

// true and true
// val activity: String = "ice skating"
// val temperature: Int = 25

// true and false
// val activity: String= "ice skating"
// val temperature: Int = 1

val isOpen = {
  if (activity == "swimming" || activity == "ice skating") {

    val opens = 9
    val closes = 20

    println("Operating hours: " + opens + " - " + closes)

    if (hour >= opens && hour <= closes) {
      true
    }
    else {
      false
    }
  }
  else {
    false
  }
}

val goodTemperature: Boolean = {
  if (activity == "swimming") {

    val lowTemperature = 70
    val highTemperature = 95

    if (temperature >= lowTemperature && temperature <= highTemperature) {
      true
    }
    else {
      false
    }
  }
  else if (activity == "ice skating") {

    val lowTemperature = 10
    val highTemperature = 30

    if (temperature >= lowTemperature && temperature <= highTemperature) {
      true
    }
    else {
      false
    }
  }
  else {
    false
  }
}

val doActivity = isOpen && goodTemperature

println(activity + ": " + isOpen + " && " + goodTemperature + " = " + doActivity)

/* Next excercise ... */

val distance: Double = 5
val newActivity: String = "running"

val willDo = {
  if (newActivity == "swimming" && distance < 1) {
    true
  }
  else if (newActivity == "running" && distance < 6) {
    true
  }
  else if (newActivity == "biking" && distance < 20) {
    true
  }
  else {
    false
  }
}

println(activity + ": " + willDo)
