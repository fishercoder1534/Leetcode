package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._164;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _164Test {
  private _164.Solution1 solution1;
  private static int[] nums;

  @BeforeEach
    public void setUp() {
    solution1 = new _164.Solution1();
  }

  @Test
  public void test1() {
    nums = new int[] {};
    assertEquals(0, solution1.maximumGap(nums));
  }

  @Test
  public void test2() {
    nums = new int[] {1, 3, 6, 5};
    assertEquals(2, solution1.maximumGap(nums));
  }

  @Test
  public void test3() {
    nums = new int[] {1, 100000};
    assertEquals(99999, solution1.maximumGap(nums));
  }
}
