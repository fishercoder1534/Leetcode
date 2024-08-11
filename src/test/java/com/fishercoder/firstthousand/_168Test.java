package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._168;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _168Test {
  private _168.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _168.Solution1();
  }

  @Test
  public void test1() {
    assertEquals("APSM", solution1.convertToTitle(28899));
  }
}
