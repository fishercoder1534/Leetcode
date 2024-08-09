package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._901;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _901Test {
    private _901.Solution1.StockSpanner stockSpanner;

    @Test
    public void test1() {
        stockSpanner = new _901.Solution1.StockSpanner();
        assertEquals(1, stockSpanner.next(100));
        assertEquals(1, stockSpanner.next(80));
        assertEquals(1, stockSpanner.next(60));
        assertEquals(2, stockSpanner.next(70));
        assertEquals(1, stockSpanner.next(60));
        assertEquals(4, stockSpanner.next(75));
        assertEquals(6, stockSpanner.next(85));
    }

}