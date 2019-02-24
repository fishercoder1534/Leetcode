package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._942;
import org.junit.BeforeClass;
import org.junit.Test;

public class _942Test {
  private static _942.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _942.Solution1();
  }

  @Test
  public void test1() {
    CommonUtils.printArray(solution1.diStringMatch("IDID"));
  }

  @Test
  public void test2() {
    CommonUtils.printArray(solution1.diStringMatch("III"));
  }

  @Test
  public void test3() {
    CommonUtils.printArray(solution1.diStringMatch("DDI"));
  }
}
