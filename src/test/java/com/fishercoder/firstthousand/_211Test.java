package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._211;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _211Test {
  private _211.Solution1.WordDictionary wordDictionarySolution1;

  @BeforeEach
    public void setUp() {
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
