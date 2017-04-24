package com.stevesun.solutions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class LFUCache {
    /**
     * Wikipedia: The simplest method to employ an LFU algorithm is to assign a counter to every
     * block that is loaded into the cache. Each time a reference is made to that block the counter
     * is increased by one. When the cache reaches capacity and has a new block waiting to be
     * inserted the system will search for the block with the lowest counter and remove it from the
     * cache.
     * 
     * Policy to handle frequency ties: based on timestamp, the entries that get set into cache earlier will be evicted first.
     */
    
    class FreqKeyValueTimestamp {
        int freq;
        int key;
        int value;
        long timestamp;
    }
    
    Map<Integer, FreqKeyValueTimestamp> map;
    TreeSet<FreqKeyValueTimestamp> set;
    int max;
    
    public LFUCache(int capacity) {
        max = capacity;
        map = new HashMap<Integer, FreqKeyValueTimestamp>();
        set = new TreeSet<FreqKeyValueTimestamp>(new Comparator<FreqKeyValueTimestamp>(){

            @Override
            public int compare(FreqKeyValueTimestamp o1, FreqKeyValueTimestamp o2) {
                if(o1.freq != o2.freq) return o1.freq - o2.freq;
                else return (int) (o1.timestamp - o2.timestamp);//it's guaranteed that timestamp will never have two to be the same
            }
            
        });
    }

    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        else {
            FreqKeyValueTimestamp valueObj = map.get(key);
            set.remove(valueObj);
            valueObj.freq += 1;
            valueObj.timestamp = System.currentTimeMillis();
            map.put(key, valueObj);
            return map.get(key).value;
        }
    }

    public void set(int key, int value) {
        if(!map.containsKey(key)){
            while(set.size() >= max){
                FreqKeyValueTimestamp valueObj = set.pollFirst();
                map.remove(valueObj.key);
            }
            FreqKeyValueTimestamp valueObj = new FreqKeyValueTimestamp();
            valueObj.key = key;
            valueObj.timestamp = System.currentTimeMillis();
            valueObj.value = value;
            valueObj.freq = 1;
            map.put(key, valueObj);
            set.add(valueObj);
        }
    }
    
    
    public static void main(String...args){
        int capacity = 2;
        LFUCache test = new LFUCache(capacity);
        test.set(1, 11);
        test.set(2, 22);
        System.out.println(test.get(1));
        test.set(3, 33);
        System.out.println(test.get(2));
        System.out.println(test.get(3));
    }
    
}
