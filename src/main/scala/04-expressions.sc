val feetPerMile: Int = {
  5280
}

val yardsPerMile: Double = {
  feetPerMile / 3.0
}

val miles: Double = {
  2000 / yardsPerMile
}

val newMiles: Double = {
  val newFeetPerMile: Int = 5280
  val newYardsPerMile: Double = newFeetPerMile / 3.0

  2000 / newYardsPerMile
}

println(miles)
println(newMiles)
