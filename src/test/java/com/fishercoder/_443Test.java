package com.fishercoder;

import com.fishercoder.solutions._443;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _443Test {
    private static _443.Solution1 solution1;
    private static char[] chars;

    @BeforeClass
    public static void setup() {
        solution1 = new _443.Solution1();
    }

    @Test
    public void test1() {
        chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        assertEquals(6, solution1.compress(chars));
    }

    @Test
    public void test2() {
        chars = new char[]{'a'};
        assertEquals(1, solution1.compress(chars));
    }

    @Test
    public void test3() {
        chars = new char[]{'a', 'b'};
        assertEquals(2, solution1.compress(chars));
    }

    @Test
    public void test4() {
        chars = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertEquals(4, solution1.compress(chars));
    }
}