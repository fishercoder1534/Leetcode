package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1813;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1813Test {
    private _1813.Solution1 solution1;

    @BeforeEach
    public void setup() {
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