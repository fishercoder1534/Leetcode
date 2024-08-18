package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1361;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1361Test {
    private _1361.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1361.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                true,
                solution1.validateBinaryTreeNodes(
                        4, new int[] {1, -1, 3, -1}, new int[] {2, -1, -1, -1}));
    }

    @Test
    public void test2() {
        assertEquals(
                false,
                solution1.validateBinaryTreeNodes(
                        4, new int[] {1, -1, 3, -1}, new int[] {2, 3, -1, -1}));
    }

    @Test
    public void test3() {
        assertEquals(
                false, solution1.validateBinaryTreeNodes(2, new int[] {1, 0}, new int[] {-1, -1}));
    }

    @Test
    public void test4() {
        assertEquals(
                false,
                solution1.validateBinaryTreeNodes(
                        6, new int[] {1, -1, -1, 4, -1, -1}, new int[] {2, -1, -1, 5, -1, -1}));
    }
}
