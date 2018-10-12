import com.petruniak.{EquilateralTriangle, RightTriangle}

// import com.petruniak._
// import com.petruniak.RightTriangle, com.petruniak.EquilateralTriangle

/*
import com.petruniak.{
  RightTriangle => Rt,
  EquilateralTriangle => Et
}
*/

val rt = new RightTriangle

println(rt.hypotenuse(3, 4))
println(rt.area(3, 4))

assert(rt.hypotenuse(3, 4) == 5)
assert(rt.area(3, 4) == 6)

/* Next excercise ... */

val et = new EquilateralTriangle

assert(et.area(5) == 10.83)

/* Next excercise ... */

/*
import com.petruniak.excersises._
import com.petruniak.excersises.{TestA, TestB, TestC}

val t1 = new TestA
val t2 = new TestB
val t3 = new TestC
*/

import com.petruniak.excersises.{
  TestA => A,
  TestB => B,
  TestC => C
}

val t1 = new A
val t2 = new B
val t3 = new C
