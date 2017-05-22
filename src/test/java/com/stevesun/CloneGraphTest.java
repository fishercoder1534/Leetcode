package com.stevesun;

import com.stevesun.common.classes.UndirectedGraphNode;
import com.stevesun.solutions.CloneGraph;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 1/15/17.
 */
public class CloneGraphTest {
    private static CloneGraph test;
    private static UndirectedGraphNode expected;
    private static UndirectedGraphNode actual;

    @BeforeClass
    public static void setup(){
        test = new CloneGraph();
    }

    @Before
    public void setupForEachTest(){
        expected = null;
        actual = null;
    }

    @Test
    public void test1(){
        UndirectedGraphNode node0 = new UndirectedGraphNode(0);
        UndirectedGraphNode node1 = new UndirectedGraphNode(1);
        UndirectedGraphNode node2 = new UndirectedGraphNode(2);
        node0.neighbors.add(node1);
        node0.neighbors.add(node2);
        node1.neighbors.add(node2);

        expected = node0;
        actual = test.cloneGraph(expected);
        assertEquals(expected, actual);
    }
}
