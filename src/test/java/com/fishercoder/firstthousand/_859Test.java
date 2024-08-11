package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._859;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _859Test {
  private _859.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _859.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(true, solution1.buddyStrings("ab", "ba"));
  }

  @Test
  public void test2() {
    assertEquals(false, solution1.buddyStrings("ab", "ab"));
  }

  @Test
  public void test3() {
    assertEquals(true, solution1.buddyStrings("aa", "aa"));
  }

  @Test
  public void test4() {
    assertEquals(true, solution1.buddyStrings("aaaaaaabc", "aaaaaaacb"));
  }

  @Test
  public void test5() {
    assertEquals(false, solution1.buddyStrings("", "aa"));
  }

  @Test
  public void test6() {
    assertEquals(true, solution1.buddyStrings("aaa", "aaa"));
  }
}
