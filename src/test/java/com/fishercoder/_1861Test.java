package com.fishercoder;

import com.fishercoder.solutions._1861;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1861Test {
    private static _1861.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1861.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(new char[][]{{'.'}, {'#'}, {'#'}}, solution1.rotateTheBox(new char[][]{
                {'#', '.', '#'}
        }));
    }

    @Test
    public void test2() {
        assertEquals(new char[][]{
                        {'#', '.'},
                        {'#', '#'},
                        {'*', '*'},
                        {'.', '.'}},
                solution1.rotateTheBox(new char[][]{
                        {'#', '.', '*', '.'},
                        {'#', '#', '*', '.'}
                }));
    }

    @Test
    public void test3() {
        assertEquals(new char[][]{
                        {'.', '#', '#'},
                        {'.', '#', '#'},
                        {'#', '#', '*'},
                        {'#', '*', '.'},
                        {'#', '.', '*'},
                        {'#', '.', '.'}
                },
                solution1.rotateTheBox(new char[][]{
                        {'#', '#', '*', '.', '*', '.'},
                        {'#', '#', '#', '*', '.', '.'},
                        {'#', '#', '#', '.', '#', '.'}
                }));
    }

}