package com.fishercoder;

import com.fishercoder.solutions._631;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _631Test {
    private static _631.Solution1.Excel excel;

    @Test
    public void test1() {
        excel = new _631.Solution1.Excel(3, 'C');
        assertEquals(0, excel.get(1, 'A'));
        excel.set(1, 'A', 1);
        assertEquals(1, excel.get(1, 'A'));
    }

    @Test
    public void test2() {
        excel = new _631.Solution1.Excel(3, 'C');
        assertEquals(0, excel.sum(1, 'A', new String[]{"A2"}));
        excel.set(2, 'A', 1);
        assertEquals(1, excel.get(1, 'A'));
    }

}