import com.atomicscala.AtomicTest._

class GardenGnome(val height: Double,
                  val weight: Double,
                  val happy: Boolean) {

  var painted = true

  def this(name: String) = {
    this(15.0, 100.0, true)
  }

  def show():String = {
    s"$height,$weight,${happy.toString},${painted.toString}"
  }
}

val gnome = new GardenGnome(20.0, 110.0, false)
gnome.show() is "20.0,110.0,false,true"

val bob = new GardenGnome("Bob")
bob.show() is "15.0,100.0,true,true"

/* Next excercise ... */

class GardenGnome2(val height: Double,
                   val weight: Double,
                   val happy: Boolean) {

  var painted = true

  def this(name: String) = {
    this(15.0, 100.0, true)
  }

  def magic(level: Int): String = {
    s"Poof! $level"
  }

  def show(level: Int):String = {
    s"${magic(level)},${happy.toString},${painted.toString}"
  }
}

val gnome2 = new GardenGnome2(20.0, 50.0, false)
gnome2.show(87) is "Poof! 87,false,true"

val bob2 = new GardenGnome2("Bob")
bob2.show(25) is "Poof! 25,true,true"

/* Next excercise ... */

class GardenGnome3(val height: Double,
                   val weight: Double,
                   val happy: Boolean) {

  var painted = true

  def this(name: String) = {
    this(15.0, 100.0, true)
  }

  def show():String = {
    s"height: $height weight: $weight happy: ${happy.toString} painted: ${painted.toString}"
  }
}

val gnome3 = new GardenGnome3(20.0, 110.0, false)
gnome3.show() is "height: 20.0 weight: 110.0 happy: false painted: true"

val bob3 = new GardenGnome3("Bob")
bob3.show() is "height: 15.0 weight: 100.0 happy: true painted: true"
