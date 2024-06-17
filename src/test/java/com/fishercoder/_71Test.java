package com.fishercoder;

import com.fishercoder.solutions._1st_thousand._71;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _71Test {
    private static _71.Solution1 solution1;
    private static _71.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _71.Solution1();
        solution2 = new _71.Solution2();
    }

    @Test
    public void test1() {
        assertEquals("/home", solution1.simplifyPath("/home/"));
    }

    @Test
    public void test2() {
        assertEquals("/c", solution1.simplifyPath("/a/./b/../../c/"));
    }

    @Test
    public void test3() {
        assertEquals("/a/b/c", solution1.simplifyPath("/a//b////c/d//././/.."));
    }

    @Test
    public void test4() {
        assertEquals("/", solution1.simplifyPath("/."));
    }

    @Test
    public void test5() {
//        assertEquals("/home/user/Pictures", solution1.simplifyPath("/home/user/Documents/../Pictures"));
        assertEquals("/home/user/Pictures", solution2.simplifyPath("/home/user/Documents/../Pictures"));
    }

    @Test
    public void test6() {
        assertEquals("/", solution1.simplifyPath("/../"));
        assertEquals("/", solution2.simplifyPath("/../"));
    }
}
