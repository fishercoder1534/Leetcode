package com.fishercoder;

import com.fishercoder.common.classes.Node;
import com.fishercoder.common.classes.UndirectedGraphNode;
import com.fishercoder.solutions._133;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _133Test {
    private static _133.Solution1 solution1;
    private static Node expected;
    private static Node actual;

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
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node0.children.add(node1);
        node0.children.add(node2);
        node1.children.add(node2);

        expected = node0;
        actual = solution1.cloneGraph(expected);
        assertEquals(expected, actual);
    }
}
