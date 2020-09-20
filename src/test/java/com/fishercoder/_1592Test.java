package com.fishercoder;

import com.fishercoder.solutions._1592;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1592Test {
    private static _1592.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1592.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("hello  ", solution1.reorderSpaces("  hello"));
    }

    @Test
    public void test2() {
        assertEquals("this   is   a   sentence", solution1.reorderSpaces("  this   is  a sentence "));
    }

    @Test
    public void test3() {
        assertEquals("practice   makes   perfect ", solution1.reorderSpaces(" practice   makes   perfect"));
    }

    @Test
    public void test4() {
        assertEquals("hello   world", solution1.reorderSpaces("hello   world"));
    }

    @Test
    public void test5() {
        assertEquals("walks  udp  package  into  bar  a ", solution1.reorderSpaces("  walks  udp package   into  bar a"));
    }

    @Test
    public void test6() {
        assertEquals("a", solution1.reorderSpaces("a"));
    }

}
