package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._95;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _95Test {
    private _95.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _95.Solution1();
    }

    @Test
    public void test1() {
        solution1.generateTrees(3).forEach(TreeUtils::printBinaryTree);
    }

}
