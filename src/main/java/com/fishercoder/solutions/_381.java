package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**381. Insert Delete GetRandom O(1) - Duplicates allowed
 *
Design a data structure that supports all following operations in average O(1) time.

Note: Duplicate elements are allowed.
insert(val): Inserts an item val to the collection.
remove(val): Removes an item val from the collection if present.
getRandom: Returns a random element from current collection of elements. The probability of each element being returned is linearly related to the number of same value the collection contains.
Example:

// Init an empty collection.
_381 collection = new _381();

// Inserts 1 to the collection. Returns true as the collection did not contain 1.
collection.insert(1);

// Inserts another 1 to the collection. Returns false as the collection contained 1. Collection now contains [1,1].
collection.insert(1);

// Inserts 2 to the collection, returns true. Collection now contains [1,1,2].
collection.insert(2);

// getRandom should return 1 with the probability 2/3, and returns 2 with the probability 1/3.
collection.getRandom();

// Removes 1 from the collection, returns true. Collection now contains [1,2].
collection.remove(1);

// getRandom should return 1 and 2 both equally likely.
collection.getRandom();*/
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
