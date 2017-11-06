package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._515;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _515Test {
    private static _515.Solution1 solution1;
    private static _515.Solution2 solution2;
    private static List<Integer> expected;
    private static List<Integer> actual;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _515.Solution1();
        solution2 = new _515.Solution2();
    }

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        expected = Arrays.asList(1, 3);
        actual = solution1.largestValues(root);
        assertEquals(expected, actual);

        actual = solution2.largestValues(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        expected = new ArrayList<>();
        actual = solution1.largestValues(null);
        assertEquals(expected, actual);

        actual = solution2.largestValues(null);
        assertEquals(expected, actual);
    }
}
