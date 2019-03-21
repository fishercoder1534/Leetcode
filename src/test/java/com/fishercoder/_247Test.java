package com.fishercoder;

import com.fishercoder.solutions._247;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _247Test {
  private static _247.Solution1 solution1;
  private static List<String> expected;

  @BeforeClass
  public static void setup() {
    solution1 = new _247.Solution1();
  }

  @Test
  public void test1() {
    expected = Arrays.asList("11","69","88","96");
    assertEquals(expected, solution1.findStrobogrammatic(2));
  }

}
