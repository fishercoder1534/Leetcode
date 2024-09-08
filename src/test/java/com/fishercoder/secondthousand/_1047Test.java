package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1047;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1047Test {
    private _1047.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1047.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("ca", solution1.removeDuplicates("abbaca"));
    }
}
