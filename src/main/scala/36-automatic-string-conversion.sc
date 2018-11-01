import com.atomicscala.AtomicTest._

case class Bicycle(riders: Int) {
  override def toString = s"Bicycle built for $riders"
}

val forTwo = Bicycle(2)
forTwo is "Bicycle built for 2"

/* Next excercise ... */

case class Cycle(wheels: Int) {

  override def toString = wheels match {
    case 1 => "Unicycle"
    case 2 => "Bicycle"
    case 3 => "Tricycle"
    case 4 => "Quadricycle"
    case _ => s"Cycle with $wheels wheels"
  }
}

val c1 = Cycle(1)
c1 is "Unicycle"

val c2 = Cycle(2)
c2 is "Bicycle"

val cn = Cycle(5)
cn is "Cycle with 5 wheels"

/* Next excercise ... */

case class Cycle2(wheels: Int) {

  override def toString = wheels match {
    case 1 => "Unicycle"
    case 2 => "Bicycle"
    case 3 => "Tricycle"
    case 4 => "Quadricycle"
    case _ if wheels <= 0 => "That's not a cycle!"
    case _ => s"Cycle with $wheels wheels"
  }
}

Cycle2(-2) is "That's not a cycle!"
