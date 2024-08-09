package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1447;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1447Test {
    private _1447.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1447.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList("1/2"), solution1.simplifiedFractions(2));
    }

}