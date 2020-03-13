package pl.balcerek.nbd

object Rozwiazania {

  def main(args: Array[String]): Unit = {

    List(Zadanie1, Zadanie2, Zadanie3, Zadanie4, Zadanie5,
      Zadanie6, Zadanie7, Zadanie8, Zadanie9, Zadanie10)
      .zipWithIndex
      .foreach { case (z, i) =>
        println("----------------------------------")
        println(s"---------------- zadanie ${i + 1}")
        println("----------------------------------")

        z.main(Array())
      }
  }
}
