package com.fishercoder;

import com.fishercoder.common.classes.Interval;
import com.fishercoder.solutions._56;
import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _56Test {
  private static _56.Solution1 solution1;
  private static List<Interval> intervals;
  private static List<Interval> expected;

  @BeforeClass
  public static void setup() {
    solution1 = new _56.Solution1();
  }

  @Test
  public void test1() {
    intervals = new ArrayList();
    intervals.add(new Interval(2, 3));
    intervals.add(new Interval(5, 5));
    intervals.add(new Interval(2, 2));
    intervals.add(new Interval(3, 4));
    intervals.add(new Interval(3, 4));

    expected = new ArrayList<>();
    expected.add(new Interval(2, 4));
    expected.add(new Interval(5, 5));
    assertEquals(expected, solution1.merge(intervals));
  }

  @Test
  public void test2() {
    intervals = new ArrayList();
    intervals.add(new Interval(1, 3));
    intervals.add(new Interval(2, 6));
    intervals.add(new Interval(8, 10));
    intervals.add(new Interval(15, 18));

    expected = new ArrayList<>();
    expected.add(new Interval(1, 6));
    expected.add(new Interval(8, 10));
    expected.add(new Interval(15, 18));
    assertEquals(expected, solution1.merge(intervals));
  }
}
