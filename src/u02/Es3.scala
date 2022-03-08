package u02

object Es3 extends App{

  // --------------------- ESERCIZIO 3a ----------------------
  // Function literal (lambda).
  val parity: Int => String =
  x => if x % 2 == 0 then "Even" else "Odd"

  // Method sintax
  def parity (x: Int): String = x match
    case x if x % 2 == 0 => "Even"
    case _ => "Odd"

  // --------------------- ESERCIZIO 3b ----------------------
  // neg function with lambda
  def neg (x: String => Boolean) : String => Boolean =
    (e: String) => !x(e)

  // --------------------- ESERCIZIO 3c ----------------------
  // neg for generic predicates
  def negGen[A] (x:A=> Boolean): A => Boolean =
    (e: A) => !x(e)

}
