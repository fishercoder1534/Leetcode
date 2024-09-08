package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._649;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Created by fishercoder on 5/8/17. */
public class _649Test {
    private _649.Solution1 solution1;

    @BeforeEach
    public void setup() {
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
