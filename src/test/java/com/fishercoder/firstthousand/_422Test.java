package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._422;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _422Test {
  private _422.Solution1 test;
  private static boolean expected;
  private static boolean actual;
  private static List<String> words;

  @BeforeEach
    public void setUp() {
    test = new _422.Solution1();
  }

  @BeforeEach
    public void setupForEachTest() {
  }

  @Test
  public void test1() {
    words = new ArrayList<>(Arrays.asList("abcd", "bnrt", "crmy", "dtye"));
    expected = true;
    actual = test.validWordSquare(words);
    assertEquals(expected, actual);
  }

  @Test
  public void test2() {
    words = new ArrayList<>(Arrays.asList("abcd", "bnrt", "crm", "dt"));
    expected = true;
    actual = test.validWordSquare(words);
    assertEquals(expected, actual);
  }

  @Test
  public void test3() {
    words = new ArrayList<>(Arrays.asList("ball", "asee", "let", "lep"));
    expected = false;
    actual = test.validWordSquare(words);
    assertEquals(expected, actual);
  }
}
