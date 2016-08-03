package medium;

public class PhoneDirectory {

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
