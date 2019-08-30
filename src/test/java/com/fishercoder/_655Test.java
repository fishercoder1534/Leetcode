package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._655;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _655Test {
    private static List<List<String>> expected;
    private static TreeNode root;
    private static _655.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _655.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2));
        expected = new ArrayList<>(2);
        List<String> row1 = new ArrayList<>(3);
        row1.add("");
        row1.add("1");
        row1.add("");
        expected.add(row1);
        List<String> row2 = new ArrayList<>(3);
        row2.add(0, "2");
        row2.add("");
        row2.add("");
        expected.add(row2);
        CommonUtils.printListList(expected);
        assertEquals(expected, solution1.printTree(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 4));
        TreeUtils.printBinaryTree(root);
        CommonUtils.printListList(solution1.printTree(root));
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, null, 30, 10, null, null, 15, null, 45));
        TreeUtils.printBinaryTree(root);
        CommonUtils.printListList(solution1.printTree(root));
        System.out.println(solution1.printTree(root));
    }
}
