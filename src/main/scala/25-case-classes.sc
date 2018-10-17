import com.atomicscala.AtomicTest._

case class Person(first: String, last: String, email: String)

val p = Person("Jane", "Smile", "jane@smile.com")

p.first is "Jane"
p.last is "Smile"
p.email is "jane@smile.com"

/* Next excercise ... */

val people = Vector(
  Person("Jane", "Smile", "jane@smile.com"),
  Person("Ron", "House", "ron@house.com"),
  Person("Sally", "Dove", "sally@dove.com"))

people(0) is "Person(Jane,Smile,jane@smile.com)"
people(1) is "Person(Ron,House,ron@house.com)"
people(2) is "Person(Sally,Dove,sally@dove.com)"

/* Next excercise ... */

case class Dog(name: String, breed: String)

val dogs = Vector(
  Dog("Fido", "Golden Lab"),
  Dog("Ruff", "Alaskan Malamute"),
  Dog("Fifi", "Miniature Poodle")
)

dogs(0) is "Dog(Fido,Golden Lab)"
dogs(1) is "Dog(Ruff,Alaskan Malamute)"
dogs(2) is "Dog(Fifi,Miniature Poodle)"

/* Next excercise ... */

case class Dimension(var height: Integer, var width: Integer)

val c = new Dimension(5,7)

c.height is 5

c.height = 10
c.height is 10

c.width = 19
c.width is 19

/* Next excercise ... */

case class Dimension2(height: Integer, var width: Integer)
val c2 = Dimension2(5, 7)

c2.width = 20

// Reassignment to val
// c2.height = 9

/* Next excercise ... */

case class SimpleTimeDefault(hours: Int, minutes: Int = 0) {

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

val anotherT1 = SimpleTimeDefault(10, 30)
val anotherT2 = SimpleTimeDefault(9)

// SimpleTimeDefault(9,0)
// println(anotherT2)

val anotherST = anotherT1.subtract(anotherT2)

anotherST.hours is 1
anotherST.minutes is 30

val anotherST2 = SimpleTimeDefault(10).subtract(SimpleTimeDefault(9, 45))

anotherST2.hours is 0
anotherST2.minutes is 15

// SimpleTimeDefault(0,15)
// println(anotherST2)
