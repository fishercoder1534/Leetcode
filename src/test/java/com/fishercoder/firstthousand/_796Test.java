package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._796;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _796Test {
  private _796.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _796.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(true, solution1.rotateString("abcde", "cdeab"));
  }

  @Test
  public void test2() {
    assertEquals(false, solution1.rotateString("abcde", "abced"));
  }
}
