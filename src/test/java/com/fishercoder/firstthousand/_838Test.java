package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._838;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _838Test {
    private _838.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _838.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("LL.RR.LLRRLL..", solution1.pushDominoes(".L.R...LR..L.."));
    }

    @Test
    public void test2() {
        assertEquals("RR.L", solution1.pushDominoes("RR.L"));
    }

    @Test
    public void test3() {
        assertEquals(".", solution1.pushDominoes("."));
    }

    @Test
    public void test4() {
        assertEquals("..RRR", solution1.pushDominoes("..R.."));
    }

    @Test
    public void test5() {
        assertEquals("RRR.L", solution1.pushDominoes("R.R.L"));
    }
}
