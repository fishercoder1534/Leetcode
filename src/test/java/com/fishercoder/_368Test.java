package com.fishercoder;

import com.fishercoder.solutions._368;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class _368Test {
  private static _368.Solution1 solution1;
  private static int[] nums;

  @BeforeClass
  public static void setup() {
    solution1 = new _368.Solution1();
  }

  @Test
  public void test1() {
    nums = new int[] {1, 2, 4, 8};
    assertThat(solution1.largestDivisibleSubset(nums), is(Arrays.asList(8, 4, 2, 1)));
  }

  @Test
  public void test2() {
    nums = new int[] {1, 2, 3};
    assertThat(solution1.largestDivisibleSubset(nums), is(Arrays.asList(2, 1)));
  }

  @Test
  public void test3() {
    nums = new int[] {1};
    assertThat(solution1.largestDivisibleSubset(nums), is(Arrays.asList(1)));
  }

  @Test
  public void test4() {
    nums = new int[] {546, 669};
    assertThat(solution1.largestDivisibleSubset(nums), is(Arrays.asList(546)));
  }

  @Test
  public void test5() {
    nums = new int[] {};
    assertThat(solution1.largestDivisibleSubset(nums), is(Arrays.asList()));
  }

  @Test
  public void test6() {
    nums = new int[] {4, 8, 10, 240};
    assertThat(solution1.largestDivisibleSubset(nums), is(Arrays.asList(240, 8, 4)));
  }
}
