package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 705. Design HashSet
 *
 * Design a HashSet without using any built-in hash table libraries.
 *
 * To be specific, your design should include these functions:
 *
 * add(value): Insert a value into the HashSet.
 * contains(value) : Return whether the value exists in the HashSet or not.
 * remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.
 *
 * Example:
 *
 * MyHashSet hashSet = new MyHashSet();
 * hashSet.add(1);
 * hashSet.add(2);
 * hashSet.contains(1);    // returns true
 * hashSet.contains(3);    // returns false (not found)
 * hashSet.add(2);
 * hashSet.contains(2);    // returns true
 * hashSet.remove(2);
 * hashSet.contains(2);    // returns false (already removed)
 *
 * Note:
 *
 * All values will be in the range of [0, 1000000].
 * The number of operations will be in the range of [1, 10000].
 * Please do not use the built-in HashSet library.
 */
public class _705 {
  public static class Solution1 {
    class MyHashSet {
      Map<Integer, Integer> map;

      /** Initialize your data structure here. */
      public MyHashSet() {
        map = new HashMap<>();
      }

      public void add(int key) {
        map.put(key, 0);
      }

      public void remove(int key) {
        if (map.containsKey(key)) {
          map.remove(key);
        }
      }

      /** Returns true if this set contains the specified element */
      public boolean contains(int key) {
        return map.containsKey(key);
      }
    }
  }
}
