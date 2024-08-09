package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._872;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _872Test {
  private _872.Solution1 solution1;
  private static TreeNode root1;
  private static TreeNode root2;

  @BeforeEach
    public void setUp() {
    solution1 = new _872.Solution1();
  }

  @Test
  public void test1() {
    root1 = TreeUtils.constructBinaryTree(Arrays.asList(3, 5, 6, 2, 7, 4, 1, 9, 8));
    root2 = TreeUtils.constructBinaryTree(Arrays.asList(3, 5, 6, 2, 7, 4, 1, 9, 8));
    TreeUtils.printBinaryTree(root1);
    TreeUtils.printBinaryTree(root2);
    assertEquals(true, solution1.leafSimilar(root1, root2));
  }

  @Test
  public void test2() {
    root1 =
        TreeUtils.constructBinaryTree(Arrays.asList(18, 35, 22, null, 103, 43, 101, 58, null, 97));
    TreeUtils.printBinaryTree(root1);
    root2 =
        TreeUtils.constructBinaryTree(Arrays.asList(94, 102, 17, 122, null, null, 54, 58, 101, 97));
    TreeUtils.printBinaryTree(root2);
    assertEquals(false, solution1.leafSimilar(root1, root2));
  }
}
