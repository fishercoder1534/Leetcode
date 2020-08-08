package com.fishercoder;

import com.fishercoder.solutions._1541;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1541Test {
    private static _1541.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1541.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minInsertions("(()))"));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.minInsertions("())"));
    }

    @Test
    public void test3() {
        assertEquals(3, solution1.minInsertions("))())("));
    }

    @Test
    public void test4() {
        assertEquals(12, solution1.minInsertions("(((((("));
    }

    @Test
    public void test5() {
        assertEquals(5, solution1.minInsertions(")))))))"));
    }

    @Test
    public void test6() {
        assertEquals(4, solution1.minInsertions("(()))(()))()())))"));
    }

}
