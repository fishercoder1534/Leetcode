package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1108;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1108Test {
    private static _1108.Solution1 solution1;
    private static _1108.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1108.Solution1();
        solution2 = new _1108.Solution2();
    }

    @Test
    public void test1() {
        assertEquals("1[.]1[.]1[.]1", solution1.defangIPaddr("1.1.1.1"));
        assertEquals("1[.]1[.]1[.]1", solution2.defangIPaddr("1.1.1.1"));
    }

    @Test
    public void test2() {
        assertEquals("255[.]100[.]50[.]0", solution1.defangIPaddr("255.100.50.0"));
        assertEquals("255[.]100[.]50[.]0", solution2.defangIPaddr("255.100.50.0"));
    }
}
