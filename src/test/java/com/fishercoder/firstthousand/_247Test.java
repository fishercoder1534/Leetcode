package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._247;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _247Test {
  private _247.Solution1 solution1;
  private static List<String> expected;

  @BeforeEach
    public void setUp() {
    solution1 = new _247.Solution1();
  }

  @Test
  public void test1() {
    expected = Arrays.asList("11","69","88","96");
    assertEquals(expected, solution1.findStrobogrammatic(2));
  }

}
