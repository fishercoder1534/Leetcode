package com.fishercoder;

import com.fishercoder.solutions._227;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _227Test {
    private static _227.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _227.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(7, solution1.calculate("3+2*2"));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.calculate(" 3/2 "));
    }

    @Test
    public void test3() {
        assertEquals(5, solution1.calculate(" 3+5 / 2 "));
    }

    @Test
    public void test4() {
        assertEquals(27, solution1.calculate("100000000/1/2/3/4/5/6/7/8/9/10"));
    }

}
