package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._925;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _925Test {
    private _925.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _925.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isLongPressedName("alex", "aaleex"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.isLongPressedName("saeed", "ssaaedd"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.isLongPressedName("leelee", "lleeelee"));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.isLongPressedName("laiden", "laiden"));
    }

    @Test
    public void test5() {
        assertEquals(false, solution1.isLongPressedName("pyplrz", "ppyypllr"));
    }

    @Test
    public void test6() {
        assertEquals(true, solution1.isLongPressedName("leelee", "lleeelee"));
    }
}
