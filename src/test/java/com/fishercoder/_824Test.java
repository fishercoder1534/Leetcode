package com.fishercoder;

import com.fishercoder.solutions._824;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _824Test {
  private static _824.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _824.Solution1();
  }

  @Test
  public void test1() {
    assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa",
        solution1.toGoatLatin("I speak Goat Latin"));
  }

  @Test
  public void test2() {
    assertEquals(
        "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
        solution1.toGoatLatin("The quick brown fox jumped over the lazy dog"));
  }
}
