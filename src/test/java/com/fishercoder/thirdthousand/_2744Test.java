package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2744;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2744Test {
    private _2744.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2744.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                2,
                solution1.maximumNumberOfStringPairs(new String[] {"cd", "ac", "dc", "ca", "zz"}));
    }
}
