import com.atomicscala.AtomicTest._

object WhenAmI extends App {
  hi
  println(new java.util.Date())
  def hi = print("Hello! It's: ")
}

/* Next excercise ... */

class Battery

object Battery extends App {
  def monitor(level: Int): String = {
    level match {
      case x if 0 until 19 contains x => "red"
      case x if 20 until 39 contains x => "yellow"
      case x if x >= 40 => "green"
      case _ => "?"
    }
  }

  Battery.monitor(80) is "green"
  Battery.monitor(30) is "yellow"
  Battery.monitor(10) is "red"
}

/* Next excercise ... */

// Command line arguments added in:
// Run > Edit Configurations... > Battery 2 > Program Arguments

object Battery2 {
  def main(args: Array[String]): Unit = {
    for(arg <- args)
      println(Battery.monitor(arg.toInt))
  }
}
