package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._90;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _90Test {
    private _90.Solution1 solution1;
    private _90.Solution2 solution2;
    private _90.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _90.Solution1();
        solution2 = new _90.Solution2();
        solution3 = new _90.Solution3();
    }

    @Test
    public void test1() {
        CommonUtils.printListList(solution1.subsetsWithDup(new int[] {1, 2, 2}));
    }

    @Test
    public void test2() {
        CommonUtils.printListList(solution2.subsetsWithDup(new int[] {1, 2, 2}));
    }

    @Test
    public void test3() {
        CommonUtils.printListList(solution3.subsetsWithDup(new int[] {1, 2, 2}));
    }
}
