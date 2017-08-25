package com.fishercoder.solutions;
/**342. Power of Four
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?*/
public class _342 {
    //with my original idea in the bottom, just dive a little bit deeper, you can realize that another important feature of a number
    //that is power of four is that its only single one bit must appear on the odd position, and power of two won't meet this requirement
    //decimal number 8 has binary format: 0000-0000-0000-0000-0000-0000-0000-1000
    //decimal number 16 has binary format: 0000-0000-0000-0000-0000-0000-0001-0000
    //hex number 0x55555555 has binary format: 1010-1010-1010-1010-1010-1010-1010-1010
    //thus, doing AND with 0x55555 will check if the only one bit is located on the odd position, thus ruling out those that are power of 2 but not power of 4
    public boolean isPowerOfFour_bit_manipulation(int num) {
        return (num > 0 && 1073741824 % num == 0 && (num & 0x55555555) != 0);
    }

    public boolean isPowerOfFour_base_conversion(int num) {
        //^ means to match the beginning of a line
        //$ means to match the end of a line
        //* means zero or more of the preceding character
        return Integer.toString(num, 4).matches("^10*$");
    }

    //a regular loop method to make it AC'ed
    public boolean isPowerOfFour(int num) {
        if (num < 4 && num != 1) {
            return false;
        }
        while (num != 1) {
            if (num % 4 != 0) {
                return false;
            }
            num /= 4;
        }
        return true;
    }

    //simply using the max number possible that is power of 4 won't work for this case, because, that number is a power of 2, but might
    //not be a power of 4, e.g. number 8
    public boolean isPowerOfFour_not_accepted(int num) {
        return (num > 3 && 1073741824 % num == 0);
    }

    public static void main(String... strings) {
        int temp = 4;
        int maxPowerOf4 = 4;
        while (temp > 0) {
            temp *= 4;
            if (temp > 0) {
                maxPowerOf4 = temp;
            }
        }
        System.out.println("maxPowerOf4 is: " + maxPowerOf4);


        System.out.println(Integer.parseInt("55555555", 16));
        System.out.println(Integer.toBinaryString(Integer.parseInt("55555555", 16)));
    }
}
