import com.atomicscala.AtomicTest._

class Exclaim(var s: String) {
  def parens() = { s + "!" }
  def noParens = s + "!"
}

val e = new Exclaim("yes")

e.noParens is "yes!"
e.parens() is "yes!"

/* Next excercise ... */

class Exclaim2(var s: String) {
  def parens() = s + "!"
  val noParens = s + "!"
}

val e2 = new Exclaim2("yes")

e2.noParens is "yes!"
e2.parens() is "yes!"

/* Next excercise ... */

class Exclaim3(var s: String) {
  def noParens= s + "!"
}

val e3 = new Exclaim3("yes")

e3.noParens is "yes!"

/* Next excercise ... */

class Exclaim4(var s: String) {

  var internalCount = 0

  def exclamation()= {
    internalCount = internalCount + 1
    s + "!"
  }

  def count = internalCount
}

val e4 = new Exclaim4("counting")

e4.exclamation()
e4.exclamation()

e4.count is 2
