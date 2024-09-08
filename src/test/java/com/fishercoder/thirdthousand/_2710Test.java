package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2710;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2710Test {
    private _2710.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2710.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("512301", solution1.removeTrailingZeros("51230100"));
    }
}
