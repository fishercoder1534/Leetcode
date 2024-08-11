package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._119;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _119Test {
    private _119.Solution1 solution1;
    private _119.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _119.Solution1();
        solution2 = new _119.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(1, 3, 3, 1), solution1.getRow(3));
        assertEquals(Arrays.asList(1, 3, 3, 1), solution2.getRow(3));
    }

}