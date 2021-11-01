package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._297;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _297Test {
    private static _297.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _297.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, null, 4, 5, 6, 7));
        TreeUtils.printBinaryTree(root);
        String str = solution1.serialize(root);
        System.out.println(str);
        TreeUtils.printBinaryTree(solution1.deserialize(str));
        assertEquals(root, solution1.deserialize(str));
    }

}