import com.atomicscala.AtomicTest._

class Dimension(var height: Int, var width: Int)

val c = new Dimension(5,7)

c.height is 5

c.height = 10
c.height is 10

c.width = 19
c.width is 19

/* Next excercise ... */

class Info(val name: String, var description: String)

val info = new Info("stuff", "Something")

info.name is "stuff"
info.description is "Something"

info.description = "Something else"
info.description is "Something else"

/* Next excercise ... */

class Info2(var name: String, var description: String)

val info2 = new Info2("stuff", "Something")

info2.name = "This is the new name"
info2.name is "This is the new name"

/* Next excercise ... */

class SimpleTime(val hours: Int, val minutes: Int) {

  def subtract(dt: SimpleTime): SimpleTime = {

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

val t1 = new SimpleTime(10, 30)
val t2 = new SimpleTime(9, 30)
val st = t1.subtract(t2)

st.hours is 1
st.minutes is 0

val st2 = new SimpleTime(10, 30).subtract(new SimpleTime(9, 45))

st2.hours is 0
st2.minutes is 45

val st3 = new SimpleTime(9, 30).subtract(new SimpleTime(10, 0))

st3.hours is 0
st3.minutes is 0

/* Next excercise ... */

class SimpleTimeDefault(val hours: Int, val minutes: Int = 0) {

  def subtract(dt: SimpleTimeDefault): SimpleTimeDefault = {

    if (hours < dt.hours
      || ((hours == dt.hours) && minutes < dt.minutes)) {

      new SimpleTimeDefault(0)
    }
    else {

      var newHours: Int = hours - dt.hours
      var newMinutes: Int = minutes - dt.minutes

      if (minutes < dt.minutes) {
        newHours = newHours - 1
        newMinutes = (60 + minutes) - dt.minutes
      }

      new SimpleTimeDefault(newHours, newMinutes)
    }
  }
}

val anotherT1 = new SimpleTimeDefault(10, 30)
val anotherT2 = new SimpleTimeDefault(9)
val anotherST = anotherT1.subtract(anotherT2)

anotherST.hours is 1
anotherST.minutes is 30

val anotherST2 = new SimpleTimeDefault(10).subtract(
  new SimpleTimeDefault(9, 45))

anotherST2.hours is 0
anotherST2.minutes is 15

/* Next excercise ... */

class SimpleTimeAux(val hours: Int, val minutes: Int) {

  def this(hours: Int) {
    this(hours, 0)
  }

  def subtract(dt: SimpleTimeAux): SimpleTimeAux = {

    if (hours < dt.hours
      || ((hours == dt.hours) && minutes < dt.minutes)) {

      new SimpleTimeAux(0)
    }
    else {

      var newHours: Int = hours - dt.hours
      var newMinutes: Int = minutes - dt.minutes

      if (minutes < dt.minutes) {
        newHours = newHours - 1
        newMinutes = (60 + minutes) - dt.minutes
      }

      new SimpleTimeAux(newHours, newMinutes)
    }
  }
}

val auxT1 = new SimpleTimeAux(10, 5)
val auxT2 = new SimpleTimeAux(6)
val auxST = auxT1.subtract(auxT2)

auxST.hours is 4
auxST.minutes is 5

val auxST2 = new SimpleTimeAux(12).subtract(new SimpleTimeAux(9, 45))

auxST2.hours is 2
auxST2.minutes is 15

/* Next excercise ... */

// No code in the class needs to change to use named arguments

val namedT1 = new SimpleTimeAux(minutes=5, hours=10)
val namedT2 = new SimpleTimeAux(hours=6)
val namedST = auxT1.subtract(auxT2)

namedST.hours is 4
namedST.minutes is 5

val namedST2 = new SimpleTimeAux(hours=12).subtract(new SimpleTimeAux(minutes=45, hours=9))

namedST2.hours is 2
namedST2.minutes is 15
