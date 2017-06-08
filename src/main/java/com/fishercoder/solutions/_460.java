package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class _460 {
    /**
     * Wikipedia: The simplest method to employ an LFU algorithm is to assign a counter to every
     * block that is loaded into the cache. Each time a reference is made to that block the counter
     * is increased by one. When the cache reaches capacity and has a new block waiting to be
     * inserted the system will search for the block with the lowest counter and remove it from the
     * cache.
     * 
     * Policy to handle frequency ties: based on timestamp, the entries that get set into cache earlier will be evicted first.
     */
    
    class LFUCache {
        /**credit: https://discuss.leetcode.com/topic/69737/java-o-1-very-easy-solution-using-3-hashmaps-and-linkedhashset/2*/
        HashMap<Integer, Integer> vals;
        HashMap<Integer, Integer> counts;
        HashMap<Integer, LinkedHashSet<Integer>> lists;
        int cap;
        int min = -1;
        public LFUCache(int capacity) {
            cap = capacity;
            vals = new HashMap<>();
            counts = new HashMap<>();
            lists = new HashMap<>();
            lists.put(1, new LinkedHashSet<>());
        }

        public int get(int key) {
            if(!vals.containsKey(key))
                return -1;
            int count = counts.get(key);
            counts.put(key, count+1);
            lists.get(count).remove(key);
            if(count==min && lists.get(count).size()==0)
                min++;
            if(!lists.containsKey(count+1))
                lists.put(count+1, new LinkedHashSet<>());
            lists.get(count+1).add(key);
            return vals.get(key);
        }

        public void put(int key, int value) {
            if(cap<=0)
                return;
            if(vals.containsKey(key)) {
                vals.put(key, value);
                get(key);
                return;
            }
            if(vals.size() >= cap) {
                int evit = lists.get(min).iterator().next();
                lists.get(min).remove(evit);
                vals.remove(evit);
            }
            vals.put(key, value);
            counts.put(key, 1);
            min = 1;
            lists.get(1).add(key);
        }
    }
    
}
