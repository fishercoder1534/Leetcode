package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._190;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _190Test {
  private _190.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _190.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(536870912, solution1.reverseBits(4));
  }


  @Test
  public void test2() {
    assertEquals(964176192, solution1.reverseBits(  43261596));
  }
}
