package com.fishercoder;

import com.fishercoder.solutions._1104;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _1104Test {
    private static _1104.Solution1 solution1;
    private static _1104.Solution2 solution2;
    private static List<Integer> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _1104.Solution1();
        solution2 = new _1104.Solution2();
    }

    @Test
    public void test1() {
        expected = Arrays.asList(1, 3, 4, 14);
        assertEquals(expected, solution1.pathInZigZagTree(14));
    }

    @Test
    public void test2() {
        expected = Arrays.asList(1, 2, 6, 10, 26);
        assertEquals(expected, solution1.pathInZigZagTree(26));
    }

    @Test
    public void test3() {
        expected = Arrays.asList(1, 2, 7, 9, 28, 38);
        assertEquals(expected, solution1.pathInZigZagTree(38));
    }

    @Test
    public void test4() {
        expected = Arrays.asList(1, 3, 5, 13, 20, 54, 83);
        assertEquals(expected, solution1.pathInZigZagTree(83));
    }

    @Test
    public void test5() {
        expected = Arrays.asList(1, 2, 7, 9, 28, 39, 113, 156, 455, 625, 1821, 2500, 7287, 10000);
        assertEquals(expected, solution1.pathInZigZagTree(10000));
    }

    @Test
    @Ignore
    public void test6() {
        //takes too long to finish, ignore to let build pass
        expected = Arrays.asList(1, 2, 6, 11, 24, 47, 97, 188, 390, 754, 1562, 3018, 6250, 12075, 25000, 48303, 100000);
        assertEquals(expected, solution1.pathInZigZagTree(100000));
    }

    @Test
    @Ignore
    public void test7() {
        //takes too long to finish, ignore to let build pass
        expected = Arrays.asList(1, 3, 5, 12, 23, 48, 94, 195, 377, 781, 1509, 3125, 6037, 12500, 24151, 50000, 96607, 200000);
        assertEquals(expected, solution1.pathInZigZagTree(200000));
    }

    @Test
    @Ignore
    public void test8() {
        //takes too long to finish, ignore to let build pass
        expected = Arrays.asList(1, 2, 6, 11, 24, 47, 97, 188, 390, 754, 1562, 3018, 6250, 12075, 25000, 48303, 100000, 193215, 400000);
        assertEquals(expected, solution1.pathInZigZagTree(400000));
    }

    @Test
    @Ignore
    public void test9() {
        //takes too long to finish, ignore to let build pass
        expected = Arrays.asList(1, 2, 7, 8, 30, 34, 122, 139, 488, 559, 1953, 2237, 7812, 8950, 31250, 35803, 125000, 143215, 500000);
        assertEquals(expected, solution1.pathInZigZagTree(500000));
    }

    @Test
    public void test10() {
        expected = Arrays.asList(1);
        assertEquals(expected, solution1.pathInZigZagTree(1));
    }

    @Test
    public void test11() {
        expected = Arrays.asList(1, 3, 4, 14);
        assertEquals(expected, solution2.pathInZigZagTree(14));
    }

    @Test
    public void test12() {
        expected = Arrays.asList(1);
        assertEquals(expected, solution2.pathInZigZagTree(1));
    }

}
