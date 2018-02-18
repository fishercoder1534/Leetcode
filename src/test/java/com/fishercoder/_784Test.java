package com.fishercoder;

import com.fishercoder.solutions._784;
import java.util.Arrays;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _784Test {
  private static _784.Solution1 solution1;
  private static List<String> expected;

  @BeforeClass
  public static void setup() {
    solution1 = new _784.Solution1();
  }

  @Test
  public void test1() {
    expected = Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2");
    assertEquals(expected, solution1.letterCasePermutation("a1b2"));
  }

  @Test
  public void test2() {
    expected = Arrays.asList("3z4", "3Z4");
    assertEquals(expected, solution1.letterCasePermutation("3z4"));
  }

  @Test
  public void test3() {
    expected = Arrays.asList("12345");
    assertEquals(expected, solution1.letterCasePermutation("12345"));
  }
}
