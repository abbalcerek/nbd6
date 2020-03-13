package pl.balcerek.nbd

object Zadanie3 extends App {

  //  3. Zdefiniuj funkcję przyjmującą krotkę z 3 wartościami różnych typów i wypisującą je
  def printTuple[T1, T2, T3](tuple: (T1, T2, T3)): Unit = {
    println(tuple)
  }

  printTuple(1, "jeden", List(1))

}
