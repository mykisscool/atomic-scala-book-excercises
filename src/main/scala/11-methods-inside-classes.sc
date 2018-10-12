class Sailboat {
  def raise(): String = { "Sails raised" }
  def lower(): String = { "Sails lowered" }
}

class Motorboat {
  def on(): String = { "Motor on" }
  def off(): String = { "Motor off" }
}

val sailboat = new Sailboat
val motorboat = new Motorboat

val r1 = sailboat.raise()
assert(r1.equals("Sails raised"), "Expected Sails raised, Got " + r1)

val r2 = sailboat.lower()
assert(r2.equals("Sails lowered"), "Expected Sails lowered, Got " + r2)

val s1 = motorboat.on()
assert(s1.equals("Motor on"), "Expected Motor on, Got " + s1)

val s2 = motorboat.off()
assert(s2.equals("Motor off"), "Expected Motor off, Got " + s2)

/* Next excercise ... */

class Flare {
  def light(): String = {
    "Flare used!"
  }
}

val flare = new Flare
val f1 = flare.light

assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)

/* Next excercise ... */

class Sailboat2 {
  def raise(): String = { "Sails raised" }
  def lower(): String = { "Sails lowered" }

  def signal(): String = {
    val flare = new Flare
    flare.light()
  }
}

class Motorboat2 {
  def on(): String = { "Motor on" }
  def off(): String = { "Motor off" }

  def signal(): String = {
    val flare = new Flare
    flare.light()
  }
}

val sailboat2 = new Sailboat2
val motorboat2 = new Motorboat2

val signal = sailboat2.signal()
assert(signal == "Flare used!", "Expected Flare used! Got " + signal)


val flare2 = motorboat2.signal()
assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)
