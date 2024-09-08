package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions.firstthousand._449;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _449Test {
    private _449.Solution1 solution1;
    private _449.Solution2 solution2;
    private _449.Solution3 solution3;
    private _449.Solution4 solution4;
    private static TreeNode expectedRoot;

    @BeforeEach
    public void setup() {
        solution1 = new _449.Solution1();
        solution2 = new _449.Solution2();
        solution3 = new _449.Solution3();
        solution4 = new _449.Solution4();
    }

    @BeforeEach
    public void setupForEachTest() {}

    @Test
    public void test1() {
        expectedRoot = new TreeNode(3);
        expectedRoot.left = new TreeNode(1);
        expectedRoot.right = new TreeNode(4);
        expectedRoot.left.right = new TreeNode(2);
        assertEquals(
                expectedRoot.toString(),
                solution1.deserialize(solution1.serialize(expectedRoot)).toString());
        assertEquals(
                expectedRoot.toString(),
                solution2.deserialize(solution2.serialize(expectedRoot)).toString());
        assertEquals(
                expectedRoot.toString(),
                solution3.deserialize(solution3.serialize(expectedRoot)).toString());
        assertEquals(
                expectedRoot.toString(),
                solution4.deserialize(solution4.serialize(expectedRoot)).toString());
    }

    @Test
    public void test2() {
        expectedRoot = new TreeNode(2);
        expectedRoot.left = new TreeNode(1);
        expectedRoot.right = new TreeNode(3);
        assertEquals(
                expectedRoot.toString(),
                solution1.deserialize(solution1.serialize(expectedRoot)).toString());
        assertEquals(
                expectedRoot.toString(),
                solution2.deserialize(solution2.serialize(expectedRoot)).toString());
        assertEquals(
                expectedRoot.toString(),
                solution3.deserialize(solution3.serialize(expectedRoot)).toString());
        assertEquals(
                expectedRoot.toString(),
                solution4.deserialize(solution4.serialize(expectedRoot)).toString());
    }
}
