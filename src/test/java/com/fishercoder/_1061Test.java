package com.fishercoder;

import com.fishercoder.solutions.secondthousand._1061;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1061Test {
    private static _1061.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1061.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("makkek", solution1.smallestEquivalentString("parker", "morris", "parser"));
    }

}