package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._113;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _113Test {
    private _113.Solution1 solution1;
    private _113.Solution2 solution2;
    private static TreeNode root;
    private static int sum;
    private static List<List<Integer>> expected;

    @BeforeEach
    public void setup() {
        solution1 = new _113.Solution1();
        solution2 = new _113.Solution2();
    }

    @Test
    public void test1() {
        sum = 22;
        root =
                TreeUtils.constructBinaryTree(
                        Arrays.asList(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1));
        TreeUtils.printBinaryTree(root);
        expected = new ArrayList<>();
        expected.add(Arrays.asList(5, 4, 11, 2));
        expected.add(Arrays.asList(5, 8, 4, 5));
        assertEquals(expected, solution1.pathSum(root, sum));
        assertEquals(expected, solution2.pathSum(root, sum));
    }
}
