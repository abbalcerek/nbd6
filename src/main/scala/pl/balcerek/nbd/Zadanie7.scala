package pl.balcerek.nbd

object Zadanie7 extends App {

//  7. Zdefiniuj klasę Osoba z własnościami imie i nazwisko. Stwórz kilka instancji tej klasy.
//  Zdefiniuj funkcję, która przyjmuje obiekt klasy osoba i przy pomocy Pattern Matching wybiera
//  i zwraca napis zawierający przywitanie danej osoby. Zdefiniuj 2-3 różne przywitania
//  dla konkretnych osób (z określonym imionami lub nazwiskami) oraz jedno domyślne.

  println(greet(Osoba("Bob", "Bobson")))
  println(greet(Osoba("Jan", "Kowalski")))
  println(greet(Osoba("Piotr", "Kwiatkowski")))

  private def greet(person: Osoba): String = {
    person match {
      case Osoba("Bob", s) => s"hello my name is Bob $s"
      case Osoba("Jan", s) => s"czesc nazywam sie Jan $s"
      case Osoba(n, s) => s"Hi Im $n $s"
      case _ => throw new IllegalStateException()
    }
  }

  case class Osoba(imie: String, nazwisko: String)

}
