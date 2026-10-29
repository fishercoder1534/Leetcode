package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.Node;
import com.fishercoder.solutions.secondthousand._1522;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1522Test {
    private _1522.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1522.Solution1();
    }

    @Test
    public void test1() {
        Node root = Node.createNaryTree(Arrays.asList(35, null, 52, 95, null, null, 38, 22, null, 70, 72, null, 54, 2, null, null, null, 42, null, 98, null, 73, 63));
        assertEquals(6, solution1.diameter(root));
    }
}
