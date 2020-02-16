package com.fishercoder;

import com.fishercoder.solutions._880;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Ignore
public class _880Test {
    private static _880.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _880.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("o", solution1.decodeAtIndex("leet2code3", 10));
    }

    @Test
    public void test2() {
        assertEquals("h", solution1.decodeAtIndex("ha22", 5));
    }

    @Test
    public void test3() {
        assertEquals("a", solution1.decodeAtIndex("a2345678999999999999999", 1));
    }

    @Test
    public void test4() {
        assertEquals("a", solution1.decodeAtIndex("abc", 1));
    }

    @Test
    public void test5() {
        assertEquals("a", solution1.decodeAtIndex("a2b3c4d5e6f7g8h9", 10));
    }

}