import com.atomicscala.AtomicTest._

object MonthName extends Enumeration {
  type MonthName = Value
  val January, February, March, April, May, June, July, August, September,
    October, November, December = Value
}

MonthName.February  is "February"
MonthName.February.id is 1

/* Next excercise ... */

object MonthName2 extends Enumeration {
  type MonthName2 = Value

  val January = Value(1)
  val February, March, April, May, June, July, August, September,
  October, November, December = Value
}

MonthName2.February is "February"
MonthName2.February.id is 2
MonthName2.December.id is 12
MonthName2.July.id is 7

/* Next excercise ... */

import MonthName2._

def monthNumber(monthName: MonthName2) = monthName.id

July is "July"
monthNumber(July) is 7

/* Next excercise ... */

def season(monthName: MonthName2) = monthName match {
  case December | January | February => "Winter"
  case March | April | May => "Spring"
  case June | July | August => "Summer"
  case September | October | November => "Autumn"
  case _ => "?"
}

season(January) is "Winter"
season(April) is "Spring"
season(August) is "Summer"
season(November) is "Autumn"

/* Next excercise ... */

object moveType extends Enumeration {
  type moveType = Value
  val X, O, Unset = Value
}

class Cell {
  var entry = moveType.Unset

  def set(e: moveType.moveType): String = {
    if (entry == moveType.Unset && (e == moveType.X || e == moveType.O)) {
      entry = e

      "successful move"
    }
    else "invalid move"
  }
}

class Grid {
  val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )

  def play(e: moveType.moveType, x: Int, y: Int): String = {
    if (x < 0 || x > 2 || y < 0 || y > 2) "invalid move"
    else
      cells(x)(y).set(e)
  }
}

val grid = new Grid
grid.play(moveType.X, 1, 1) is "successful move"
grid.play(moveType.X, 1, 1) is "invalid move"
grid.play(moveType.X, 1, 3) is "invalid move"

/* Next excercise ... */

object Level extends Enumeration {
  type Level = Value
  val Overflow, High, Medium, Low, Empty = Value
  val Draining, Pooling, Dry = Value
}

import Level._

{
  for (n <- Range(0, Level.maxId)) yield (n, Level(n))
} is Vector((0, Overflow), (1, High), (2, Medium), (3, Low), (4, Empty),
  (5, Draining), (6, Pooling), (7, Dry))

{
  for(lev<-Level.values) yield lev
}.toIndexedSeq is Vector(Overflow, High, Medium, Low, Empty, Draining, Pooling, Dry)

def checkLevel(level: Level) = level match{
  case Overflow => ">>> Overflow!"
  case Empty | Dry => "Alert"
  case Pooling => "Warning!"
  case other => s"Level $level OK"
}

Level.Draining is Draining
Level.Draining.id is 5

checkLevel(Low) is "Level Low OK"
checkLevel(Empty) is "Alert"
checkLevel(Draining) is "Level Draining OK"
checkLevel(Pooling) is "Warning!"
checkLevel(Dry) is "Alert"
