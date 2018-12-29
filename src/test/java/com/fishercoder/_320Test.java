package com.fishercoder;

import com.fishercoder.solutions._320;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class _320Test {
  private static _320.Solution1 solution1;
  private static List<String> expected;
  private static List<String> actual;
  private static String word;

  @BeforeClass
  public static void setup() {
    solution1 = new _320.Solution1();
  }

  @Before
  public void setupForEachTest() {
    expected = new ArrayList<>();
    actual = new ArrayList<>();
  }

  @Test
  public void test1() {
    word = "word";
    expected =
        Arrays.asList("word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1",
            "w1r1", "1o2", "2r1", "3d", "w3", "4");
    actual = solution1.generateAbbreviations(word);
    assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
  }
}
