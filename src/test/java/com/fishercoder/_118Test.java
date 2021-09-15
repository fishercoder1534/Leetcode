package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._118;
import org.junit.BeforeClass;
import org.junit.Test;

public class _118Test {
    private static _118.Solution1 solution1;
    private static _118.Solution2 solution2;
    private static _118.Solution3 solution3;

    @BeforeClass
    public static void setup() {
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
