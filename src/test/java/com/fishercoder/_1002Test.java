package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1002;
import org.junit.BeforeClass;
import org.junit.Test;

public class _1002Test {
  private static _1002.Solution1 solution1;
  private static String[] A;

  @BeforeClass
  public static void setup() {
    solution1 = new _1002.Solution1();
  }

  @Test
  public void test1() {
    A = new String[] {"bella", "label", "roller"};
    CommonUtils.print(solution1.commonChars(A));
  }

  @Test
  public void test2() {
    A = new String[] {"cool", "lock", "cook"};
    CommonUtils.print(solution1.commonChars(A));
  }
}
