package com.fishercoder;

import com.fishercoder.solutions._1745;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1745Test {
    private static _1745.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1745.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.checkPartitioning("abcbdd"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.checkPartitioning("bcbddxy"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.checkPartitioning("juchzcedhfesefhdeczhcujzzvbmoeombv"));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.checkPartitioning("gbofdldvwelqiizbievfolrujxnwjmjwsjrjeqecwssgtlteltslfzkblzihcgwjnqaiqbxohcnxulxozzkanaofgoddogfoanakzzoxluxnchoxbqiaqnjwgchizlbkzflstletltgsswceqejrjswjmjwnxjurlofveibziiqlewvdldfobgxebrcrbexv"));
    }
}