package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1079;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1079Test {
    private _1079.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1079.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(8, solution1.numTilePossibilities("AAB"));
    }

    @Test
    public void test2() {
        assertEquals(188, solution1.numTilePossibilities("AAABBC"));
    }
}
