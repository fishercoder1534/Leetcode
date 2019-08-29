package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._653;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class _653Test {
    private static _653.Solution1 solution1;
    private static boolean expected;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _653.Solution1();
    }

    @Before
    public void setupForEachTest() {
        root = null;
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(new ArrayList<>(Arrays.asList(5, 3, 2, 4, 6, 7)));
        expected = true;
        assertEquals(expected, solution1.findTarget(root, 9));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(new ArrayList<>(Arrays.asList(2, 1, 3)));
        expected = true;
        assertEquals(expected, solution1.findTarget(root, 4));
    }

    @Test
    public void test3() {
        root = new TreeNode(1);
        expected = false;
        assertEquals(expected, solution1.findTarget(root, 2));
    }

    @Test
    public void test4() {
        /**
         *       2
         *      / \
         *     0   3
         *    / \
         *   -4  1
         *
         *   target = 1;
         *   expected = true;
         * */

        root = TreeUtils.constructBinaryTree(new ArrayList<>(Arrays.asList(2, 0, -4, 1, 3)));
        expected = true;
        assertEquals(expected, solution1.findTarget(root, -1));
    }

    @Test
    public void test5() {
        root = TreeUtils.constructBinaryTree(new ArrayList<>(Arrays.asList(2, 1, 3, -4, 0)));
        expected = true;
        assertEquals(expected, solution1.findTarget(root, 2));
    }

    @Test
    public void test6() {
        root = TreeUtils.constructBinaryTree(new ArrayList<>(Arrays.asList(
                3393, 2264, 4972, 1908, 3252, 4128, 5140, 965, 2018,
                3082, null, 3838, 4196, 5085, null, 559, 1187, null, 2143, 2968,
                null, 3810, 3957, null, 4825, null, null, 0, 908, 1135, 1659, null,
                null, 2764, null, 3581, null, null, 4106, 4498, null, null,
                498, 821, null, null, null, 1262, 1826, 2513, 2910, 3486, 3708,
                null, null, 4377, 4673, 231, null, null, null, null, 1482,
                null, null, 2386, 2690, null, null, null, null, null, null, 4349, null,
                null, null, 170, 376, 1421, 1613, null, null, 2534, null,
                null, null, 96, null, null, null, 1303)));
        expected = true;
        assertEquals(expected, solution1.findTarget(root, 5831));
//        TreeUtils.printBinaryTree(root);
//        assertEquals(expected, mapSolution.findTarget(root, 5831));
    }
}
