package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._381;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _381Test {
    private static _381.Solution1.RandomizedCollection randomizedCollection;

    @BeforeEach
    public void setup() {
        randomizedCollection = new _381.Solution1.RandomizedCollection();
    }

    @Test
    public void test1() {
        assertTrue(randomizedCollection.insert(1));
        assertFalse(randomizedCollection.insert(1));
        assertTrue(randomizedCollection.insert(2));
        randomizedCollection.getRandom();
        assertTrue(randomizedCollection.remove(2));
        randomizedCollection.getRandom();
    }

}