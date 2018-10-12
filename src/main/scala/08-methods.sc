def getSquare(x: Int): Int = {
  x * x
}

val a = getSquare(3)
assert(a == 9, "Expected 9, got " + a)

val b = getSquare(6)
assert(b == 36, "Expected 36, got " + a)

val c = getSquare(5)
assert(c == 25, "Expected 25, got " + a)

/////////////

def getSquareDouble(x: Double): Double = {
  x * x
}

val sd1 = getSquareDouble(1.2)
assert(1.44 == sd1, "Expected 1.44, got " + sd1)

val sd2 = getSquareDouble(5.7)
assert(32.49 == sd2, "Expected 32.49, got " + sd2)

/* Next excercise ... */

def isArg1GreaterThanArg2(d1: Double, d2: Double): Boolean = {
  if (d1 > d2) true else false
}

val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(t1 == false, "Expected false, got " + t1)

val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(t2 == true, "Expected true, got " + t2)

/* Next excercise ... */

def getMe(name: String): String = {
  name.toLowerCase
}

val g1 = getMe("abraCaDabra")
assert("abracadabra" == g1, "Expected abracadabra, got " + g1)

val g2 = getMe("zyxwVUT")
assert("zyxwvut"== g2, "Expected zyxwvut, got " + g2)

/* Next excercise ... */

def addStrings(s1: String, s2: String): String = {
  s1 + s2
}

val s1 = addStrings("abc", "def")
assert("abcdef" == s1, "Expected abcdef, got " + s1)

val s2 = addStrings("zyx", "abc")
assert("zyxabc" == s2, "Expected zyxabc, got " + s2)

/* Next excercise ... */

def manyTimesString(s: String, times: Int): String = {
  s * times
}

val m1 = manyTimesString("abc", 3)
assert("abcabcabc" == m1, "Expected abcabcabc, got " + m1)

val m2 = manyTimesString("123", 2)
assert("123123" == m2, "Expected 123123, got " + m2)

/* Next excercise ... */

def bmiStatus(weightInPounds: Double, heightInInches: Int): String = {
  val bmi = weightInPounds / (heightInInches * heightInInches) * 703.07

  if (bmi < 18.5) "Underweight"
  else if (bmi < 25) "Normal weight"
  else "Overweight"
}


val normal = bmiStatus(160, 68)
assert("Normal weight" == normal,
  "Expected Normal weight, Got " + normal)

val overweight = bmiStatus(180, 60)
assert("Overweight" == overweight,
  "Expected Overweight, Got " + overweight)

val underweight = bmiStatus(100, 68)
assert("Underweight" == underweight,
  "Expected Underweight, Got " + underweight)
