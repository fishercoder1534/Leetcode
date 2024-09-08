package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1973;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1973Test {
    private _1973.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1973.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(10, 3, 4, 2, 1));
        TreeUtils.printBinaryTree(root);
        assertEquals(2, solution1.equalToDescendants(root));
    }
}
