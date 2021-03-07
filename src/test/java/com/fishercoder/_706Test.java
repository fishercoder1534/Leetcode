package com.fishercoder;

import com.fishercoder.solutions._706;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _706Test {
    private static _706.Solution2.MyHashMap myHashMap;

    @Test
    public void test1() {
        myHashMap = new _706.Solution2.MyHashMap();

        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        assertEquals(1, myHashMap.get(1));
        assertEquals(-1, myHashMap.get(3));
        myHashMap.put(2, 1);
        assertEquals(1, myHashMap.get(2));
        myHashMap.remove(2);
        assertEquals(-1, myHashMap.get(2));
    }

}