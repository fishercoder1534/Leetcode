package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._617;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by stevesun on 6/10/17.
 */
public class _617Test {
    private static _617.Solution1 solution1;
    private static TreeNode t1;
    private static TreeNode t2;
    private static TreeNode actual;
    private static TreeNode expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _617.Solution1();
    }

    @Test
    public void test1() {
        t1 = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2, 5));

        t2 = TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3, null, 4, null, 7));

        expected = TreeUtils.constructBinaryTree(Arrays.asList(3, 4, 5, 5, 4, null, 7));

        actual = solution1.mergeTrees(t1, t2);

        assertEquals(expected, actual);
    }

}
