package com.fishercoder;

import com.fishercoder.solutions._409;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _409Test {
  private static _409.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _409.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(7, solution1.longestPalindrome("abccccdd"));
  }

  @Test
  public void test2() {
    assertEquals(7, solution1.longestPalindrome("abccAccdd"));
  }

  @Test
  public void test3() {
    assertEquals(983, solution1.longestPalindrome(
        "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
  }

  @Test
  public void test4() {
    assertEquals(3, solution1.longestPalindrome("ccc"));
  }
}
