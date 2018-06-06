package com.fishercoder;

import com.fishercoder.solutions._187;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _187Test {
  private static _187.Solution1 solution1;
  private static String s;
  private static List<String> expected;
  private static List<String> actual;

  @BeforeClass
  public static void setup() {
    solution1 = new _187.Solution1();
  }

  @Test
  public void test1() {
    s = "AAAAAAAAAAA";
    System.out.println(s.length());
    actual = solution1.findRepeatedDnaSequences(s);
    expected = new ArrayList<>(Arrays.asList("AAAAAAAAAA"));
    System.out.println(expected.get(0).length());
    assertEquals(expected, actual);
  }
}
