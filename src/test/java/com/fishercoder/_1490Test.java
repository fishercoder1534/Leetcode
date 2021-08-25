package com.fishercoder;

import com.fishercoder.common.classes.Node;
import com.fishercoder.solutions._1490;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1490Test {
    private static _1490.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1490.Solution1();
    }

    @Test
    public void test1() {
        Node root = new Node(8);
        Node child = new Node(1);
        root.children.add(child);
        Node leftGrandChild = new Node(8);
        Node rightGrandChild = new Node(5);
        child.children.add(leftGrandChild);
        child.children.add(rightGrandChild);
        assertEquals(root, solution1.cloneTree(root));
    }

}
