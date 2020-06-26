package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class _381 {
    public static class Solution1 {

        Map<Integer, Integer> forwardMap;
        //key is the to-be-inserted number, value is its auto-incremented index
        Map<Integer, Integer> reverseMap;//the other way around
        int index;
        Random rand;

        /**
         * Initialize your data structure here.
         */
        public Solution1() {
            forwardMap = new HashMap();
            reverseMap = new HashMap();
            index = 0;
            rand = new Random();
        }

        /**
         * Inserts a value to the collection. Returns true if the collection did not already contain the
         * specified element.
         */
        public boolean insert(int val) {
            boolean contains;
            if (reverseMap.containsValue(val)) {
                contains = true;
            } else {
                contains = false;
            }
            forwardMap.put(val,
                    index);//this will overwrite the preivous key with a new index if the key already exists
            reverseMap.put(index, val);
            index++;
            return contains;
        }

        /**
         * Removes a value from the collection. Returns true if the collection contained the specified
         * element.
         */
        public boolean remove(int val) {
            boolean contains;
            if (reverseMap.containsValue(val)) {
                contains = true;
                if (forwardMap.containsKey(val)) {
                    int i = forwardMap.get(val);
                    forwardMap.remove(val);
                    reverseMap.remove(i);
                } else {
                    //remove the entry in revserve map that has val as its value
                    reverseMap.values().remove(val);
                }
            } else {
                contains = false;
            }
            return contains;
        }

        /**
         * Get a random element from the collection.
         */
        public int getRandom() {
            int randNum = rand.nextInt(index);
            while (!reverseMap.containsKey(randNum)) {
                randNum = rand.nextInt(index);
            }
            return reverseMap.get(randNum);
        }
    }
}
