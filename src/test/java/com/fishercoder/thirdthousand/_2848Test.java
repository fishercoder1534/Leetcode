package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2848;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2848Test {
    private static _2848.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2848.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(7, solution1.numberOfPoints(Arrays.asList(Arrays.asList(3, 6),
                Arrays.asList(1, 5),
                Arrays.asList(4, 7))));
    }

}
