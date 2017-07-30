package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._652;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 7/30/17.
 */
public class _652Test {
    private static _652 test;
    private static List<TreeNode> expected;
    private static TreeNode root;

    @BeforeClass
    public static void setup(){
        test = new _652();
    }

    @Before
    public void setUp(){
        root = null;
    }

    @Test
    public void test1(){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(4);
        root.right.right = new TreeNode(4);

        TreeNode _2 = new TreeNode(2);
        _2.left = new TreeNode(4);
        TreeNode _4 = new TreeNode(4);
        expected = new ArrayList<>(Arrays.asList(_4, _2));
        assertEquals(expected, test.findDuplicateSubtrees(root));
    }

    @Test
    public void test2(){
        expected = new ArrayList<>();
        assertEquals(expected, test.findDuplicateSubtrees(root));
    }

    @Test
    public void test3(){
        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);

        TreeNode _1 = new TreeNode(1);
        expected = new ArrayList<>(Arrays.asList(_1));
        assertEquals(expected, test.findDuplicateSubtrees(root));
    }
}
