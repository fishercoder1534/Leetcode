package com.fishercoder;

import com.fishercoder.solutions._163;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class _163Test {

  private static _163.Solution1 solution1;
  private static List<String> expected;
  private static List<String> actual;
  private static int[] nums;

  @BeforeClass
  public static void setup() {
    solution1 = new _163.Solution1();
    expected = new ArrayList();
    actual = new ArrayList();
  }

  @Before
  public void setupForEachTest() {
    expected.clear();
    actual.clear();
  }

  @Test
  public void test1() {
    //solution1 case 1: should return ["0->2147483646"]
    nums = new int[] {2147483647};
    expected.add("0->2147483646");
    actual = solution1.findMissingRanges(nums, 0, 2147483647);
    assertEquals(expected, actual);
  }

  @Test
  public void test2() {
    //solution1 case 2: should return ["-2147483647->-1","1->2147483646"]
    nums = new int[] {-2147483648, -2147483648, 0, 2147483647, 2147483647};
    expected.add("-2147483647->-1");
    expected.add("1->2147483646");
    actual = solution1.findMissingRanges(nums, -2147483648, 2147483647);
    assertEquals(expected, actual);
  }

  @Test
  public void test3() {
    //solution1 case 3: should return ["-2147483648->2147483647"]
    nums = new int[] {};
    expected.add("-2147483648->2147483647");
    actual = solution1.findMissingRanges(nums, -2147483648, 2147483647);
    assertEquals(expected, actual);
  }

  @Test
  public void test4() {
    //solution1 case 4: should return ["-2147483648->2147483646"]
    nums = new int[] {2147483647};
    expected.add("-2147483648->2147483646");
    actual = solution1.findMissingRanges(nums, -2147483648, 2147483647);
    assertEquals(expected, actual);
  }

  @Test
  public void test5() {
    //solution1 case 5: should return ["0->2147483647"]
    nums = new int[] {};
    expected.add("0->2147483647");
    actual = solution1.findMissingRanges(nums, 0, 2147483647);
    assertEquals(expected, actual);
  }

  @Test
  public void test6() {
    //solution1 case 6: should return ["-2147483647->2147483647"]
    nums = new int[] {-2147483648};
    expected.add("-2147483647->2147483647");
    actual = solution1.findMissingRanges(nums, -2147483648, 2147483647);
    assertEquals(expected, actual);
  }
}
