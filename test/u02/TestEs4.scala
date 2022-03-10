package u02

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import Es4.*

class TestEs4:

  @Test
  def testp1(): Unit =
    assertTrue(p1(2)(3)(4))
    assertFalse(p1(2)(3)(2))

  @Test
  def testp2(): Unit =
    assertTrue(p2(3,4,7))
    assertFalse(p2(5,4,4))

  @Test
  def testp3(): Unit =
    assertTrue(p3(2)(3)(5))
    assertFalse(p3(2)(3)(1))

  @Test
  def testp4(): Unit =
    assertTrue(p4(3,4,4))
    assertFalse(p4(5,4,4))