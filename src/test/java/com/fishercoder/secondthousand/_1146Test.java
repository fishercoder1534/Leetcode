package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1146;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class _1146Test {
    private static _1146.Solution1.SnapshotArray snapshotArray;

    @BeforeEach
    public void setup() {

    }

    @Test
    public void test1() {
        snapshotArray = new _1146.Solution1.SnapshotArray(3);
        snapshotArray.set(0, 5);
        snapshotArray.snap();
        snapshotArray.set(0, 6);
        assertEquals(5, snapshotArray.get(0, 0));
    }

    @Test
    public void test2() {
        snapshotArray = new _1146.Solution1.SnapshotArray(2);
        snapshotArray.snap();
        snapshotArray.set(1, 17);
        snapshotArray.set(0, 20);
        snapshotArray.snap();
        snapshotArray.snap();
        snapshotArray.snap();
    }

}