package com.petruniak

class EquilateralTriangle {

  def area(side: Double): Double = {
    BigDecimal((Math.sqrt(3) / 4) * (side * side)).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }
}
