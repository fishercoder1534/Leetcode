package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._88;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _88Test {

  private _88.Solution1 solution1;
  private int[] nums1;
  private int[] nums2;
  private int[] expected;

  @BeforeEach
    public void setUp() {
    solution1 = new _88.Solution1();
  }

  @Test
  public void test1() {
    nums1 = new int[] {2, 0};
    nums2 = new int[] {1};
    expected = new int[] {1, 2};
    solution1.merge(nums1, 1, nums2, 1);
    assertArrayEquals(expected, nums1);
  }

  @Test
  public void test2() {
    nums1 = new int[] {4, 5, 6, 0, 0, 0};
    nums2 = new int[] {1, 2, 3};
    expected = new int[] {1, 2, 3, 4, 5, 6};
    solution1.merge(nums1, 3, nums2, 3);
    assertArrayEquals(expected, nums1);
  }
}
