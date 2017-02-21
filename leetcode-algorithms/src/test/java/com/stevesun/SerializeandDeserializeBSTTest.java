package com.stevesun;

import com.stevesun.common.classes.TreeNode;
import com.stevesun.solutions.SerializeandDeserializeBST;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SerializeandDeserializeBSTTest {
    private static SerializeandDeserializeBST test;
    private static TreeNode actualRoot;
    private static TreeNode expectedRoot;

    @BeforeClass
    public static void setup(){
        test = new SerializeandDeserializeBST();
    }

    @Before
    public void setupForEachTest(){
    }

    @Test
    public void test1(){
        expectedRoot = new TreeNode(3);
        expectedRoot.left = new TreeNode(1);
        expectedRoot.right = new TreeNode(4);
        expectedRoot.left.right = new TreeNode(2);
        actualRoot = test.deserialize(test.serialize(expectedRoot));
        assertEquals(expectedRoot.toString(), actualRoot.toString());
    }
}
