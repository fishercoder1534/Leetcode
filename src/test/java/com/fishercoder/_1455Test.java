package com.fishercoder;

import com.fishercoder.solutions._1455;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1455Test {
    private static _1455.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1455.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.isPrefixOfWord("i love eating burger", "burg"));
    }

}