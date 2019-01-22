package com.fishercoder;

import com.fishercoder.common.classes.Interval;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._352;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class _352Test {
  private static _352.Solution1.SummaryRanges test;
  private static List<Interval> actual;

  @BeforeClass
  public static void setup() {
    test = new _352.Solution1.SummaryRanges();
  }

  @Test
  public void test1() {
    test.addNum(1);
    actual = test.getIntervals();
    CommonUtils.printIntervals(actual);

    test.addNum(3);
    actual = test.getIntervals();
    CommonUtils.printIntervals(actual);

    test.addNum(7);
    actual = test.getIntervals();
    CommonUtils.printIntervals(actual);

    test.addNum(2);
    actual = test.getIntervals();
    CommonUtils.printIntervals(actual);

    test.addNum(6);
    actual = test.getIntervals();
    CommonUtils.printIntervals(actual);
  }
}
