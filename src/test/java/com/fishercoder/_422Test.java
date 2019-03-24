package com.fishercoder;

import com.fishercoder.solutions._422;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class _422Test {
  private static _422.Solution1 test;
  private static boolean expected;
  private static boolean actual;
  private static List<String> words;

  @BeforeClass
  public static void setup() {
    test = new _422.Solution1();
  }

  @Before
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
