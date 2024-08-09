package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._22;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _22Test {
    private _22.Solution1 solution1;
    private _22.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _22.Solution1();
        solution2 = new _22.Solution2();
    }

    @Test
    public void test1() {
        CommonUtils.printList(solution1.generateParenthesis(3));
    }

    @Test
    public void test2() {
        CommonUtils.printList(solution2.generateParenthesis(3));
    }

}