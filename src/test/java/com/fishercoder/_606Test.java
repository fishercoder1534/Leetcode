package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._606;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 6/4/17.
 */
public class _606Test {
    private static _606 test;
    private static TreeNode treeNode;

    @BeforeClass
    public static void setup() {
        test = new _606();
    }

    @Test
    public void test1() {
        treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        System.out.println("Test1");
        assertEquals("1(2(4))(3)", test.tree2str(treeNode));
    }

    @Test
    public void test2() {
        treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        System.out.println("Test2");
        assertEquals("1(2()(4))(3)", test.tree2str(treeNode));
    }

    @Test
    public void test3() {
        treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.right = new TreeNode(3);
        System.out.println("Test3");
        assertEquals("1()(2()(3))", test.tree2str(treeNode));
    }
}
