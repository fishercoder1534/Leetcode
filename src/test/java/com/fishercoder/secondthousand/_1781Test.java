package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1781;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1781Test {
    private _1781.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1781.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.beautySum("aabcb"));
    }
}
