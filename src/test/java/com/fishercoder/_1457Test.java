package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1456;
import com.fishercoder.solutions._1457;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class _1457Test {
    private static _1457.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1457.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(2, 3, 1, 3, 1, null, 1));
        assertEquals(2, solution1.pseudoPalindromicPaths(root));
    }

}