package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1161;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class _1161Test {
    private static _1161.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1161.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 7, 0, 7, -8, null, null));
        assertEquals(2, solution1.maxLevelSum(root));
    }
}
