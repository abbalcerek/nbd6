package pl.balcerek.nbd

object Zadanie2 extends App {

  //  2. Stwórz mapę z nazwami produktów i cenami. Na jej podstawie wygeneruj drugą,
  //  z 10% obniżką cen. Wykorzystaj mechanizm mapowania kolekcji.
  val products = Map(
    "Bike" -> 1000,
    "MotorBike" -> 10000,
    "Car" -> 100000
  )

  println(products.mapValues(p => p * 0.9))

}
