package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._145;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _145Test {
    private static _145.Solution1 solution1;
    private static _145.Solution2 solution2;
    private static _145.Solution3 solution3;
    private static TreeNode root;
    private static List<Integer> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _145.Solution1();
        solution2 = new _145.Solution2();
        solution3 = new _145.Solution3();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, null, 5, 6, null, 7, null, null, null, null, 8, 9));
        TreeUtils.printBinaryTree(root);
        CommonUtils.printList(solution1.postorderTraversal(root));
        CommonUtils.printList(solution2.postorderTraversal(root));
        CommonUtils.printList(solution3.postorderTraversal(root));
        expected = new ArrayList<>(Arrays.asList(8, 9, 7, 4, 2, 5, 6, 3, 1));
        assertEquals(expected, solution1.postorderTraversal(root));
        assertEquals(expected, solution2.postorderTraversal(root));
        assertEquals(expected, solution3.postorderTraversal(root));
    }
}
