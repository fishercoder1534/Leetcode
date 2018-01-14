package com.fishercoder;

import com.fishercoder.solutions._763;
import java.util.Arrays;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _763Test {
  private static _763.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _763.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(Arrays.asList(9, 7, 8), solution1.partitionLabels("ababcbacadefegdehijhklij"));
  }

  @Test
  public void test2() {
    assertEquals(Arrays.asList(9, 7, 8), solution1.partitionLabels("ababcbacadefegdehijhklij"));
  }
}
