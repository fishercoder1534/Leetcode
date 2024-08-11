package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._950;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _950Test {
  private _950.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _950.Solution1();
  }

  @Test
  public void test1() {
    assertArrayEquals(new int[] {2, 13, 3, 11, 5, 17, 7},
        solution1.deckRevealedIncreasing(new int[] {17, 13, 11, 2, 3, 5, 7}));
  }
}
