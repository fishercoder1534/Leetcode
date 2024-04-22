package com.fishercoder;

import com.fishercoder.solutions._60;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _60Test {
    private static _60.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _60.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("231", solution1.getPermutation(3, 4));
    }
}
