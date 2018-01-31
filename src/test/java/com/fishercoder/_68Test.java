package com.fishercoder;

import com.fishercoder.solutions._68;
import java.util.Arrays;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _68Test {
  private static _68.Solution1 solution1;
  private static String[] words;

  @BeforeClass
  public static void setup() {
    solution1 = new _68.Solution1();
  }

  @Test
  public void test1() {
    words =
        new String[] {"This", "is", "a", "good", "test!", "\n", "What", "do", "you", "\n", "think?",
            "\n", "I", "think", "so", "too!"};
    assertEquals(Arrays.asList(
        "This  is  a good",
        "test!  \n What do",
        "you \n think? \n I",
        "think so too!   "), solution1.fullJustify(words, 16));
  }

  @Test
  public void test2() {
    words = new String[] {"This", "is", "an", "example", "of", "text", "justification."};
    assertEquals(Arrays.asList(
        "This    is    an",
        "example  of text",
        "justification.  "), solution1.fullJustify(words, 16));
  }
}
