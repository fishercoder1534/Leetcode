package com.fishercoder;

import com.fishercoder.solutions._1138;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1138Test {
    private static _1138.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1138.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("DDR!UURRR!!DDD!", solution1.alphabetBoardPath("leet"));
    }

    @Test
    public void test2() {
        assertEquals("DDDDD!UUUUURRR!DDDDLLLD!", solution1.alphabetBoardPath("zdz"));
    }

}