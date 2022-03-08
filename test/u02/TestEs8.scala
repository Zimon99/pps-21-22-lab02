package u02

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import Es8.Option.*

class TestEs8:

  @Test
  def testFilter(): Unit =
    assertEquals(Some(5), filter(Some(5))(_ > 2))
    assertEquals(None(), filter(Some(5))(_ > 8))
    assertEquals(None(), filter(None[Int]())(_ > 2))

  @Test
  def testMap(): Unit =
    assertEquals(Some(true), map(Some(5))(_ > 2))
    assertEquals(Some(false), map(Some(5))(_ > 8))
    assertEquals(None(), map(None[Int]())(_ > 2))

  @Test
  def testMap2(): Unit =
    assertEquals(Some(5,3), map2[Int](Some(5))(Some(3)))
    assertEquals(None(), map2[Int](None())(Some(3)))
    assertEquals(None(), map2[Int](Some(3))(None()))

