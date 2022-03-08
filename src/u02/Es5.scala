package u02

object Es5 extends App {

  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  // Constraint
  // f: A -> B
  // g: C -> D
  // (f ° g)(x) = f(g(x)) --> D = A

  // Generic version
  def genericCompose[A, B, C] (f: A => B, g: C => A): C => B = x => f(g(x))

}
