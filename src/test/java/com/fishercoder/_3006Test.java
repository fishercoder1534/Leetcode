package com.fishercoder;

import com.fishercoder.solutions._3006;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _3006Test {
    private static _3006.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _3006.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(16, 33), solution1.beautifulIndices("isawsquirrelnearmysquirrelhouseohmy", "my", "squirrel", 15));
    }

    @Test
    public void test2() {
        assertEquals(new ArrayList<>(Arrays.asList(0)), solution1.beautifulIndices("bavgoc", "ba", "c", 6));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(), solution1.beautifulIndices("lrtsi", "lrts", "i", 3));
    }

}