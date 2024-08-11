package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._199;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _199Test {
    private _199.Solution1 solution1;
    private _199.Solution2 solution2;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _199.Solution1();
        solution2 = new _199.Solution2();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 3));
        assertEquals(Arrays.asList(1, 3), solution1.rightSideView(root));
        assertEquals(Arrays.asList(1, 3), solution2.rightSideView(root));
    }

}