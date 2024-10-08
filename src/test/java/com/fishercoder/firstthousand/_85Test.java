package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._85;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _85Test {
    private _85.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _85.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                6,
                (solution1.maximalRectangle(
                        new char[][] {
                            {'1', '0', '1', '0', '0'},
                            {'1', '0', '1', '1', '1'},
                            {'1', '1', '1', '1', '1'},
                            {'1', '0', '0', '1', '0'}
                        })));
    }
}
