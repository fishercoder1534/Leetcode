package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1352;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1352Test {
    private _1352.Solution1.ProductOfNumbers productOfNumbers;

    @Test
    public void test1() {
        productOfNumbers = new _1352.Solution1.ProductOfNumbers();
        productOfNumbers.add(3);
        productOfNumbers.add(0);
        productOfNumbers.add(2);
        productOfNumbers.add(5);
        productOfNumbers.add(4);
        assertEquals(20, productOfNumbers.getProduct(2));
        assertEquals(40, productOfNumbers.getProduct(3));
        assertEquals(0, productOfNumbers.getProduct(4));
        productOfNumbers.add(8);
        assertEquals(32, productOfNumbers.getProduct(2));
    }

}