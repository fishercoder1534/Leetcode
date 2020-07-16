package com.fishercoder;

import com.fishercoder.solutions._1507;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1507Test {
    private static _1507.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1507.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("2052-10-20", solution1.reformatDate("20th Oct 2052"));
    }

}