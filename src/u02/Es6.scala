package u02

object Es6 extends App {

  //@annotation.tailrec
  def fibNotTail(n: Int): Int = n match
    case 0 => 0
    case 1 => 1
    case _ => fibNotTail(n - 1) + fibNotTail(n - 2)

  // My recursion is not a tail one because i does not return only the function name.
  // I'm sure because i try to check if optimisation is possible with the command
  // @annotation.tailrec but it gives an error.
  
  // Tail version
  

}
