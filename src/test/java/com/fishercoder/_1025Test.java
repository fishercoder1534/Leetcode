package com.fishercoder;

import com.fishercoder.solutions._1025;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class _1025Test {
    private static _1025.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1025.Solution1();
    }

    @Test
    public void test1() {
        // Alice chooses 1, Bob has no moves
        assertTrue(solution1.divisorGame(2));
    }

    @Test
    public void test2() {
        // Alice can only choose 1, Bob starts with 2 which is a winning position
        assertFalse(solution1.divisorGame(3));
    }

    @Test
    public void test3() {
        // Since 3 is a losing position, Alice chooses 1
        assertTrue(solution1.divisorGame(4));
    }

    @Test
    public void test4() {
        // Alice can only choose 1, and 4 is a winning position
        assertFalse(solution1.divisorGame(5));
    }

    @Test
    public void test5() {
        // Alice can only choose 1, 2 or 3. She will choose 1 since 5 is a losing position
        assertTrue(solution1.divisorGame(6));
    }
}
