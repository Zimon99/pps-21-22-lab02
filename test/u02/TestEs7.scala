package u02

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import Es7.Shape
import Es7.Shape.*

class TestEs7:

  @Test
  def testRectanglePerimeter(): Unit =
    assertEquals(20 * 2 + 10 * 2, perimeter(Shape.Rectangle(10, 20)))

  @Test
  def testCirclePerimeter(): Unit =
    assertEquals(2 * 10 * 3.14, perimeter(Shape.Circle(10)))

  @Test
  def testSquarePerimeter(): Unit =
    assertEquals(20 * 4, perimeter(Shape.Square(20)))

  @Test
  def testRectangleArea(): Unit =
    assertEquals(20*10, area(Shape.Rectangle(10, 20)))

  @Test
  def testCircleArea(): Unit =
    assertEquals(10 * 10 * 3.14, area(Shape.Circle(10)))

  @Test
  def testSquareArea(): Unit =
    assertEquals(20 * 20, area(Shape.Square(20)))