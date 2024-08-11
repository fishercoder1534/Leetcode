package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._942;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _942Test {
  private _942.Solution1 solution1;

  @BeforeEach
    public void setUp() {
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
