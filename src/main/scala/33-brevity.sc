import com.atomicscala.AtomicTest._

/*
def assignResult(arg:Boolean):Int = {
  val result = if(arg) 42 else 47
  result
}
*/

def assignResult(arg: Boolean): Int = { if (arg) 42 else 47 }

assignResult(true) is 42
assignResult(false) is 47

/* Next excercise ... */

def assignResult2(arg: Boolean): Int = if (arg) 42 else 47

assignResult2(true) is 42
assignResult2(false) is 47

/* Next excercise ... */

def assignResult3(arg: Boolean) = if (arg) 42 else 47

assignResult3(true) is 42
assignResult3(false) is 47

/* Next excercise ... */

class Coffee(val shots: Int = 2,
             val decaf: Boolean = false,
             val milk: Boolean = false,
             val toGo: Boolean = false,
             val syrup: String = "") {

  var result = ""

  println(shots, decaf, milk, toGo, syrup)

  def getCup() { result += (if (toGo) "ToGoCup " else "HereCup ") }
  def pourShots() { for (s <- 0 until shots) result += (if (decaf) "decaf shot " else "shot ") }
  def addMilk() { if (milk) result += "milk " }
  def addSyrup() { result += syrup }

  getCup()
  pourShots()
  addMilk()
  addSyrup()
}
