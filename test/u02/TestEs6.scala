package u02

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import Es6.*

class TestEs6:

  @Test
  def testFibNotTail(): Unit =
    assertEquals(0, fibNotTail(0))
    assertEquals(1, fibNotTail(1))
    assertEquals(1, fibNotTail(2))
    assertEquals(2, fibNotTail(3))
    assertEquals(3, fibNotTail(4))

