package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2038;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2038Test {
    private static _2038.Solution1 solution1;
    private static String color;

    @BeforeClass
    public static void setup() {
        solution1 = new _2038.Solution1();
    }

    @Test
    public void test1() {
        color = "AAABABB";
        assertEquals(true, solution1.winnerOfGame(color));
    }

}