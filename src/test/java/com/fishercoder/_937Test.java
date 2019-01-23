package com.fishercoder;

import com.fishercoder.solutions._937;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _937Test {
  private static _937.Solution1 solution1;
  private static String[] logs;
  private static String[] expected;

  @BeforeClass
  public static void setup() {
    solution1 = new _937.Solution1();
  }

  @Test
  public void test1() {
    logs = new String[] {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
    expected =
        new String[] {"g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"};
    assertArrayEquals(expected, solution1.reorderLogFiles(logs));
  }

  @Test
  public void test2() {
    logs = new String[] {"t kvr", "r 3 1", "i 403", "7 so", "t 54"};
    expected = new String[] {"t kvr", "7 so", "r 3 1", "i 403", "t 54"};
    assertArrayEquals(expected, solution1.reorderLogFiles(logs));
  }
}
