package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2748;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2748Test {
    private _2748.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2748.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.countBeautifulPairs(new int[] {11, 21, 12}));
    }
}
