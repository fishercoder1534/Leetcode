package com.fishercoder;

import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._617;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class _617Test {
    private static _617.Solution1 solution1;
    private static _617.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _617.Solution1();
        solution2 = new _617.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(TreeUtils.constructBinaryTree(Arrays.asList(3, 4, 5, 5, 4, null, 7)), solution1.mergeTrees(TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2, 5)), TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3, null, 4, null, 7))));
    }

    @Test
    public void test2() {
        assertEquals(TreeUtils.constructBinaryTree(Arrays.asList(3, 4, 5, 5, 4, null, 7)), solution2.mergeTrees(TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2, 5)), TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3, null, 4, null, 7))));
    }

}
