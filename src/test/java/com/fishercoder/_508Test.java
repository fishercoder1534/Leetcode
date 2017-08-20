package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._508;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class _508Test {
    private static _508.Solution1 solution1;
    private static _508.Solution2 solution2;
    private static int[] expected;
    private static int[] actual;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _508.Solution1();
        solution2 = new _508.Solution2();
    }

    @Before
    public void setupForEachTest() {
        expected = new int[]{};
        actual = new int[]{};
        root = null;
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(5, 2, -3));
        expected = new int[]{2, -3, 4};
        /**Since order does NOT matter, so I'll sort them and then compare*/
        Arrays.sort(expected);
        actual = solution1.findFrequentTreeSum(root);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);

        actual = solution2.findFrequentTreeSum(root);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(5, 2, -5));
        expected = new int[]{2};
        actual = solution1.findFrequentTreeSum(root);
        assertArrayEquals(expected, actual);

        actual = solution2.findFrequentTreeSum(root);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 1, 5, 0, 2, 4, 6, null, null, null, 3));
        TreeUtils.printBinaryTree(root);
        expected = new int[]{6};
        actual = solution1.findFrequentTreeSum(root);
        assertArrayEquals(expected, actual);

        actual = solution2.findFrequentTreeSum(root);
        assertArrayEquals(expected, actual);
    }
}
