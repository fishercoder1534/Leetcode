package com.fishercoder;

import com.fishercoder.solutions._1221;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1221Test {
    private static _1221.Solution1 solution1;
    private static _1221.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1221.Solution1();
        solution2 = new _1221.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.balancedStringSplit("RLRRLLRLRL"));
        assertEquals(4, solution2.balancedStringSplit("RLRRLLRLRL"));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.balancedStringSplit("RLLLLRRRLR"));
        assertEquals(3, solution2.balancedStringSplit("RLLLLRRRLR"));
    }

    @Test
    public void test3() {
        assertEquals(1, solution1.balancedStringSplit("LLLLRRRR"));
        assertEquals(1, solution2.balancedStringSplit("LLLLRRRR"));
    }

    @Test
    public void test4() {
        assertEquals(2, solution1.balancedStringSplit("RLRRRLLRLL"));
        assertEquals(2, solution2.balancedStringSplit("RLRRRLLRLL"));
    }

}