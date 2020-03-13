package pl.balcerek.nbd

object Zadanie9 extends App {

  //  9. Zdefiniuj funkcję, przyjmującą listę liczb całkowitych i zwracającą wygenerowaną
  //  na jej podstawie listę, w której wszystkie liczby zostały zwiększone o 1.
  //  Wykorzystaj mechanizm mapowania kolekcji.

  println(incrementElements(List(1, 4, 5, -1)))

  private def incrementElements(list: List[Int]): List[Int] = {
    list.map(_ + 1)
  }

}
