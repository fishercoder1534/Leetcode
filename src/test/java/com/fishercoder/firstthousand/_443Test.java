package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._443;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _443Test {
    private _443.Solution1 solution1;
    private static char[] chars;

    @BeforeEach
    public void setup() {
        solution1 = new _443.Solution1();
    }

    @Test
    public void test1() {
        chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        assertEquals(6, solution1.compress(chars));
    }

    @Test
    public void test2() {
        chars = new char[]{'a'};
        assertEquals(1, solution1.compress(chars));
    }

    @Test
    public void test3() {
        chars = new char[]{'a', 'b'};
        assertEquals(2, solution1.compress(chars));
    }

    @Test
    public void test4() {
        chars = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertEquals(4, solution1.compress(chars));
    }
}