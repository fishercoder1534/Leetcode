package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2689;
import com.fishercoder.solutions.thirdthousand._2976;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2689Test {
    private static _2689.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2689.Solution1();
    }

    @Test
    public void test1() {
        _2689.RopeTreeNode root = new _2689.RopeTreeNode();
        root.len = 12;
        root.val = "";

        _2689.RopeTreeNode rootLeft = new _2689.RopeTreeNode();
        rootLeft.len = 6;
        rootLeft.val = "";
        root.left = rootLeft;

        _2689.RopeTreeNode rootLeftLeft = new _2689.RopeTreeNode();
        rootLeftLeft.len = 3;
        rootLeftLeft.val = "abc";
        rootLeft.left = rootLeftLeft;

        _2689.RopeTreeNode rootLeftRight = new _2689.RopeTreeNode();
        rootLeftRight.len = 3;
        rootLeftRight.val = "efg";
        rootLeft.right = rootLeftRight;

        _2689.RopeTreeNode rootRight = new _2689.RopeTreeNode();
        rootRight.len = 6;
        rootRight.val = "";
        root.right = rootRight;

        _2689.RopeTreeNode rootRightLeft = new _2689.RopeTreeNode();
        rootRightLeft.len = 3;
        rootRightLeft.val = "hij";
        rootRight.left = rootRightLeft;

        _2689.RopeTreeNode rootRightRight = new _2689.RopeTreeNode();
        rootRightRight.len = 3;
        rootRightRight.val = "klm";
        rootRight.right = rootRightRight;


        assertEquals('c', solution1.getKthCharacter(root, 3));
    }
}
