package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._880;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
public class _880Test {
    private _880.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _880.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("o", solution1.decodeAtIndex("leet2code3", 10));
    }

    @Test
    public void test2() {
        assertEquals("h", solution1.decodeAtIndex("ha22", 5));
    }

    @Test
    public void test3() {
        assertEquals("a", solution1.decodeAtIndex("a2345678999999999999999", 1));
    }

    @Test
    public void test4() {
        assertEquals("a", solution1.decodeAtIndex("abc", 1));
    }

    @Test
    public void test5() {
        assertEquals("a", solution1.decodeAtIndex("a2b3c4d5e6f7g8h9", 10));
    }

}