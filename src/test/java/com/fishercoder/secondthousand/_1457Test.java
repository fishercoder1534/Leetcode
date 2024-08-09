package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1457;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1457Test {
    private _1457.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1457.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(2, 3, 1, 3, 1, null, 1));
        assertEquals(2, solution1.pseudoPalindromicPaths(root));
    }

}