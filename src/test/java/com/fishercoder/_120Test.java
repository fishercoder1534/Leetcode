package com.fishercoder;

import com.fishercoder.solutions._120;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _120Test {
  private static _120.Solution1 solution1;
  private static List<List<Integer>> triangle;

  @BeforeClass
  public static void setup() {
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
