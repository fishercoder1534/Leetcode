package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._897;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _897Test {
  private _897.Solution1 solution1;
  private static TreeNode root;
  private static TreeNode actual;

  @BeforeEach
    public void setup() {
    solution1 = new _897.Solution1();
  }

  @Test
  public void test1() {
    root = TreeUtils.constructBinaryTree(
        Arrays.asList(5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9));
    TreeUtils.printBinaryTree(root);
    actual = solution1.increasingBST(root);
    TreeUtils.printBinaryTree(actual);
  }
}
