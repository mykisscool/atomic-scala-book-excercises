import com.atomicscala.AtomicTest._

abstract class Animal {
  def templateMethod = s"The $animal goes $sound"
  def animal: String
  def sound: String
  def food: String
}

class Duck extends Animal {
  def animal = "Duck"
  override def sound = "Quack"
  def food = "plants"
}

class Cow extends Animal {
  def animal = "Cow"
  def sound = "Moo"
  override def food: String = "grass"
}

val duck = new Duck
duck.food is "plants"

val cow = new Cow
cow.food is "grass"

/* Next excercise ... */

class Chicken extends Animal {
  override def animal: String = "chicken"
  override def sound: String = "cluk cluk"
  override def food: String = "insects"
}

class Pig extends Animal {
  override def animal: String = "pig"
  override def sound: String = "oink oink"
  override def food: String = "anything"
}

val chicken = new Chicken
chicken.food is "insects"

val pig = new Pig
pig.food is "anything"

/* Next excercise ... */

abstract class Adder(x:Int) {
  def add(y: Int): Int
}

class NumericAdder(val x: Int) extends Adder(x) {
  def add(y: Int): Int = x + y
}

val num = new NumericAdder(5)
num.add(10) is 15

/* Next excercise ... */

case class Person(a: String, s: String, f: String) extends Animal {
  override def animal: String = a
  override def sound: String = s
  override def food: String = f
}

val person = Person("Human", "Hello", "pizza")
person.food is "pizza"

// Yes- case classes can inherit from abstract classes.

/* Next excercise ... */

class Turtle extends Animal {
  override def animal: String = "Turtle"
  override def sound: String = ""
  override def food: String = "Vegetables"
  def namedAnimal(name: String): String = animal + ": " + name
}

val turtle = new Turtle
turtle.namedAnimal("Leonardo") is "Turtle: Leonardo"
