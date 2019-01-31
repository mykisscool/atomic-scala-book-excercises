import com.atomicscala.AtomicTest._
import scala.reflect.runtime.currentMirror

object Name {
  def className(o: Any): String = {
    currentMirror.reflect(o).symbol.toString.replace('$', ' ').split(' ').last
  }
}

trait Name {
  override def toString: String = Name.className(this)
}

case class Mike(name: String)
val m = new Mike("Petruniak")
m is "Mike(Petruniak)"

case class Mike2(name: String) extends Name
val m2  = new Mike2("Petruniak")
m2 is "Mike2"

/* Next excercise ... */

// Yes- you can use reflection on a class that isn't a case class

class Mike3(val name: String) extends Name
val m3 = new Mike3("Petruniak")
m3 is "Mike3"

/* Next excercise ... */

object Name2 {
  def className(o: Any): String = {
    currentMirror.reflect(o).symbol.toString
  }
}

trait Name2 {
  override def toString: String = Name.className(this)
}

class Mike4(val name: String)
val m4 = new Mike4("Petruniak")
println(m4) // $line117.$read$$iw$$iw$$iw$$iw$Mike4@51ee36d

/* Next excercise ... */

trait AllAbstract {
  def f(n: Int): Int
  val d: Double
}

trait PartialAbstract {
  def f(n: Int): Int
  val d: Double
  def g(s: String) = s"($s)"
  val j = 42
}

trait Concrete {
  def f(n: Int) = n * 11
  val d = 1.61803
}

val x = new AllAbstract with PartialAbstract with Concrete with Name
x is "anon"
