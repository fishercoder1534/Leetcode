package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1405;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1405Test {
    private static _1405.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1405.Solution1();
    }

    @Test
    public void test1() {
        System.out.println(solution1.longestDiverseString(1, 1, 7));
    }

    @Test
    public void test2() {
        System.out.println(solution1.longestDiverseString(0, 8, 11));
    }

    @Test
    public void test3() {
        System.out.println(solution1.longestDiverseString(0, 0, 7));
    }
}
