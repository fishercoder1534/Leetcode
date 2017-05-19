package com.stevesun;

import com.stevesun.common.classes.TreeNode;
import com.stevesun.solutions._230;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/19/17.
 */
public class _230Test {
    private static _230.MostNaiveWay naiveWay;
    private static _230.BetterWay betterWay;
    private static TreeNode root;
    private static int k;

    @BeforeClass
    public static void setup(){
        naiveWay = new _230.MostNaiveWay();
        betterWay = new _230.BetterWay();
    }

    @Test
    public void test1(){
        root = new TreeNode(1);
        k = 1;
        assertEquals(1, naiveWay.kthSmallest(root, k));
        assertEquals(1, betterWay.kthSmallest(root, k));
    }

    @Test
    public void test2(){
        root = new TreeNode(2);
        root.left = new TreeNode(1);
        k = 1;
        assertEquals(1, naiveWay.kthSmallest(root, k));
        assertEquals(1, betterWay.kthSmallest(root, k));
    }
}
