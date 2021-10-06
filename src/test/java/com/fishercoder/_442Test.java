package com.fishercoder;

import com.fishercoder.solutions._442;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _442Test {
    private static _442.Solution1 solution1;
    private static _442.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _442.Solution1();
        solution2 = new _442.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(2, 3), solution1.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        assertEquals(Arrays.asList(2, 3), solution2.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

}