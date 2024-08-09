package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._401;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _401Test {
  private _401.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _401.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(
        Arrays.asList("0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00",
            "8:00"), solution1.readBinaryWatch(1));
  }
}
