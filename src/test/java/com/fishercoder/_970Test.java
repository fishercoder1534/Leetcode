package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._970;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _970Test {
    private static _970.Solution1 solution1;
    private static _970.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _970.Solution1();
        solution2 = new _970.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(2, 3, 4, 5, 7, 9, 10), solution1.powerfulIntegers(2, 3, 10));
        assertEquals(Arrays.asList(2, 3, 4, 5, 7, 9, 10), solution2.powerfulIntegers(2, 3, 10));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(2, 4, 6, 8, 10, 14), solution1.powerfulIntegers(3, 5, 15));
        assertEquals(Arrays.asList(2, 4, 6, 8, 10, 14), solution2.powerfulIntegers(3, 5, 15));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(2, 3, 5, 7, 8, 9, 10), solution1.powerfulIntegers(2, 6, 12));
        assertEquals(Arrays.asList(2, 3, 5, 7, 8, 9, 10), solution2.powerfulIntegers(2, 6, 12));
    }

    @Test
    public void test4() {
        assertEquals(Arrays.asList(2, 3, 5, 9, 10, 11), solution1.powerfulIntegers(2, 9, 12));
        assertEquals(Arrays.asList(2, 3, 5, 9, 10, 11), solution2.powerfulIntegers(2, 9, 12));
    }

    @Test
    public void test5() {
        CommonUtils.printList(solution1.powerfulIntegers(90, 90, 1000000));
        CommonUtils.printList(solution2.powerfulIntegers(90, 90, 1000000));
    }

    @Test
    public void test6() {
        assertEquals(Arrays.asList(2), solution1.powerfulIntegers(1, 1, 40000));
        assertEquals(Arrays.asList(2), solution2.powerfulIntegers(1, 1, 40000));
    }
}
