package com.fishercoder;

import com.fishercoder.solutions._1249;
import org.junit.BeforeClass;
import org.junit.Test;

public class _1249Test {
    private static _1249.Solution1 solution1;
    private static _1249.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1249.Solution1();
        solution2 = new _1249.Solution2();
    }

    @Test
    public void test1() {
        System.out.println(solution1.minRemoveToMakeValid("lee(t(c)o)de)"));
        System.out.println(solution2.minRemoveToMakeValid("lee(t(c)o)de)"));
    }

    @Test
    public void test2() {
        System.out.println(solution1.minRemoveToMakeValid("a)b(c)d"));
    }

    @Test
    public void test3() {
        System.out.println(solution1.minRemoveToMakeValid("))(("));
    }

    @Test
    public void test4() {
        System.out.println(solution1.minRemoveToMakeValid("(a(b(c)d)"));
    }

    @Test
    public void test5() {
        System.out.println(solution1.minRemoveToMakeValid("())()((("));//should be "()()"
    }

}