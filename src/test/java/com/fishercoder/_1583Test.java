package com.fishercoder;

import com.fishercoder.solutions._1583;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1583Test {
    private static _1583.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1583.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.unhappyFriends(4, new int[][]{
                        {1, 2, 3},
                        {3, 2, 0},
                        {3, 1, 0},
                        {1, 2, 0}
                },
                new int[][]{
                        {0, 1},
                        {2, 3}
                }));
    }

}