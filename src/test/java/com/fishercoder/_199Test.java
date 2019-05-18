package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._199;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _199Test {
    private static _199.Solution1 solution1;
    private static _199.Solution2 solution2;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
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