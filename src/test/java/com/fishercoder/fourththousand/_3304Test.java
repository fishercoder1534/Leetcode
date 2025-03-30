package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3304;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3304Test {
    private _3304.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3304.Solution1();
    }

    @Test
    public void test1() {
        assertEquals('b', solution1.kthCharacter(5));
    }

    @Test
    public void test2() {
        assertEquals('h', solution1.kthCharacter(128));
    }
}
