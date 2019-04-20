package com.fishercoder;

import com.fishercoder.solutions._460;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _460Test {

    private static _460.Solution1.LFUCache lfuCache;

    @Test
    public void test1() {
        lfuCache = new _460.Solution1.LFUCache(2);
        lfuCache.put(1, 1);
        lfuCache.put(2, 2);
        assertEquals(1, lfuCache.get(1));
        lfuCache.put(3, 3);
        assertEquals(-1, lfuCache.get(2));
        assertEquals(3, lfuCache.get(3));
        lfuCache.put(4, 4);
        assertEquals(-1, lfuCache.get(1));
        assertEquals(3, lfuCache.get(3));
        assertEquals(4, lfuCache.get(4));
    }
}
