package com.fishercoder;

import com.fishercoder.solutions._1146;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1146Test {
    private static _1146.Solution1.SnapshotArray snapshotArray;

    @Test
    public void test1() {
        snapshotArray = new _1146.Solution1.SnapshotArray(3);
        snapshotArray.set(0, 5);
        snapshotArray.snap();
        snapshotArray.set(0, 6);
        assertEquals(5, snapshotArray.get(0, 0));
    }

}