package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1305;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1305Test {
    private _1305.Solution1 solution1;
    private static TreeNode root1;
    private static TreeNode root2;

    @BeforeEach
    public void setup() {
        solution1 = new _1305.Solution1();
    }

    @Test
    public void test1() {
        root1 = TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 4));
        root2 = TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 3));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 4), solution1.getAllElements(root1, root2));
    }
}
