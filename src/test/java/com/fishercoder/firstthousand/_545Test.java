package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._545;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _545Test {
    private _545.Solution1 test;
    private static TreeNode root;
    private static List<Integer> expected;

    @BeforeEach
    public void setup() {
        test = new _545.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 4, 5, null, 6, 7));
        TreeUtils.printBinaryTree(root);
        expected = Arrays.asList(1, 2, 4, 6, 7, 5, 3);
        assertEquals(expected, test.boundaryOfBinaryTree(root));
    }
}
