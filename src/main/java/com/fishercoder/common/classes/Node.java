package com.fishercoder.common.classes;

import java.util.List;

public class Node {
  public int val;
  public List<Node> children;

  public Node() {
  }

  public Node(int _val, List<Node> _children) {
    val = _val;
    children = _children;
  }

  //todo: implement this method
  /**return a N-ary tree based on the preorder values*/
  public static Node createNaryTree(List<Integer> preorderValues) {
    return null;
  }
}
