package pl.balcerek.nbd

object Zadanie6 extends App {

  //  6. Zdefiniuj klasę KontoBankowe z metodami wplata i wyplata oraz własnością stanKonta
  //  - własność ma być tylko do odczytu. Klasa powinna udostępniać konstruktor przyjmujący początkowy
  //  stan konta oraz drugi, ustawiający początkowy stan konta na 0.
  val konto = new KontoBankowe(100)

  println(s"poczatkowa wartosc konta $konto")
  println(s"konto po wyplacie 20zl, ${konto.wplata(20)}")
  println(s"konto po wplacie 100 zl ${konto.wplata(100)}")

  try {
    konto.wyplata(10000)
  } catch {
    case e: IllegalArgumentException => println(s"Pruba wyplaty kwoty powyrzej limitu: $e")
  }


  case class KontoBankowe(private var _stanKonta: Double) {

    def this() {
      this(0)
    }

    def stanKonta: Double = _stanKonta


    def wplata(amount: Double): KontoBankowe = this.synchronized {
      _stanKonta += amount
      this
    }

    def wyplata(amount: Double): KontoBankowe = this.synchronized {
      if (_stanKonta < amount) {
        throw new IllegalArgumentException("Not enougth founds.")
      } else {
        _stanKonta = _stanKonta - amount
        this
      }
    }

  }

}
