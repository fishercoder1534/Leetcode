package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._78;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _78Test {
    private _78.Solution1 solution1;
    private _78.Solution2 solution2;
    private _78.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _78.Solution1();
        solution2 = new _78.Solution2();
        solution3 = new _78.Solution3();
    }

    @Test
    public void test1() {
        CommonUtils.printListList(solution1.subsets(new int[]{1, 2, 3}));
    }

    @Test
    public void test2() {
        CommonUtils.printListList(solution2.subsets(new int[]{1, 2, 3}));
    }

    @Test
    public void test3() {
        CommonUtils.printListList(solution3.subsets(new int[]{1, 2, 3}));
    }
}
