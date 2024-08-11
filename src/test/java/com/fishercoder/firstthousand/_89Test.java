package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._89;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _89Test {

  private _89.Solution1 solution1;
  private _89.Solution2 solution2;

  @BeforeEach
    public void setUp() {
    solution1 = new _89.Solution1();
    solution2 = new _89.Solution2();
  }

  @Test
  public void test1() {
    assertEquals(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4), solution1.grayCode(3));
    assertEquals(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4), solution2.grayCode(3));
  }
}
