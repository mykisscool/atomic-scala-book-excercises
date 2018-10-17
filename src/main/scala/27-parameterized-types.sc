import com.atomicscala.AtomicTest._

def explicitDouble(d1: Double, d2: Double, d3: Double): Vector[Double] = { Vector(d1, d2, d3) }

explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)

/* Next excercise ... */

def explicitList(v1: Vector[Double]): List[Double] = { v1.toList }

explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)

/* Next excercise ... */

def explicitSet(v1: Vector[Double]): Set[Double] = { v1.toSet }

explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)

/* Next excercise ... */

def historicalData(v1: Vector[Int]): String = {

  var sunny = 0
  var mostlySunny = 0
  var partlySunny = 0
  var mostlyCloudy = 0
  var cloudy = 0
  var unknown = 0

  for (t <- v1) {
    t match {
      case 100 => sunny += 1
      case 80 => mostlySunny += 1
      case 50 => partlySunny += 1
      case 20 => mostlyCloudy += 1
      case 0 => cloudy += 1
      case _ => unknown += 1
    }
  }

  val dataString =
    (if (sunny > 0) s"Sunny=$sunny, " else "") +
    (if (mostlySunny > 0) s"Mostly Sunny=$mostlySunny, " else "") +
    (if (partlySunny > 0) s"Party Sunny=$partlySunny, " else "") +
    (if (mostlyCloudy > 0) s"Mostly Cloudy=$mostlyCloudy, " else "") +
    (if (cloudy > 0) s"Cloudy=$cloudy, " else "") +
    (if (unknown > 0) s"Unknown=$unknown, " else "")

  dataString.substring(0, dataString.length - 2)
}

historicalData(Vector(100, 80, 20, 100, 20)) is "Sunny=2, Mostly Sunny=1, Mostly Cloudy=2"
