package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.secondthousand._1861;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1861Test {
    private _1861.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1861.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new char[][] {{'.'}, {'#'}, {'#'}},
                solution1.rotateTheBox(new char[][] {{'#', '.', '#'}}));
    }

    @Test
    public void test2() {
        assertArrayEquals(
                new char[][] {
                    {'#', '.'},
                    {'#', '#'},
                    {'*', '*'},
                    {'.', '.'}
                },
                solution1.rotateTheBox(
                        new char[][] {
                            {'#', '.', '*', '.'},
                            {'#', '#', '*', '.'}
                        }));
    }

    @Test
    public void test3() {
        assertArrayEquals(
                new char[][] {
                    {'.', '#', '#'},
                    {'.', '#', '#'},
                    {'#', '#', '*'},
                    {'#', '*', '.'},
                    {'#', '.', '*'},
                    {'#', '.', '.'}
                },
                solution1.rotateTheBox(
                        new char[][] {
                            {'#', '#', '*', '.', '*', '.'},
                            {'#', '#', '#', '*', '.', '.'},
                            {'#', '#', '#', '.', '#', '.'}
                        }));
    }
}
