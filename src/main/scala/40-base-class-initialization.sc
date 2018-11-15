import com.atomicscala.AtomicTest._

class GreatApe(val weight: Double,
               val age: Int,
               val height: Int)

class Bonobo(weight: Double,
             age: Int,
             height: Int)
  extends GreatApe(weight, age, height)

class Chimpanzee(weight: Double,
                 age: Int,
                 height: Int)
  extends GreatApe(weight, age, height)

class BonoboB(weight: Double,
              age: Int,
              height: Int)
  extends Bonobo(weight, age, height)

class BonoboC(weight: Double,
              age: Int,
              height: Int)
  extends BonoboB(weight, age, height)

def display(ape: GreatApe) = s"weight: ${ape.weight} age: ${ape.age} height: ${ape.height}"

display(new BonoboC(100, 12, 55)) is "weight: 100.0 age: 12 height: 55"

/* Next excercise ... */

class GreatApe2(val weight: Double, val age: Int, val height: Int) {
  def someMethod = "Testing testing 1 2 3."
}

class BonoboD(weight: Double, age: Int, height: Int)
  extends GreatApe2(weight, age, height) {
    override def toString = someMethod
}

new BonoboD(100, 12, 55) is "Testing testing 1 2 3."

/* Next excercise ... */

class House(val address: String,
            val state: String,
            val zip: String) {
  def this(state: String, zip: String) = this("address?", state, zip)
  def this(zip:String) = this("address?", "state?", zip)
}

class Home(address: String,
           state: String,
           zip: String,
           val heart: Boolean = true)
  extends House(address, state, zip) {
  override def toString = if (heart) "Where the heart is" else ""
}

val h = new Home("888 N. Main St.", "KS", "66632")

h.toString is "Where the heart is"
h.heart is true

/* Next excercise ... */

class VacationHouse(state: String,
                    zip: String,
                    val startMonth: Int,
                    val endMonth:Int)
  extends House(state, zip) {

  private def getMonth(m: Int) = {
    m match {
      case 1 => "January"
      case 2 => "February"
      case 3 => "March"
      case 4 => "April"
      case 5 => "May"
      case 6 => "June"
      case 7 => "July"
      case 8 => "August"
      case 9 => "September"
      case 10 => "October"
      case 11 => "November"
      case 12 => "December"
      case _ => "Unknown"
    }
  }

  override def toString = s"Rented house in $state for months of ${getMonth(startMonth)} " +
    s"through ${getMonth(endMonth)}."
}

val v = new VacationHouse("MI", "49431", 6, 8)
v is "Rented house in MI for months of June through August."

/* Next excercise ... */

class Trip(val origin: String,
           val destination: String,
           val startDate: String,
           val endDate: String) {

  override def toString = s"From $origin to $destination: $startDate to $endDate"
}

class AirplaneTrip(origin: String,
                  destination: String,
                  startDate: String,
                  endDate: String,
                  movie: String)
  extends Trip(origin, destination, startDate, endDate) {

  override def toString = s"On a flight from $origin to $destination, we watched $movie"
}

class CarTrip(cities: List[String],
              startDate: String,
              endDate: String)
  extends Trip(cities.head, cities.last, startDate, endDate)


val t = new Trip("Detroit", "Houston", "5/1/2012", "6/1/2012")
val a = new AirplaneTrip("Detroit", "London", "9/1/1939", "10/31/1939", "Superman")

val cities = List("Boston", "Albany", "Buffalo", "Cleveland", "Columbus", "Indianapolis", "St. Louis",
  "Kansas City", "Denver", "Grand Junction", "Salt Lake City", "Las Vegas", "Bakersfield", "San Francisco")

val c = new CarTrip(cities, "6/1/2012", "7/1/2012")



c.origin is "Boston"
c.destination is "San Francisco"
c.startDate is "6/1/2012"

t is "From Detroit to Houston: 5/1/2012 to 6/1/2012"
a is "On a flight from Detroit to London, we watched Superman"
c is "From Boston to San Francisco: 6/1/2012 to 7/1/2012"

/* Next excercise ... */

case class Mike(origin: String)
class Child(origin: String) extends Mike(origin)

// This works
val sh = new Child("Buffalo")
sh is "Mike(Buffalo)"

/* Next excercise ... */

case class Mike2(origin: String)

// case class Child2(origin: String) extends Mike(origin)
// This does not work
// case class Child has case ancestor A$A5.A$A5Mike, but case-to-case inheritance is prohibited. To overcome this limitation, use extractors to pattern match on non-leaf nodes.
