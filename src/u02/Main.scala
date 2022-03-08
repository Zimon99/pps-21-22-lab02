package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

object Main extends App:

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

  // Test for neg function
  val predicate: String => Boolean = _ == ""
  val notEmpty = negGen(predicate) // which type of notEmpty?
  println(notEmpty("foo")) // true
  println(notEmpty("")) // false
  println(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test

  // --------------------- ESERCIZIO 4 ----------------------
  // Currying

  val p1 : Int => Int => Int => Boolean = x => y => z => x <= y && y <= z

  val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y <= z

  def p3(x: Int)(y: Int)(z: Int): Boolean =
    x <= y && y <= z

  def p4(x: Int, y: Int, z: Int): Boolean =
    x <= y && y <= z

  //def p4(num: Tup3[Int, Int, Int]): Boolean =
  //  Tup3(x, y, z) => if(x <= y && y <= z) then true else false

  // --------------------- ESERCIZIO 5 ----------------------

  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  // Constraint
  // f: A -> B
  // g: C -> D
  // (f ° g)(x) = f(g(x)) --> D = A

  // Generic version
  def compose2[A >: String, B >: String, C >: String] (f: A => B, g: C => A): C => B = x => f(g(x))

  // --------------------- ESERCIZIO 6 ----------------------

  //@annotation.tailrec
  def fib(n: Int): Int = n match
    case 0 => 0
    case 1 => 1
    case _ => fib(n - 1) + fib(n - 2)

  // My recursion is not a tail one because i does not return only the function name.
  // I'm sure because i try to check if optimisation is possible with the command
  // @annotation.tailrec but it creates an error.

  // --------------------- ESERCIZIO 7 ----------------------
  enum Shape:
    case Rectangle(base: Double, height: Double)
    case Circle(radius: Double)
    case Square(side: Double)

  //println(base(Shape.Rectangle(10.2, 20.2)))

  object Shape:
    def perimeter(shape: Shape): Double = shape match
      case Rectangle(base, height) => base * 2 + height * 2
      case Circle(radius) => 2 * radius * 3.14
      case Square(side) => side * 4

    def area(shape: Shape): Double = shape match
      case Rectangle(base, height) => base * height
      case Circle(radius) => radius * radius * 3.14
      case Square(side) => side * side

  // TEST FOR SHAPE
  import Shape.*

  val rectangle = Shape.Rectangle(10.2, 20.5)
  val circle = Shape.Circle(5.5)
  val square = Shape.Square(15.1)

  @Test def testCreateRectangle() =
    assertEquals(10.2, rectangle)

    //@Test def testCreateRectangle() =
      //assertEquals(10, base(Shape.Rectangle(10, 20)))

















