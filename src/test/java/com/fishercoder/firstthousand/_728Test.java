package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._728;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _728Test {
    private _728.Solution1 solution1;
    private static List<Integer> expected;

    @BeforeEach
    public void setup() {
        solution1 = new _728.Solution1();
    }

    @Test
    public void test1() {
        expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
        assertEquals(expected, solution1.selfDividingNumbers(1, 22));
    }

}