package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fishercoder.solutions.fourththousand._3083;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3083Test {
    private _3083.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3083.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.isSubstringPresent("leetcode"));
    }
}
