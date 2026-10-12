package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3696;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3696Test {
    private _3696.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3696.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.maxDistance(new String[]{"a", "b", "c", "a", "a"}));
    }

}
