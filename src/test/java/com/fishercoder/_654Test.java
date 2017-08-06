package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._654;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _654Test {
    private static int[] nums;
    private static TreeNode expected;
    private static _654.VerboseButCompletelyOriginalSolution verboseButCompletelyOriginalSolution;

    @BeforeClass
    public static void setup(){
        verboseButCompletelyOriginalSolution = new _654.VerboseButCompletelyOriginalSolution();
    }

    @Test
    public void test1(){
        nums = new int[]{3,2,1,6,0,5};
        expected = new TreeNode(6);
        expected.left = new TreeNode(3);
        expected.left.right = new TreeNode(2);
        expected.left.right.right = new TreeNode(1);
        expected.right = new TreeNode(5);
        expected.right.left = new TreeNode(0);
        assertEquals(expected, verboseButCompletelyOriginalSolution.constructMaximumBinaryTree(nums));
    }
}
