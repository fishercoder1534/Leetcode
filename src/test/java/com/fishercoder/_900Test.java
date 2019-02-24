package com.fishercoder;

import com.fishercoder.solutions._900;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _900Test {
  private static _900.Solution1.RLEIterator rleIterator;

  @Test
  public void test1() {
    rleIterator = new _900.Solution1.RLEIterator(new int[] {3, 8, 0, 9, 2, 5});
    assertEquals(8, rleIterator.next(2));
    assertEquals(8, rleIterator.next(1));
    assertEquals(5, rleIterator.next(1));
    assertEquals(-1, rleIterator.next(2));
  }

  @Test
  public void test2() {
    rleIterator = new _900.Solution1.RLEIterator(
        new int[] {811, 903, 310, 730, 899, 684, 472, 100, 434, 611});
    assertEquals(903, rleIterator.next(358));
    assertEquals(903, rleIterator.next(345));
    assertEquals(730, rleIterator.next(154));
    assertEquals(684, rleIterator.next(265));
    assertEquals(684, rleIterator.next(73));
    assertEquals(684, rleIterator.next(220));
    assertEquals(684, rleIterator.next(138));
    assertEquals(684, rleIterator.next(4));
    assertEquals(684, rleIterator.next(170));
    assertEquals(684, rleIterator.next(88));
  }
}
