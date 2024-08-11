package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._804;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _804Test {
  private _804.Solution1 solution1;
  private static String[] words;

  @BeforeEach
    public void setUp() {
    solution1 = new _804.Solution1();
  }

  @Test
  public void test1() {
    words = new String[] {"gin", "zen", "gig", "msg"};
    assertEquals(2, solution1.uniqueMorseRepresentations(words));
  }
}
