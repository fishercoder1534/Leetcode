package com.fishercoder.solutions;
/**191. Number of 1 Bits
 *
Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.*/
public class _191 {
    //another cool trick that I learned: doing bitwise AND operation between n and n-1 will always flip the least significant 1 bit in n
    //to zero, here's the solution from Editorial:
    //example run for the above editorial solution: input 5, n will be 5&4 and becomes 4, then in the next run, n will become 4&3 which is 0, thus exit the while loop.
    public int hammingWeight_editorial(int n){
        int count = 0;
        while(n != 0){
            count++;
            n &= (n-1);
        }
        return count;
    }

    public static void main(String...strings){
        System.out.println(4&5);
        _191 test = new _191();
        System.out.println(test.hammingWeight_editorial(5));
    }

 // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //cheers! Made it AC'ed on my own with an ease!
        int count = 0;
        for(int i = 0; i < 32; i++){
            int one = (n >>> i) & 1;//must use unsigned right shift operator
            if(one == 1) count++;
        }
        return count;
    }
    
    //then I turned to its Editorial solution: we can make it a little faster: at any time, when n becomes zero, that means there's
    //no more 1's there, then we could safely return! Cool!
    public int hammingWeight_faster(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            int one = (n >>> i) & 1;//must use unsigned right shift operator
            if(one == 1) count++;
            if(n == 0) return count;
        }
        return count;
    }
    
}
