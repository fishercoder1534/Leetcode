package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1145;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1145Test {

    private _1145.Solution1 solution1;
    private static TreeNode root;
    private static int n;
    private static int x;

    @BeforeEach
    public void setup() {
        solution1 = new _1145.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        n = 11;
        x = 3;
        Assertions.assertEquals(true, solution1.btreeGameWinningMove(root, n, x));
    }
}
