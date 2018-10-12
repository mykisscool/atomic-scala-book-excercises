val intVal: Int = 5

// Reassignment to val
// intVal = 10

var v1: Int = 5
v1 = 10

val constantv1 = v1
println(constantv1)

v1 = 15

// constantv1 did not change
println(constantv1)

// 5 ... not 15
var v2: Int = v1
v1 = 20

// v2 did not change
println(v2)
