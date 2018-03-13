package com.fishercoder;

import com.fishercoder.solutions._211;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _211Test {
  private static _211.Solution1.WordDictionary wordDictionarySolution1;

  @BeforeClass
  public static void setup() {
    wordDictionarySolution1 = new _211.Solution1.WordDictionary();
  }

  @Test
  public void test1() {
    wordDictionarySolution1.addWord("bad");
    wordDictionarySolution1.addWord("dad");
    wordDictionarySolution1.addWord("mad");
    assertEquals(false, wordDictionarySolution1.search("pad"));
    assertEquals(true, wordDictionarySolution1.search("bad"));
    assertEquals(true, wordDictionarySolution1.search(".ad"));
    assertEquals(true, wordDictionarySolution1.search("b.."));
  }
}
