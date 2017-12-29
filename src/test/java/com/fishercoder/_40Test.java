package com.fishercoder;

import com.fishercoder.solutions._40;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _40Test {
  private static _40.Solution1 solution1;
  private static int[] candidates;
  private static List<List<Integer>> expected;

  @BeforeClass
  public static void setup() {
    solution1 = new _40.Solution1();
  }

  @Test
  public void test1() {
    candidates = new int[] {10, 1, 2, 7, 6, 1, 5};
    expected = new ArrayList<>();
    expected.add(Arrays.asList(1, 1, 6));
    expected.add(Arrays.asList(1, 2, 5));
    expected.add(Arrays.asList(1, 7));
    expected.add(Arrays.asList(2, 6));
    assertEquals(expected, solution1.combinationSum2(candidates, 8));
  }
}
