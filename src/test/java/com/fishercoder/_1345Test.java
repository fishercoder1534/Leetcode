package com.fishercoder;

import com.fishercoder.solutions._1345;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1345Test {
    private static _1345.Solution1 solution1;
    private static int[] arr;

    @BeforeClass
    public static void setup() {
        solution1 = new _1345.Solution1();
    }

    @Test
    public void test1() {
        arr = new int[]{100, -23, -23, 404, 100, 23, 23, 23, 3, 404};
        assertEquals(3, solution1.minJumps(arr));
    }

    @Test
    public void test2() {
        arr = new int[]{7};
        assertEquals(0, solution1.minJumps(arr));
    }

    @Test
    public void test3() {
        arr = new int[]{7, 6, 9, 6, 9, 6, 9, 7};
        assertEquals(1, solution1.minJumps(arr));
    }

    @Test
    public void test4() {
        arr = new int[]{6, 1, 9};
        assertEquals(2, solution1.minJumps(arr));
    }

    @Test
    public void test5() {
        arr = new int[]{11, 22, 7, 7, 7, 7, 7, 7, 7, 22, 13};
        assertEquals(3, solution1.minJumps(arr));
    }

    @Test
    public void test6() {
        arr = new int[]{7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 11};
        assertEquals(2, solution1.minJumps(arr));
    }

}