package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1110;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1110Test {
    private _1110.Solution1 solution1;
    private _1110.Solution2 solution2;
    private _1110.Solution3 solution3;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _1110.Solution1();
        solution2 = new _1110.Solution2();
        solution3 = new _1110.Solution3();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        TreeUtils.printBinaryTree(root);
        List<TreeNode> actual = solution1.delNodes(root, new int[] {3, 5});
        for (TreeNode node : actual) {
            TreeUtils.printBinaryTree(node);
        }

        actual.clear();
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        actual = solution2.delNodes(root, new int[] {3, 5});
        for (TreeNode node : actual) {
            TreeUtils.printBinaryTree(node);
        }

        actual.clear();
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        actual = solution3.delNodes(root, new int[] {3, 5});
        for (TreeNode node : actual) {
            TreeUtils.printBinaryTree(node);
        }
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, null, 4, 3));
        TreeUtils.printBinaryTree(root);
        List<TreeNode> actual = solution1.delNodes(root, new int[] {2, 3});
        for (TreeNode node : actual) {
            TreeUtils.printBinaryTree(node);
        }
        actual.clear();
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, null, 4, 3));
        actual = solution2.delNodes(root, new int[] {2, 3});
        for (TreeNode node : actual) {
            TreeUtils.printBinaryTree(node);
        }
    }
}
