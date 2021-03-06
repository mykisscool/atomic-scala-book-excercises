import com.atomicscala.AtomicTest._

class SimpleTime(val hours: Int, val minutes: Int)

val t = new SimpleTime(minutes = 30, hours = 5)

t.hours is 5
t.minutes is 30

/* Next excercise ... */

class SimpleTime2(val hours: Int, val minutes: Int = 0)

val t2 = new SimpleTime2(hours = 10)

t2.hours is 10
t2.minutes is 0

/* Next excercise ... */

class Planet(moons:Int = 1, name: String, description: String) {
  def hasMoon: Boolean = {
    if (moons >= 1) true else false
  }
}

val p = new Planet(name = "Mercury", description = "small and hot plant", moons = 0)

p.hasMoon is false

/* Next excercise ... */

// Change argument order; same outcome
val earth = new Planet(moons = 1, name = "Earth", description = "a hospitable planet")

earth.hasMoon is true

/* Next excercise ... */

/*
"Parameter section with *- parameter cannot have default arguments"

class FlexibleFamily(val mother: String = "Mom",
                     val father: String = "Dad",
                     val children: String*)
*/

/* Next excercise ... */

class Item(val name: String,
           val price: Double) {

  def cost(grocery: Boolean = false,
           medication: Boolean = false,
           taxRate: Double = 0.10): Double = {

    (price.toDouble * (if (grocery) 0 else taxRate)) + price
  }
}

val flour = new Item(name="flour", 4)
flour.cost(grocery=true) is 4

val sunscreen = new Item(name="sunscreen", 3)
sunscreen.cost() is 3.3

val tv = new Item(name="television", 500)
tv.cost(taxRate = 0.06) is 530
