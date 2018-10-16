import com.atomicscala.AtomicTest._

class Coffee(val shots: Int = 2,
             val decaf: Int = 0,
             val milk: Boolean = false,
             val toGo: Boolean = false,
             val syrup: String = "") {

  var result = ""
  println(caf, decaf, milk, toGo, syrup)

  def getCup(): Unit = {
    result += (if (toGo) "ToGoCup " else "HereCup ")
  }

  def pourShots(): Unit = {
    for(s <- 0 until shots) {
      result += (if (decaf > 0) "decaf shot " else "shot ")
    }
  }

  def caf(): Int = {
    shots - decaf
  }

  def addMilk():Unit = {
    if (milk) {
      result += "milk "
    }
  }

  def addSyrup():Unit = {
    result += syrup
  }

  getCup()
  pourShots()
  addMilk()
  addSyrup()
}

val doubleHalfCaf = new Coffee(shots=2, decaf=1)
val tripleHalfCaf = new Coffee(shots=3, decaf=2)

doubleHalfCaf.decaf is 1
doubleHalfCaf.caf is 1
doubleHalfCaf.shots is 2

tripleHalfCaf.decaf is 2
tripleHalfCaf.caf is 1
tripleHalfCaf.shots is 3

/* Next excercise ... */

class Tea(val name: String = "Earl Grey",
          val decaf: Boolean = false,
          val sugar: Boolean = false,
          val milk: Boolean = false) {

  val nameDescription = (if (decaf) " decaf" else "") +
    (if (milk) " + milk" else "") +
    (if (sugar) " + sugar" else "")

  def describe(): String = {
    name + nameDescription
  }

  def calories: Int = {
    (if (sugar) 16 else 0) + (if (milk) 100 else 0)
  }
}

val tea = new Tea
tea.describe is "Earl Grey"
tea.calories is 0
tea.name is "Earl Grey"

val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
lemonZinger.describe is "Lemon Zinger decaf"
lemonZinger.calories is 0
lemonZinger.decaf is true

val sweetGreen = new Tea(name="Jasmine Green", sugar=true)
sweetGreen.describe is "Jasmine Green + sugar"
sweetGreen.calories is 16
sweetGreen.sugar is true

val teaLatte = new Tea(sugar=true, milk=true)
teaLatte.describe is "Earl Grey + milk + sugar"
teaLatte.calories is 116
teaLatte.milk is true
