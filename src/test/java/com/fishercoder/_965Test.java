package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._965;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _965Test {
  private static _965.Solution1 solution1;
  private static _965.Solution2 solution2;
  private static TreeNode root;

  @BeforeClass
  public static void setup() {

    solution1 = new _965.Solution1();
    solution2 = new _965.Solution2();
  }

  @Test
  public void test1() {
    root = TreeUtils.constructBinaryTree(Arrays.asList(1, 1, 1, 1, 1, null, 1));
    assertEquals(true, solution1.isUnivalTree(root));
  }

  @Test
  public void test2() {
    root = TreeUtils.constructBinaryTree(Arrays.asList(2, 2, 2, 5, 2));
    assertEquals(false, solution1.isUnivalTree(root));
  }
  @Test
  public void test3() {
    root = TreeUtils.constructBinaryTree(Arrays.asList(-1, -1, -1, -1, -1, -1, -1));
    assertEquals(true, solution2.isUnivalTree(root));
  }
  @Test
  public void test4() {
    root = TreeUtils.constructBinaryTree(Arrays.asList(2, 2, 2, 2, 2, 2, 1));
    assertEquals(false, solution2.isUnivalTree(root));
  }
}
