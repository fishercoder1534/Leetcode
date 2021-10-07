package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._2018;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2018Test {
    private static _2018.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _2018.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.placeWordInCrossword(new char[][]{
                {'#', ' ', '#'},
                {' ', ' ', '#'},
                {'#', 'c', ' '}
        }, "abc"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.placeWordInCrossword(new char[][]{
                {' ', '#', 'a'},
                {' ', '#', 'c'},
                {' ', '#', 'a'}
        }, "ac"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.placeWordInCrossword(new char[][]{
                {'#', ' ', '#'},
                {' ', ' ', '#'},
                {'#', ' ', 'c'}
        }, "ca"));
    }

    @Test
    public void test4() {
        assertEquals(true, solution1.placeWordInCrossword(new char[][]{
                {'#', ' ', '#'},
                {' ', ' ', '#'},
                {'#', ' ', 'c'}
        }, "cd"));
    }

    @Test
    public void test5() {
        assertEquals(true, solution1.placeWordInCrossword(new char[][]{
                {'#', ' ', '#'},
                {' ', '#', '#'},
                {'#', ' ', 'c'}
        }, "ca"));
    }

    @Test
    public void test6() {
        assertEquals(true, solution1.placeWordInCrossword(new char[][]{
                {'#', ' ', '#'},
                {'#', 'c', '#'},
                {'#', '#', 'c'}
        }, "ca"));
    }

    @Test
    public void test7() {
        assertEquals(false, solution1.placeWordInCrossword(new char[][]{
                {' ', 'b', '#'},
                {' ', '#', '#'},
                {' ', ' ', 'c'}
        }, "ca"));
    }

    @Test
    public void test8() {
        assertEquals(true, solution1.placeWordInCrossword(
                CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray("[\"#\",\" \",\"#\"],[\" \",\" \",\"#\"],[\"#\",\"c\",\" \"]"),
                "abc"));
    }

}