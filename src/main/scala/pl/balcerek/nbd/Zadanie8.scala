package pl.balcerek.nbd

object Zadanie8 extends App {

  //  8. Napisz funkcję usuwającą zera z listy wartości całkowitych
  //  (tzn.zwracającą nową listę,zawierającą wartościz oryginalnej listy z wyjątkiem “0”)

  println(removeZeros(List(1, 3, 0, 0, 0, 3, -1, 0)))

  private def removeZeros(list: List[Int]): List[Int] = {
    list.filter(_ != 0)
  }

}
