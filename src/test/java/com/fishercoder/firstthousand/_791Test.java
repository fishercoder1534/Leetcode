package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._791;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _791Test {
    private _791.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _791.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("cbad", solution1.customSortString("cba", "abcd"));
    }
}
