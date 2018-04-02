package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._811;
import org.junit.BeforeClass;
import org.junit.Test;

public class _811Test {
  private static _811.Solution1 solution1;
  private static String[] cpdomains;

  @BeforeClass
  public static void setup() {
    solution1 = new _811.Solution1();
  }

  @Test
  public void test1() {
    cpdomains = new String[] {"9001 discuss.leetcode.com"};
    CommonUtils.print(solution1.subdomainVisits(cpdomains));
  }

  @Test
  public void test2() {
    cpdomains =
        new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
    CommonUtils.print(solution1.subdomainVisits(cpdomains));
  }
}
