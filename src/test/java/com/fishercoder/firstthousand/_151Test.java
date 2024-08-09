package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._151;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _151Test {
    private _151.Solution1 solution1;
    private _151.Solution2 solution2;
    private _151.Solution3 solution3;
    private static String s;

    @BeforeEach
    public void setup() {
        solution1 = new _151.Solution1();
        solution2 = new _151.Solution2();
        solution3 = new _151.Solution3();
    }

    @Test
    public void test1() {
        s = " ";
        assertEquals("", solution1.reverseWords(s));
    }

    @Test
    public void test2() {
        s = " 1";
        assertEquals("1", solution1.reverseWords(s));
    }

    @Test
    public void test3() {
        s = "   a   b ";
        assertEquals("b a", solution1.reverseWords(s));
    }

    @Test
    public void test4() {
        s = "a b  c";
        assertEquals("c b a", solution1.reverseWords(s));
    }

    @Test
    public void test5() {
        s = "  hello world  ";
        assertEquals("world hello", solution2.reverseWords(s));
        assertEquals("world hello", solution3.reverseWords(s));
    }

    @Test
    public void test6() {
        s = "Bob    Loves  Alice   ";
        assertEquals("Alice Loves Bob", solution2.reverseWords(s));
        assertEquals("Alice Loves Bob", solution3.reverseWords(s));
    }
}
