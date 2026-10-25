package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2302;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2302Test {
    private _2302.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2302.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.countSubarrays(new int[]{2, 1, 4, 3, 5}, 10));
    }

}
