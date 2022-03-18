package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._922;
import org.junit.BeforeClass;
import org.junit.Test;

public class _922Test {
    private static _922.Solution1 solution1;
    private static _922.Solution2 solution2;
    private static _922.Solution3 solution3;
    private static int[] nums;
    private static int[] result;

    @BeforeClass
    public static void setup() {
        solution1 = new _922.Solution1();
        solution2 = new _922.Solution2();
        solution3 = new _922.Solution3();
    }

    @Test
    public void test1() {
        nums = new int[]{4, 2, 5, 7};
        result = solution1.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
        result = solution2.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
        result = solution3.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
    }

    @Test
    public void test2() {
        nums = new int[]{3, 1, 4, 2};
        result = solution1.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
        result = solution2.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
        result = solution3.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
    }

    @Test
    public void test3() {
        nums = new int[]{648, 831, 560, 986, 192, 424, 997, 829, 897, 843};
        result = solution1.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
        result = solution2.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
        result = solution3.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
    }

    @Test
    public void test4() {
        nums = new int[]{3, 4};
        result = solution1.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
        result = solution2.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
        result = solution3.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
    }

    @Test
    public void test5() {
        nums = new int[]{2, 3, 1, 1, 4, 0, 0, 4, 3, 3};
        result = solution1.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
        result = solution2.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
        result = solution3.sortArrayByParityII(nums);
        CommonUtils.printArray(result);
    }
}
