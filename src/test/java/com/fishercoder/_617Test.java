package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._617;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by stevesun on 6/10/17.
 */
public class _617Test {
    private static _617 test;
    private static TreeNode t1;
    private static TreeNode t2;
    private static TreeNode actual;

    @BeforeClass
    public static void setup(){
        test = new _617();
    }

    @Test
    public void test1(){
        t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);

        actual = test.mergeTrees(t1, t2);
    }
}
