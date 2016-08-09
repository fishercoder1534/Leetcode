package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**This solution get AC'ed. Although it's not really doing random 8/4/2016
 * Now, they've updated the test case and also the question description: Each element must have the same probability of being returned.*/
public class RandomizedSet {
    
    Set<Integer> set;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        set = new HashSet();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(set.contains(val)) return false;
        else {
            set.add(val);
            return true;
        }
    }
    
    /** Deletes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        return set.remove(val);
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Iterator<Integer> it = set.iterator();
        if(!it.hasNext()) return -1;
        int res = 0;
        while(it.hasNext()){
            res = it.next();
            break;
        }
        return res;
    }
    
    public static void main(String...args){
        RandomizedSet_2nd_solution test = new RandomizedSet_2nd_solution();
        System.out.println(test.insert(1));
        System.out.println(test.delete(2));
        System.out.println(test.insert(2));
        System.out.println(test.getRandom());
        System.out.println(test.delete(1));
        System.out.println(test.insert(2));
        System.out.println(test.getRandom());
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.delete(val);
 * int param_3 = obj.getRandom();
 */

class RandomizedSet_2nd_solution {
    
    Map<Integer, Integer> forwardMap;//key is auto increment index, value if the inserted val
    Map<Integer, Integer> reverseMap;//the other way around
    int index;
    Random random;

    /** Initialize your data structure here. */
    public RandomizedSet_2nd_solution() {
        forwardMap = new HashMap();
        reverseMap = new HashMap();
        index = 0;
        random = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(forwardMap.containsValue(val)) return false;
        else {
            forwardMap.put(index, val);
            reverseMap.put(val, index++);
            return true;
        }
    }
    
    /** Deletes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(forwardMap.containsValue(val)){
            int key = reverseMap.get(val);
            reverseMap.remove(val);
            forwardMap.remove(key);
            return true;
        } else {
            return false;
        }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int max = forwardMap.size();
        int randomNum = random.nextInt(max) == 0 ? 1 : random.nextInt(max);
        return forwardMap.get(randomNum);
    }

}