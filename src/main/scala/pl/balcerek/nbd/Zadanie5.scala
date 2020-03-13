package pl.balcerek.nbd

object Zadanie5 extends App {

  //  5. Wykorzystaj Pattern Matching w funkcji przyjmującej parametr typu String. Dla stringów odpowiadających
  //  nazwom dni tygodnia funkcja ma zwrócić„Praca” i „Weekend” (odpowiednio dla dni roboczych i wolnych),
  //  dla pozostałych napisów „Nie ma takiego dnia”.
  def dniTygodnia(s: String): String = {
    s match {
      case "Poniedzialek" | "Wtorek"| "Sroda" | "Czwarted" | "Piatek" => "Praca"
      case "Sobota" | "Niedziela" => "Weekend"
      case _ => "Nie ma takiego dnia"
    }
  }

  println(dniTygodnia("Sroda"))
  println(dniTygodnia("Sobota"))
  println(dniTygodnia(""))

}
