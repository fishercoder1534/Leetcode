package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._120;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _120Test {
  private _120.Solution1 solution1;
  private static List<List<Integer>> triangle;

  @BeforeEach
    public void setUp() {
    solution1 = new _120.Solution1();
  }

  @Test
  public void test1() {
    triangle = new ArrayList();
    triangle.add(Arrays.asList(1));
    triangle.add(Arrays.asList(2, 3));
    assertEquals(3, solution1.minimumTotal(triangle));
  }
}
