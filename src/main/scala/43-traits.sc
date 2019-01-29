import com.atomicscala.AtomicTest._

trait BatteryPower {
  def monitor(level: Int): String = {
    level match {
      case x if 0 until 19 contains x => "red"
      case x if 20 until 39 contains x => "yellow"
      case x if x >= 40 => "green"
      case _ => "?"
    }
  }
}

abstract class EnergySource
class Battery extends EnergySource with BatteryPower

val battery = new Battery

battery.monitor(80) is "green"
battery.monitor(30) is "yellow"
battery.monitor(10) is "red"

/* Next excercise ... */

trait Toy
class BatteryPoweredToy extends Toy with BatteryPower

val toy = new BatteryPoweredToy
toy.monitor(50) is "green"

/* Next excercise ... */

val toy2 = new Toy with BatteryPower
toy2.monitor(50) is "green"
