package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._2;
import com.fishercoder.solutions._744;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _744Test {
    private static _744.Solution1 solution1;
    private static char[] letters;

    @BeforeClass
    public static void setup() {
        solution1 = new _744.Solution1();
    }

    @Test
    public void test1() {
        letters = new char[]{'c', 'f', 'j'};
        assertEquals('c', solution1.nextGreatestLetter(letters, 'a'));
    }

    @Test
    public void test2() {
        letters = new char[]{'c', 'f', 'j'};
        assertEquals('f', solution1.nextGreatestLetter(letters, 'c'));
    }

    @Test
    public void test3() {
        letters = new char[]{'c', 'f', 'j'};
        assertEquals('f', solution1.nextGreatestLetter(letters, 'd'));
    }

    @Test
    public void test4() {
        letters = new char[]{'c', 'f', 'j'};
        assertEquals('j', solution1.nextGreatestLetter(letters, 'g'));
    }

    @Test
    public void test5() {
        letters = new char[]{'c', 'f', 'j'};
        assertEquals('c', solution1.nextGreatestLetter(letters, 'j'));
    }

    @Test
    public void test6() {
        letters = new char[]{'c', 'f', 'j'};
        assertEquals('c', solution1.nextGreatestLetter(letters, 'k'));
    }

}