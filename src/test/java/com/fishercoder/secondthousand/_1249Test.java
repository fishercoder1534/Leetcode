package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1249;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1249Test {
    private _1249.Solution1 solution1;
    private _1249.Solution2 solution2;

    @BeforeEach
    public void setup() {
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
        System.out.println(solution1.minRemoveToMakeValid("())()(((")); // should be "()()"
    }
}
