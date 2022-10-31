package com.fishercoder;

import com.fishercoder.solutions._169;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _169Test {
    private static _169.Solution1 solution1;
    private static _169.Solution2 solution2;
    private static _169.Solution3 solution3;

    @BeforeClass
    public static void setup() {
        solution1 = new _169.Solution1();
        solution2 = new _169.Solution2();
        solution3 = new _169.Solution3();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.majorityElement(new int[]{1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6, 2, 2}));
        assertEquals(1, solution2.majorityElement(new int[]{1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6, 2, 2}));
        assertEquals(1, solution3.majorityElement(new int[]{1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6, 2, 2}));
    }

}
