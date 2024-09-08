package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1370;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1370Test {
    private _1370.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1370.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("abccbaabccba", solution1.sortString("aaaabbbbcccc"));
    }

    @Test
    public void test2() {
        assertEquals("art", solution1.sortString("rat"));
    }

    @Test
    public void test3() {
        assertEquals("cdelotee", solution1.sortString("leetcode"));
    }

    @Test
    public void test4() {
        assertEquals("ggggggg", solution1.sortString("ggggggg"));
    }

    @Test
    public void test5() {
        assertEquals("ops", solution1.sortString("spo"));
    }
}
