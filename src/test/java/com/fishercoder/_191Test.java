package com.fishercoder;

import com.fishercoder.solutions._191;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _191Test {
    private static _191.Solution1 solution1;
    private static _191.Solution2 solution2;
    private static _191.Solution3 solution3;
    private static _191.Solution4 solution4;

    @BeforeClass
    public static void setup() {
        solution1 = new _191.Solution1();
        solution2 = new _191.Solution2();
        solution3 = new _191.Solution3();
        solution4 = new _191.Solution4();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.hammingWeight(1));
        assertEquals(1, solution2.hammingWeight(1));
        assertEquals(1, solution3.hammingWeight(1));
        assertEquals(1, solution4.hammingWeight(1));
    }

    @Test
    public void test2() {
//        System.out.println(Integer.MAX_VALUE);
//        assertEquals(2147483648, Integer.MAX_VALUE);
    }

}
