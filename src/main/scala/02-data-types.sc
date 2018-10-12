val intVal: Int = 5
println(intVal)

val stringVal: String = "ABC1234"
println(stringVal)

val dblVal: Double = 5.4
println(dblVal)

val boolVal: Boolean = true
println(boolVal)

val multiLineString: String = """One
Two
Three"""
println(multiLineString)

// Expression of type String doesn't conform to expected type Boolean
// val wontWork: Boolean = "maybe"

// Expression of type Double doesn't conform to expected type Int
// val doubleAsInt: Int = 15.4

// Adds a ".0"
val intAsDouble: Double = 15
println(intAsDouble)
