package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._131;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _131Test {
  private _131.Solution1 solution1;
  private static List<List<String>> expected;

  @BeforeEach
    public void setUp() {
    solution1 = new _131.Solution1();
  }

  @Test
  public void test1() {
    expected = new ArrayList();
    expected.add(Arrays.asList("a", "a", "b"));
    expected.add(Arrays.asList("aa", "b"));
    assertEquals(expected, solution1.partition("aab"));
  }
}
