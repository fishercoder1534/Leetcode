package com.stevesun.solutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class PhoneDirectory {
//this runs in 669 ms, its get() method is O(n)
    boolean[] availableNumbers;
    
    /** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
    public PhoneDirectory(int maxNumbers) {
        availableNumbers = new boolean[maxNumbers];
        for(int i = 0; i < maxNumbers; i++){
            availableNumbers[i] = true;
        }
    }
    
    /** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
    public int get() {
        for(int i = 0; i < availableNumbers.length; i++){
            if(availableNumbers[i]) {
                availableNumbers[i] = false;
                return i;
            }
        }
        return -1;
    }
    
    /** Check if a number is available or not. */
    public boolean check(int number) {
        return availableNumbers[number];
    }
    
    /** Recycle or release a number. */
    public void release(int number) {
        availableNumbers[number] =true;
    }

}

class PhoneDirectory_use_set {
    //this runs in 532 ms, its get() method is O(1)

    Queue<Integer> phoneBooks;
    Set<Integer> used;
    
    /** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
    public PhoneDirectory_use_set(int maxNumbers) {
        phoneBooks = new LinkedList<Integer>();
        int number = 0;
        while(maxNumbers-- > 0){
            phoneBooks.add(number++);
        }
        used = new HashSet<Integer>();
    }
    
    /** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
    public int get() {
        if(phoneBooks.peek() == null) return -1;
        int number = phoneBooks.poll();
        used.add(number);
        return number;
    }
    
    /** Check if a number is available or not. */
    public boolean check(int number) {
        return !used.contains(number);
    }
    
    /** Recycle or release a number. */
    public void release(int number) {
        if(used.remove(number)){
            phoneBooks.add(number);
        }
    }


}