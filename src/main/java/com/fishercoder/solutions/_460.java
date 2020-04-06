package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.LinkedHashSet;

/**
 460. LFU Cache

 Design and implement a data structure for Least Frequently Used (LFU) cache.
 It should support the following operations: get and put.

 get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 put(key, value) - Set or insert the value if the key is not already present. When the cache reaches its capacity,
 it should invalidate the least frequently used item before inserting a new item.
 For the purpose of this problem, when there is a tie (i.e., two or more keys that have the same frequency),
 the least recently used key would be evicted.

 Follow up:
 Could you do both operations in O(1) time complexity?

 Example:

 LFUCache cache = new LFUCache( 2 /* capacity  );

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.get(3);       // returns 3.
        cache.put(4, 4);    // evicts key 1.
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);       // returns 4

 */

public class _460 {
    public static class Solution1 {
        /**
         * Wikipedia: The simplest method to employ an LFU algorithm is to assign a counter to every
         * block that is loaded into the cache. Each time a reference is made to that block the counter
         * is increased by one. When the cache reaches capacity and has a new block waiting to be
         * inserted the system will search for the block with the lowest counter and remove it from the
         * cache.
         * Policy to handle frequency ties: based on timestamp, the entries that get set into cache earlier will be evicted first.
         */

        public static class LFUCache {
            /**
             * credit: https://discuss.leetcode.com/topic/69737/java-o-1-very-easy-solution-using-3-hashmaps-and-linkedhashset/2
             */

            HashMap<Integer, Integer> keyToValue;
            /**
             * key is the key, value is the value
             */
            HashMap<Integer, Integer> keyToCount;
            /**
             * key is the key, value if the count of the key/value pair
             */
            HashMap<Integer, LinkedHashSet<Integer>> countToLRUKeys;
            /**
             * key is count, value is a set of keys that have the same key, but keeps insertion order
             */
            int cap;
            int minimumCount;

            public LFUCache(int capacity) {
                this.minimumCount = -1;
                this.cap = capacity;
                this.keyToValue = new HashMap<>();
                this.keyToCount = new HashMap<>();
                this.countToLRUKeys = new HashMap<>();
                this.countToLRUKeys.put(1, new LinkedHashSet<>());
            }

            public int get(int key) {
                if (!keyToValue.containsKey(key)) {
                    return -1;
                }
                int count = keyToCount.get(key);
                keyToCount.put(key, count + 1);
                countToLRUKeys.get(count).remove(key);

                if (count == minimumCount && countToLRUKeys.get(count).size() == 0) {
                    /**This means this key's count equals to current minimumCount
                     * AND
                     * this count doesn't have any entries in the cache.
                     * So, we'll increment minimumCount by 1 to get the next LFU cache entry
                     * when we need to evict.*/
                    minimumCount++;
                }

                if (!countToLRUKeys.containsKey(count + 1)) {
                    countToLRUKeys.put(count + 1, new LinkedHashSet<>());
                }
                countToLRUKeys.get(count + 1).add(key);

                return keyToValue.get(key);
            }

            public void put(int key, int value) {
                if (cap <= 0) {
                    return;
                }

                if (keyToValue.containsKey(key)) {
                    /**If the key is already in the cache, we can simply overwrite this entry;
                     * then call get(key) which will do the update work.*/
                    keyToValue.put(key, value);
                    get(key);
                    return;
                }

                /**If the key is not in the cache, we'll check the size first, evict the LFU entry first,
                 * then insert this one into cache.*/
                if (keyToValue.size() >= cap) {
                    int evit = countToLRUKeys.get(minimumCount).iterator().next();
                    countToLRUKeys.get(minimumCount).remove(evit);
                    keyToValue.remove(evit);
                }
                keyToValue.put(key, value);
                keyToCount.put(key, 1);
                countToLRUKeys.get(1).add(key);/**Because we put this key/value into cache for the first time, so its count is 1*/
                minimumCount = 1;/**For the same above reason, minimumCount is of course 1*/
            }
        }
    }

}
