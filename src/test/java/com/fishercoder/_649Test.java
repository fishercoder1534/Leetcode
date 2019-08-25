package com.fishercoder;

import com.fishercoder.solutions._649;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/8/17.
 */
public class _649Test {
    private static _649.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _649.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("Dire", solution1.predictPartyVictory("RDDDR"));
    }

    @Test
    public void test2() {
        assertEquals("Radiant", solution1.predictPartyVictory("RD"));
    }

    @Test
    public void test3() {
        assertEquals("Dire", solution1.predictPartyVictory("RDD"));
    }

    @Test
    public void test4() {
        assertEquals("Radiant", solution1.predictPartyVictory("RDDR"));
    }

    @Test
    public void test5() {
        assertEquals("Dire", solution1.predictPartyVictory("RDDRD"));
    }

    @Test
    public void test6() {
        assertEquals("Dire", solution1.predictPartyVictory("RDDDDDRR"));
    }

    @Test
    public void test7() {
        assertEquals("Dire", solution1.predictPartyVictory("RDDDDRR"));
    }
}
