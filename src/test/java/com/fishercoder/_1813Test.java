package com.fishercoder;

import com.fishercoder.solutions._1813;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1813Test {
    private static _1813.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1813.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.areSentencesSimilar("of", "A lot of words"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.areSentencesSimilar("Eating right now", "Eating"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.areSentencesSimilar("c h p Ny", "c BDQ r h p Ny"));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.areSentencesSimilar("A", "a A b A"));
    }
}