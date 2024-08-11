package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._316;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _316Test {
  private _316.Solution1 solution1;
  private _316.Solution2 solution2;

  @BeforeEach
    public void setUp() {
    solution1 = new _316.Solution1();
    solution2 = new _316.Solution2();
  }

  @Test
  public void test1() {
    assertEquals("abc", solution1.removeDuplicateLetters("bcabc"));
    assertEquals("abc", solution2.removeDuplicateLetters("bcabc"));
  }

  @Test
  public void test2() {
    assertEquals("acdb", solution1.removeDuplicateLetters("cbacdcbc"));
    assertEquals("acdb", solution2.removeDuplicateLetters("cbacdcbc"));
  }
}
