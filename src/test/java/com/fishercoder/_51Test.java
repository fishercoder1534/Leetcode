package com.fishercoder;

import com.fishercoder.solutions._51;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class _51Test {
  private static _51.Solution1 solution1;
  private static List<List<String>> expected;
  private static List<List<String>> actual;
  private static int n;

  @BeforeClass
  public static void setup() {
    solution1 = new _51.Solution1();
  }

  @Before
  public void setupForEachTest() {
    expected = new ArrayList<>();
    actual = new ArrayList<>();
  }

  @Test
  public void test1() {
    n = 4;
    expected = new ArrayList<>();
    expected.add(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));
    expected.add(Arrays.asList(".Q..", "...Q", "Q...", "..Q."));
    actual = solution1.solveNQueens(n);
    assertEquals(expected, actual);
  }
}
