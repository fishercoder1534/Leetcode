package com.fishercoder;

import com.fishercoder.solutions._93;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class _93Test {
  private static _93.Solution1 solution1;
  private static List<String> expected;
  private static String s;

  @BeforeClass
  public static void setup() {
    solution1 = new _93.Solution1();
  }

  @Before
  public void setupForEachTest() {
    expected = new ArrayList<>();
  }

  @Test
  public void test1() {
    s = "25525511135";
    expected.add("255.255.11.135");
    expected.add("255.255.111.35");
    assertEquals(expected, solution1.restoreIpAddresses(s));
  }
}
