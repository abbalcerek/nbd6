package pl.balcerek.nbd

object Zadanie4 extends App {

  //  4. Zaprezentuj działanie Option na dowolnym przykładzie (np. mapy, w której wyszukujemy wartości po kluczu)
  val books = Map(
    "hamlet" -> 111.0)

  books.get("hamlet")
    .map(_.toInt)
    .foreach(v => println(s"value for hamlet exists $v"))
  books.get("makbet")
    .foreach(v => throw new Exception("There is not value for makbet so it will not be thrown"))

}
