package u02

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import Es3.*

class TestEs3:

  @Test
  def testParityWithLambda(): Unit =
    assertEquals("Even", parityLambda(4))
    assertEquals("Odd", parityLambda(5))
    assertEquals("Even", parityLambda(40))

  @Test
  def testParitySintax(): Unit =
    assertEquals("Even", paritySintax(4))
    assertEquals("Odd", paritySintax(5))
    assertEquals("Even", paritySintax(40))

  @Test
  def testNeg(): Unit =
    val empty: String => Boolean = _ == ""
    val notEmpty = neg(empty)

    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty(""))

  @Test
  def testGenericNeg(): Unit =
    val empty: Double => Boolean = _ > 5
    val notEmpty = genericNeg(empty)

    assertTrue(notEmpty(3.5))
    assertFalse(notEmpty(6.1))