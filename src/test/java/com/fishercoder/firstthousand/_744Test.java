package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._744;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _744Test {
    private _744.Solution1 solution1;
    private static char[] letters;

    @BeforeEach
    public void setup() {
        solution1 = new _744.Solution1();
    }

    @Test
    public void test1() {
        letters = new char[] {'c', 'f', 'j'};
        assertEquals('c', solution1.nextGreatestLetter(letters, 'a'));
    }

    @Test
    public void test2() {
        letters = new char[] {'c', 'f', 'j'};
        assertEquals('f', solution1.nextGreatestLetter(letters, 'c'));
    }

    @Test
    public void test3() {
        letters = new char[] {'c', 'f', 'j'};
        assertEquals('f', solution1.nextGreatestLetter(letters, 'd'));
    }

    @Test
    public void test4() {
        letters = new char[] {'c', 'f', 'j'};
        assertEquals('j', solution1.nextGreatestLetter(letters, 'g'));
    }

    @Test
    public void test5() {
        letters = new char[] {'c', 'f', 'j'};
        assertEquals('c', solution1.nextGreatestLetter(letters, 'j'));
    }

    @Test
    public void test6() {
        letters = new char[] {'c', 'f', 'j'};
        assertEquals('c', solution1.nextGreatestLetter(letters, 'k'));
    }
}
