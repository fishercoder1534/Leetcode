package com.stevesun.solutions;

import java.util.LinkedHashMap;
import java.util.Map;

/**The shortest implementation is to use LinkedHashMap:
 * specify a size of the linkedHashMap;
 * override the removeEldestEntry method when its size exceeds max size: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html#removeEldestEntry-java.util.Map.Entry-
 * in the constructor, set the last boolean variable to be true: it means the ordering mode, if we set it to true, it means
 * in access order, false, means it's in insertion order: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html#LinkedHashMap-int-float-boolean-*/
public class LRUCache_use_LinkedHashMap {
    
    private Map<Integer, Integer> cache;
    private final int max;
    
    public LRUCache_use_LinkedHashMap(int capacity) {
        max = capacity;
        cache = new LinkedHashMap<Integer, Integer>(capacity, 1.0f, true){
            public boolean removeEldestEntry(Map.Entry eldest){
                return cache.size() > max;
            }
        };
    }
    
    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }
    
    public void set(int key, int value) {
        cache.put(key, value);
    }
}