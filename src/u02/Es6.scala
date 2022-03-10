package u02

object Es6 extends App:

  // Esercizio 6
  // @annotation.tailrec
  def fibNotTail(n: Int): Int = n match
    case 0 => 0
    case 1 => 1
    case _ => fibNotTail(n - 1) + fibNotTail(n - 2)

  // My recursion is not tail because i don't return only the function name.
  // I'm sure because i try to check if optimisation is possible with the command
  // @annotation.tailrec (line 6) but it gives an error.