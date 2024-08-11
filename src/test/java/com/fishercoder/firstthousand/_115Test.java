package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._115;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _115Test {
  private _115.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _115.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(3, solution1.numDistinct("rabbbit", "rabbit"));
  }
}
