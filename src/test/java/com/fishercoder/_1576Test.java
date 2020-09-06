package com.fishercoder;

import com.fishercoder.solutions._1576;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1576Test {
    private static _1576.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1576.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("azs", solution1.modifyString("?zs"));
    }
}
