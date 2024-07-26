package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2729;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class _2729Test {
    private static _2729.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2729.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.isFascinating(192));
    }

}
