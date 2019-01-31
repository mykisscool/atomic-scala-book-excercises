import com.atomicscala.AtomicTest._

abstract class Base {
   def f1: Int
   def f2: Int
   val d1: Int
   val d2: Int
   var d3: Int
   var n = 1
}

class Derived extends Base {
   def f1 = 1
   val f2 = 1 // Was def,now val
   val d1 = 1

   // Can't do this; must be a val:
   // def d2 = 1

   val d2 = 1
   def d3= n
   def d3_= (newVal: Int): Unit = n = newVal
}

val d = new Derived
d.d3 is 1 // Calls getter (line 21)
d.d3 = 42 // Calls setter (line 22)
d.d3 is 42

/* Next excercise ... */

// The uniform access principle demonstrated above DOES NOT work when Base is a concrete class
// Can't do this: "class Base {"

class Base2(var d3: Int) {
  def f1: Int = 99
  def f2: Int = 99
  val d1: Int = 99
  val d2: Int = 99
  var n = 1
}

class Derived2(d3: Int) extends Base2(d3) {
  override def f1 = 1
  override val f2 = 1
  override val d1 = 1
  override val d2 = 1
  // override def d3= n
  // def d3_= (newVal: Int): Unit = n = newVal
}

val d2 = new Derived2(1)
d2.d3 is 1
d2.d3 = 42
d2.d3 is 42

/* Next excercise ... */

class Mike {
  var x: Int = 100
  def internal: Int = x
  def internal_= (newVal2: Int): Unit = x = newVal2
}

val m = new Mike
m.internal is 100
m.internal = 200
m.internal is 200
