package com.fishercoder;

import com.fishercoder.solutions._71;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _71Test {
    private static _71.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _71.Solution1();
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
}
