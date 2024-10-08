package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2913;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2913Test {
    private _2913.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2913.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(15, solution1.sumCounts(Arrays.asList(1, 2, 1)));
    }
}
