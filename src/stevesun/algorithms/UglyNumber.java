package stevesun.algorithms;

public class UglyNumber {

    public boolean isUgly(int num) {
        if(num == 0) return false;
        int[] divisors = new int[]{5,3,2};
        for(int divisor : divisors){
            while(num%divisor == 0){
                num /= divisor;
            }
        }
        return num == 1;
    }

}
