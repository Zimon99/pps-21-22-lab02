package u02

object Es7 extends App {

  enum Shape:
    case Rectangle(base: Double, height: Double)
    case Circle(radius: Double)
    case Square(side: Double)

  object Shape:
    def perimeter(shape: Shape): Double = shape match
      case Rectangle(base, height) => base * 2 + height * 2
      case Circle(radius) => 2 * radius * 3.14
      case Square(side) => side * 4

    def area(shape: Shape): Double = shape match
      case Rectangle(base, height) => base * height
      case Circle(radius) => radius * radius * 3.14
      case Square(side) => side * side
}
