package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._90;
import org.junit.BeforeClass;
import org.junit.Test;

public class _90Test {
    private static _90.Solution1 solution1;
    private static _90.Solution2 solution2;
    private static _90.Solution3 solution3;

    @BeforeClass
    public static void setup() {
        solution1 = new _90.Solution1();
        solution2 = new _90.Solution2();
        solution3 = new _90.Solution3();
    }

    @Test
    public void test1() {
        CommonUtils.printListList(solution1.subsetsWithDup(new int[]{1, 2, 2}));
    }

    @Test
    public void test2() {
        CommonUtils.printListList(solution2.subsetsWithDup(new int[]{1, 2, 2}));
    }

    @Test
    public void test3() {
        CommonUtils.printListList(solution3.subsetsWithDup(new int[]{1, 2, 2}));
    }

}
