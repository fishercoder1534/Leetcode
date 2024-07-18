package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._919;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _919Test {
    private static _919.Solution1.CBTInserter cbtInserter;

    @BeforeEach
    public void setup() {
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(5, 14, 4, 5, 14, 16, 16, 20, 7, 13));
        cbtInserter = new _919.Solution1.CBTInserter(root);
        TreeUtils.printBinaryTree(cbtInserter.get_root());
        assertEquals(14, cbtInserter.insert(8));
    }

}