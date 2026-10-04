package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3912;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3912Test {
    private _3912.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3912.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 4, 3, 2)), solution1.findValidElements(new int[]{1, 2, 4, 2, 3, 2}));
    }
}
