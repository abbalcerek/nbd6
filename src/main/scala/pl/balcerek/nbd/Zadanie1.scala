package pl.balcerek.nbd

object Zadanie1 extends App {

  // 1. Stwórz 7 elementową listę zawierającą nazwy dni tygodnia. Wypisz ją używając:
  val daysOfListAWeek = List(
    "Poniedzialek",
    "Wtorek",
    "Sroda",
    "Czwartek",
    "Piatek",
    "Sobota",
    "Niedziela"
  )

  //  a. Pętli for
  println("========== zadanie 1.a")
  for (d <- daysOfListAWeek) {
    println(d)
  }

  //  b. Pętli for wypisując tylko dniz nazwami zaczynającymi się na „P”
  println("========== zadanie 1.b")
  for (d <- daysOfListAWeek) {
    if (d.startsWith("P")) {
      println(d)
    }
  }

  //  c. Metody foreach
  println("========== zadanie 1.c")
  daysOfListAWeek.foreach(println)

  //    d. Pętli while
  println("========== zadanie 1.d")
  var i = 0;
  while (i < daysOfListAWeek.size) {
    println(daysOfListAWeek(i))
    i += 1;
  }

  //  e. Funkcji rekurencyjnej
  println("========== zadanie 1.e")
  def printList(list: List[String]) : Unit = {
    list match {
      case Nil =>
      case head::(tail: List[String]) => println(head); printList(tail)
    }
  }

  printList(daysOfListAWeek)

  //  f. Funkcji rekurencyjnej wypisując elementy listy od końca
  println("========== zadanie 1.f")
  def printReversedList(list: List[String]) : Unit = {
    list match {
      case Nil =>
      case head::(tail: List[String]) => printReversedList(tail); println(head)
    }
  }

  printReversedList(daysOfListAWeek)

  //  g. Metod foldl i foldr
  println("========== zadanie 1.g")
  daysOfListAWeek.foldLeft("")((acc, e) => {print(s"$e "); ""})
  println()

  daysOfListAWeek.foldRight("")((e, acc) => {print(s"$e "); acc})
  println()
  //  h. Metody foldl wypisując tylko dni z nazwami zaczynający
  println("========== zadanie 1.h")
  daysOfListAWeek.foldRight("")((e, acc) => {if (e.startsWith("P")) {println(e)} ; acc})

}
