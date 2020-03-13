package pl.balcerek.nbd

object Zadanie10 extends App {

  //  10. Stwórz funkcję przyjmującą listę liczb rzeczywistych i zwracającą stworzoną
  //  na jej podstawie listę zawierającą wartości bezwzględne elementów z oryginalnej
  //  listy należących do przedziału <-5,12>

  println(filterAndAbs(List(12, -5, 11.1, 4, 5, -1.1, 22, -7.1)))

  private def filterAndAbs(list: List[Double]): List[Double] = {
    list.filter(e => e >= -5 && e <= 12)
        .map(e => Math.abs(e))
  }

}
