import com.atomicscala.AtomicTest._

/*

// f(Int) is already defined in the scope

class Overloading1 {
  def f(n: Int): Int = { 88 }
  def f(n: Int):Int = { n + 2 }
}

class Overloading2 {
  def f(n: Int): Int = { 99 }
  def f(n: Int):Int = { n + 3 }
}

*/

/* Next excercise ... */

class Overloading {
  def f(): Int = {
    0
  }

  def f(n: Int): Int = {
    n
  }

  /*
  // This will not work

  def f(n: Int): Double = {
    n
  }
  */

  def f(n1: Int, n2: Int): Int = {
    n1 + n2
  }

  def f(n1: Int, n2: Int, n3: Int): Int = {
    n1 + n2 + n3
  }

  def f(n1: Int, n2: Int, n3: Int, n4: Int): Int = {
    n1 + n2 + n3 + n4
  }
}

val o = new Overloading

o.f() is 0
o.f(1) is 1
o.f(1, 2) is 3
o.f(1, 2, 3) is 6
o.f(1, 2, 3, 4) is 10

