package com.fishercoder;

import com.fishercoder.solutions._1557;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _1557Test {
    private static _1557.Solution1 solution1;
    private static List<List<Integer>> edges;

    @BeforeClass
    public static void setup() {
        solution1 = new _1557.Solution1();
    }

    @Test
    public void test1() {
        edges = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(0, 2), Arrays.asList(2, 5), Arrays.asList(3, 4), Arrays.asList(4, 2));
        assertEquals(Arrays.asList(0, 3), solution1.findSmallestSetOfVertices(6, edges));
    }

    @Test
    public void test2() {
        edges = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(2, 1), Arrays.asList(3, 1), Arrays.asList(1, 4), Arrays.asList(2, 4));
        assertEquals(Arrays.asList(0, 2, 3), solution1.findSmallestSetOfVertices(5, edges));
    }

}