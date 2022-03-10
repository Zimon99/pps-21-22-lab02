package u02

object Es3 extends App:

  // 3a | Function literal (lambda).
  val parityLambda: Int => String =
  x => if x % 2 == 0 then "Even" else "Odd"

  // Method syntax
  def paritySyntax (x: Int): String = x match
    case x if x % 2 == 0 => "Even"
    case _ => "Odd"

  // 3b | neg function with lambda.
  def neg (x: String => Boolean) : String => Boolean =
    (e) => !x(e)

  // 3c | neg function with lambda for generic predicates.
  def genericNeg[A] (x:A=> Boolean): A => Boolean =
    (e) => !x(e)