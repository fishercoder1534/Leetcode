package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._756;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _756Test {
  private _756.Solution1 solution1;
  private static List<String> allowed;

  @BeforeEach
    public void setUp() {
    solution1 = new _756.Solution1();
  }

  @Test
  public void test1() {
    allowed = Arrays.asList("XYD", "YZE", "DEA", "FFF");
    assertEquals(true, solution1.pyramidTransition("XYZ", allowed));
  }

  @Test
  public void test2() {
    allowed = Arrays.asList("XXX", "XXY", "XYX", "XYY", "YXZ");
    assertEquals(false, solution1.pyramidTransition("XXYX", allowed));
  }

  @Test
  public void test3() {
    allowed = Arrays.asList("BCE", "BCF", "ABA", "CDA", "AEG", "FAG", "GGG");
    assertEquals(false, solution1.pyramidTransition("ABCD", allowed));
  }
}
