package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._297;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _297Test {
    private _297.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _297.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root =
                TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, null, 4, 5, 6, 7));
        TreeUtils.printBinaryTree(root);
        String str = solution1.serialize(root);
        System.out.println(str);
        TreeUtils.printBinaryTree(solution1.deserialize(str));
        assertEquals(root, solution1.deserialize(str));
    }
}
