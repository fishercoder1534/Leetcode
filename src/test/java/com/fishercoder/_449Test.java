package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._449;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _449Test {
    private static _449.Solution1 solution1;
    private static _449.Solution2 solution2;
    private static _449.Solution3 solution3;
    private static _449.Solution4 solution4;
    private static TreeNode expectedRoot;

    @BeforeClass
    public static void setup() {
        solution1 = new _449.Solution1();
        solution2 = new _449.Solution2();
        solution3 = new _449.Solution3();
        solution4 = new _449.Solution4();
    }

    @Before
    public void setupForEachTest() {
    }

    @Test
    public void test1() {
        expectedRoot = new TreeNode(3);
        expectedRoot.left = new TreeNode(1);
        expectedRoot.right = new TreeNode(4);
        expectedRoot.left.right = new TreeNode(2);
        assertEquals(expectedRoot.toString(), solution1.deserialize(solution1.serialize(expectedRoot)).toString());
        assertEquals(expectedRoot.toString(), solution2.deserialize(solution2.serialize(expectedRoot)).toString());
        assertEquals(expectedRoot.toString(), solution3.deserialize(solution3.serialize(expectedRoot)).toString());
        assertEquals(expectedRoot.toString(), solution4.deserialize(solution4.serialize(expectedRoot)).toString());
    }

    @Test
    public void test2() {
        expectedRoot = new TreeNode(2);
        expectedRoot.left = new TreeNode(1);
        expectedRoot.right = new TreeNode(3);
        assertEquals(expectedRoot.toString(), solution1.deserialize(solution1.serialize(expectedRoot)).toString());
        assertEquals(expectedRoot.toString(), solution2.deserialize(solution2.serialize(expectedRoot)).toString());
        assertEquals(expectedRoot.toString(), solution3.deserialize(solution3.serialize(expectedRoot)).toString());
        assertEquals(expectedRoot.toString(), solution4.deserialize(solution4.serialize(expectedRoot)).toString());
    }
}
