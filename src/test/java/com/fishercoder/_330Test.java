package com.fishercoder;

import com.fishercoder.solutions._330;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _330Test {
  private static _330.Solution1 solution1;
  private static int[] nums;

  @BeforeClass
  public static void setup() {
    solution1 = new _330.Solution1();
  }

  @Test
  public void test1() {
    nums = new int[] {1, 2, 4, 13, 43};
    List<Integer> expected = new ArrayList(Arrays.asList(8, 29));
    assertEquals(expected, solution1.findPatches(nums, 100));
    assertEquals(2, solution1.minPatches(nums, 100));
  }
}
