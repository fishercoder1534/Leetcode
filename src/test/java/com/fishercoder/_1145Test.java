package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1145;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class _1145Test {

    private static _1145.Solution1 solution1;
    private static TreeNode root;
    private static int n;
    private static int x;

    @BeforeClass
    public static void setup() {
        solution1 = new _1145.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        n = 11;
        x = 3;
        Assert.assertEquals(true, solution1.btreeGameWinningMove(root, n, x));
    }
}
