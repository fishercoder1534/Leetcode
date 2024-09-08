package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._709;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _709Test {
    private _709.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _709.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("hello", solution1.toLowerCase("Hello"));
    }
}
