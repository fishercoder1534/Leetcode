package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._216;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _216Test {
    private _216.Solution1 solution1;
    private _216.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _216.Solution1();
        solution2 = new _216.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(Arrays.asList(1, 2, 4)), solution1.combinationSum3(3, 7));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(Arrays.asList(1, 2, 4)), solution2.combinationSum3(3, 7));
    }
}
