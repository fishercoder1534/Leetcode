package com.fishercoder;

import com.fishercoder.solutions._49;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _49Test {
  private static _49.Solution1 solution1;
  private static String[] words;
  private static List<List<String>> expected;
  private static List<List<String>> actual;

  @BeforeClass
  public static void setup() {
    solution1 = new _49.Solution1();
  }

  @Test
  public void test1() {
    words = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
    expected = new ArrayList<>();
    expected.add(Arrays.asList("ate", "eat", "tea"));
    expected.add(Arrays.asList("nat", "tan"));
    expected.add(Arrays.asList("bat"));
    actual = solution1.groupAnagrams(words);
    assertEquals(expected.size(), actual.size());
    assertEquals(expected.containsAll(actual), actual.containsAll(expected));
  }
}
