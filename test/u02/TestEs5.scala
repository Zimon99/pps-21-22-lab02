package u02

import Es5.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}

class TestEs5:

  @Test
  def testCompose(): Unit =
    assertEquals(9, compose(_ - 1, _ * 2)(5))

  @Test
  def testGenericCompose(): Unit =
    assertEquals(15, genericCompose[Double, Double, Double](_ - 2.5, _ * 3.5)(5))