package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._987;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class _987Test {
    private static _987.Solution1 solution1;
    private static TreeNode root;
    private static List<List<Integer>> expected;
    private static List<List<Integer>> actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _987.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        expected = Arrays.asList(Arrays.asList(9), Arrays.asList(3, 15), Arrays.asList(20), Arrays.asList(7));
        actual = solution1.verticalTraversal(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        expected = Arrays.asList(Arrays.asList(4), Arrays.asList(2), Arrays.asList(1, 5, 6), Arrays.asList(3), Arrays.asList(7));
        actual = solution1.verticalTraversal(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(0, 5, 1, 9, null, 2, null, null, null, null, 3, 4, 8, 6, null, null, null, 7));
        TreeUtils.printBinaryTree(root);
        expected = Arrays.asList(Arrays.asList(9, 7), Arrays.asList(5, 6), Arrays.asList(0, 2, 4), Arrays.asList(1, 3), Arrays.asList(8));
        actual = solution1.verticalTraversal(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(0, 2, 1, 3, null, null, null, 4, 5, null, 7, 6, null, 10, 8, 11, 9));
        TreeUtils.printBinaryTree(root);
        expected = Arrays.asList(Arrays.asList(4, 10, 11), Arrays.asList(3, 6, 7), Arrays.asList(2, 5, 8, 9), Arrays.asList(0), Arrays.asList(1));
        actual = solution1.verticalTraversal(root);
        assertEquals(expected, actual);
    }

}
