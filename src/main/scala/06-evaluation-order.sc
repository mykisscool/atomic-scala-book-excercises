val sky: String = "sunny"
val temperature: Double = 91

val goodWeather: Boolean = sky == "sunny" && temperature > 80
println(goodWeather)

val alsoGoodWeather: Boolean =
  (sky == "sunny" || sky == "partly cloudy") && temperature > 80
println(alsoGoodWeather)

val lastGoodWeather = (sky == "sunny" || sky == "partly cloudy") &&
  (temperature > 80 || temperature < 20)
println(lastGoodWeather)

val tempInCelsius: Double = (temperature - 32) * (5.0 / 9)
println(tempInCelsius)

val tempInFahrenheit: Double = tempInCelsius * (9.0 / 5) + 32
println(tempInFahrenheit)
