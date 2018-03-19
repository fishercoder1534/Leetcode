package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._491;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class _491Test {
  private static _491.Solution1 solution1;
  private static int[] nums;

  @BeforeClass
  public static void setup() {
    solution1 = new _491.Solution1();
  }

  @Test
  public void test1() {
    nums = new int[] {4, 6, 7, 7};
    List<List<Integer>> actual = solution1.findSubsequences(nums);
    CommonUtils.printListList(actual);
  }
}
