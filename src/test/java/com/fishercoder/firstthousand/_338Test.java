package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._338;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _338Test {
  private _338.Solution1 test;
  private static int[] expected;
  private static int[] actual;

  @BeforeEach
    public void setUp() {
    test = new _338.Solution1();
  }

  @Test
  public void test1() {
    expected = new int[] {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4};
    actual = test.countBits(15);
    CommonUtils.printArray(actual);
    assertArrayEquals(expected, actual);
  }
}
