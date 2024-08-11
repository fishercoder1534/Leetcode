package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.Node;
import com.fishercoder.solutions.secondthousand._1490;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1490Test {
    private _1490.Solution1 solution1;

    @BeforeEach
    public void setup() {
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
