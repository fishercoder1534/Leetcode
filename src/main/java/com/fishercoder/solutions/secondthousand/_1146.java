package com.fishercoder.solutions.secondthousand;

import java.util.*;

public class _1146 {
    public static class Solution1 {
        public static class SnapshotArray {
            TreeMap<Integer, Integer>[] snapshots;//using this data structure is much more efficient in terms of storage, esp. if snap() calls happen frequently
            int snapId;

            public SnapshotArray(int length) {
                snapshots = new TreeMap[length];
                snapId = 0;
                for (int i = 0; i < length; i++) {
                    snapshots[i] = new TreeMap<>();
                    snapshots[i].put(0, 0);
                }
            }

            public void set(int index, int val) {
                snapshots[index].put(snapId, val);
            }

            public int snap() {
                return snapId++;
            }

            public int get(int index, int snapId) {
                return snapshots[index].floorEntry(snapId).getValue();
            }
        }
    }
}
