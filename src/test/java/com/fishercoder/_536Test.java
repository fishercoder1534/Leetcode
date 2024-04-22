package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._536;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class _536Test {
    private static _536.Solution1 solution1;
    private static _536.Solution2 solution2;
    private static TreeNode expected;
    private static String s;

    @BeforeClass
    public static void setup() {
        solution1 = new _536.Solution1();
        solution2 = new _536.Solution2();
    }

    @Test
    public void test1() {
        s = "4(2(3)(1))(6(5))";
        expected = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 6, 3, 1, 5));
        assertEquals(expected, solution1.str2tree(s));
        assertEquals(expected, solution2.str2tree(s));
    }

    @Test
    public void test2() {
        s = "51(232)(434)";
        expected = TreeUtils.constructBinaryTree(Arrays.asList(51, 232, 434));
        assertEquals(expected, solution1.str2tree(s));
        assertEquals(expected, solution2.str2tree(s));
    }

    @Test
    public void test3() {
        s = "-4(2(3)(1))(6(5)(7))";
        expected = TreeUtils.constructBinaryTree(Arrays.asList(-4, 2, 6, 3, 1, 5, 7));
        assertEquals(expected, solution1.str2tree(s));
        assertEquals(expected, solution2.str2tree(s));
    }

    @Test
    public void test4() {
        s = "4";
        expected = TreeUtils.constructBinaryTree(Arrays.asList(4));
        assertEquals(expected, solution1.str2tree(s));
        assertEquals(expected, solution2.str2tree(s));
    }
}
