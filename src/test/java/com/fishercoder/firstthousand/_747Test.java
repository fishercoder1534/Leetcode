package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._747;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _747Test {
  private _747.Solution1 solution1;
  private _747.Solution2 solution2;
  private static int[] nums;

  @BeforeEach
    public void setUp() {
    solution1 = new _747.Solution1();
    solution2 = new _747.Solution2();
  }

  @Test
  public void test1() {
    nums = new int[] {3, 6, 1, 0};
    assertEquals(1, solution1.dominantIndex(nums));
  }

  @Test
  public void test2() {
    nums = new int[] {3, 6, 1, 0};
    assertEquals(1, solution2.dominantIndex(nums));
  }

  @Test
  public void test3() {
    nums = new int[] {1, 2, 3, 4};
    assertEquals(-1, solution1.dominantIndex(nums));
  }

  @Test
  public void test4() {
    nums = new int[] {1, 2, 3, 4};
    assertEquals(-1, solution2.dominantIndex(nums));
  }
}
