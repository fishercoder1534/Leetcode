package com.fishercoder;

import com.fishercoder.common.classes.UndirectedGraphNode;
import com.fishercoder.solutions._133;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _133Test {
  private static _133.Solution1 solution1;
  private static UndirectedGraphNode expected;
  private static UndirectedGraphNode actual;

  @BeforeClass
  public static void setup() {
    solution1 = new _133.Solution1();
  }

  @Before
  public void setupForEachTest() {
    expected = null;
    actual = null;
  }

  @Test
  public void test1() {
    UndirectedGraphNode node0 = new UndirectedGraphNode(0);
    UndirectedGraphNode node1 = new UndirectedGraphNode(1);
    UndirectedGraphNode node2 = new UndirectedGraphNode(2);
    node0.neighbors.add(node1);
    node0.neighbors.add(node2);
    node1.neighbors.add(node2);

    expected = node0;
    actual = solution1.cloneGraph(expected);
    assertEquals(expected, actual);
  }
}
