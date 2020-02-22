package com.fishercoder;

import com.fishercoder.solutions._1357;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1357Test {
    private static _1357.Solution1.Cashier cashier;

    @Test
    public void test1() {
        cashier = new _1357.Solution1.Cashier(3, 50, new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{100, 200, 300, 400, 300, 200, 100});
        assertEquals(500.0, cashier.getBill(new int[]{1, 2}, new int[]{1, 2}), 0);
        assertEquals(4000.0, cashier.getBill(new int[]{3, 7}, new int[]{10, 10}), 0);
        assertEquals(800.0, cashier.getBill(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 1, 1, 1, 1, 1, 1}), 0);
        assertEquals(4000.0, cashier.getBill(new int[]{4}, new int[]{10}), 0);
        assertEquals(4000.0, cashier.getBill(new int[]{7, 3}, new int[]{10, 10}), 0);
        assertEquals(7350.0, cashier.getBill(new int[]{7, 5, 3, 1, 6, 4, 2}, new int[]{10, 10, 10, 9, 9, 9, 7}), 0);
        assertEquals(2500.0, cashier.getBill(new int[]{2, 3, 5}, new int[]{5, 3, 2}), 0);
    }
}
