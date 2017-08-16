package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._199;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _199Test {
    private static _199 test;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        test = new _199();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 3));
        assertEquals(Arrays.asList(1, 3), test.rightSideView(root));
    }

}