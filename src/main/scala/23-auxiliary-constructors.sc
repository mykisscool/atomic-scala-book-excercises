import com.atomicscala.AtomicTest._

class ClothesWasher(val model: String, val capacity: Double) {

  def this(model: String) {
    this(model, 1.0)
  }

  def this(capacity: Double) {
    this("General model", capacity)
  }

  def this() = {
    this("General model", 1.0)
  }
}

/* Next excercise ... */

class ClothesWasher2(val model: String = "General model", val capacity: Double = 1.0) {

  def this(model: String) {
    this(model, 1.0)
  }

  def this(capacity: Double) {
    this("General model", capacity)
  }

  def this() = {
    this("General model", 1.0)
  }
}

/* Next excercise ... */

class Test(val test:String) {
  def this() = {
    // 'this' expected
    // val otherTest:Boolean = true
    this("Test")
  }
}

/* Next excercise ... */

class ClothesWasher3(val model: String, val capacity: Double) {

  def this(model: String) {
    this(model, 1.0)
  }

  def this(capacity: Double) {
    this("General model", capacity)
  }

  def this() = {
    this("General model", 1.0)
  }

  def wash(bleach: Int = 0, fabricSoftener: Int = 0): String = {
    "Wash used " + bleach + " bleach and " + fabricSoftener + " fabric softener"
  }

  def wash(): String = {
    "Simple wash"
  }
}

val washer = new ClothesWasher3("LG 100", 3.6)

washer.wash(2, 1) is "Wash used 2 bleach and 1 fabric softener"
washer.wash() is "Simple wash"
