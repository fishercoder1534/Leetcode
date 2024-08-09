package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._118;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _118Test {
    private _118.Solution1 solution1;
    private _118.Solution2 solution2;
    private _118.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _118.Solution1();
        solution2 = new _118.Solution2();
        solution3 = new _118.Solution3();
    }

    @Test
    public void test1() {
        CommonUtils.printListList(solution1.generate(5));
    }

    @Test
    public void test2() {
        CommonUtils.printListList(solution2.generate(5));
    }

    @Test
    public void test3() {
        CommonUtils.printListList(solution3.generate(5));
    }

}
