package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._501;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by fishercoder on 1/28/17.
 */
public class _501Test {
    private static _501 test;
    private static int[] expected;
    private static int[] actual;
    private static TreeNode treeNode;

    @BeforeClass
    public static void setup() {
        test = new _501();
    }

    @Before
    public void setupForEachTest() {
        expected = new int[]{};
        actual = new int[]{};
        treeNode = new TreeNode(0);
    }

    @Test
    public void test1() {

        treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(2);
        expected = new int[]{2};
        CommonUtils.printArray(expected);
        CommonUtils.printArray(actual);
        actual = test.findMode(treeNode);
        assertArrayEquals(expected, actual);

    }
}
