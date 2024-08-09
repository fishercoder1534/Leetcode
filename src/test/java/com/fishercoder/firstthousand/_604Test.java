package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._604;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _604Test {
    private _604.Solution1.StringIterator test;

    @Test
    public void test1() {
        test = new _604.Solution1.StringIterator("L1e2t1C1o1d1e1");
        System.out.println(test.hasNext());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.hasNext());
    }

    @Test
    public void test2() {
        test = new _604.Solution1.StringIterator("L10e2t1C1o1d1e11");
        System.out.println(test.hasNext());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.hasNext());
    }

    @Test
    public void test3() {
        test = new _604.Solution1.StringIterator("x6");
        System.out.println(test.hasNext());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.hasNext());
        System.out.println(test.next());
        System.out.println(test.hasNext());
    }

    @Test
    public void test4() {
        test = new _604.Solution1.StringIterator("X15D18V8");
        System.out.println(test.hasNext());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        assertEquals(true, test.hasNext());
        System.out.println(test.next());
        assertEquals(true, test.hasNext());
    }
}
