package com.fishercoder;

import com.fishercoder.solutions._30;
import java.util.Arrays;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _30Test {
  private static _30.Solution1 solution1;
  private static String[] words;
  private static List<Integer> expected;

  @BeforeClass
  public static void setup() {
    solution1 = new _30.Solution1();
  }

  @Test
  @Ignore
  public void test1() {
    words = new String[] {"foo", "bar"};
    expected = Arrays.asList(0, 9);
    assertEquals(expected, solution1.findSubstring("barfoothefoobarman", words));
  }
}
