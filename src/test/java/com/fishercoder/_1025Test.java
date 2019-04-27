package com.fishercoder;

import com.fishercoder.solutions._1025;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class _1025Test {
    private static _1025.Solution1 solution1;
    Random rdm = new Random();
    int RANGE = 256; //can be any number, so long as 2*RANGE + 1 is within bounds

    @BeforeClass
    public static void setup() {
        solution1 = new _1025.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.divisorGame(1));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.divisorGame(2));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.divisorGame(2*rdm.nextInt(RANGE)));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.divisorGame(2*rdm.nextInt(RANGE)+1));
    }
}