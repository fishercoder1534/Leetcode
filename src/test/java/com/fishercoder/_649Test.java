package com.fishercoder;

import com.fishercoder.solutions._649;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/8/17.
 */
public class _649Test {
    private static _649 test;

    @BeforeClass
    public static void setup() {
        test = new _649();
    }

    @Test
    public void test1() {
        assertEquals("Dire", test.predictPartyVictory("RDDDR"));
    }

    @Test
    public void test2() {
        assertEquals("Radiant", test.predictPartyVictory("RD"));
    }

    @Test
    public void test3() {
        assertEquals("Dire", test.predictPartyVictory("RDD"));
    }

    @Test
    public void test4() {
        assertEquals("Radiant", test.predictPartyVictory("RDDR"));
    }

    @Test
    public void test5() {
        assertEquals("Dire", test.predictPartyVictory("RDDRD"));
    }

    @Test
    public void test6() {
        assertEquals("Dire", test.predictPartyVictory("RDDDDDRR"));
    }

    @Test
    public void test7() {
        assertEquals("Dire", test.predictPartyVictory("RDDDDRR"));
    }
}
