package com.fishercoder;

import com.fishercoder.solutions._401;
import java.util.Arrays;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _401Test {
  private static _401.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _401.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(
        Arrays.asList("0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00",
            "8:00"), solution1.readBinaryWatch(1));
  }
}
