package com.fishercoder.solutions.fourththousand;

public class _3602 {
    public static class Solution1 {
        /**
         * The gist here is: (with an example to illustrate)
         * 1. given decimal number 169, convert it to hexadecimal
         * 2. 169 / 16 = 10 with a remainder of 9
         * 3. 10 / 16 = 0 with a remainder of 10 (which is A in hexadecimal)
         * So, the decimal number 169 changes into its hex format of: A9 (read it from bottom up)
         * The same idea for converting a decimal to hexatrigesimal
         *
         */
        public String concatHex36(int n) {
            long nSquare = (long) Math.pow(n, 2);
            String hexadecimal = convertToHexadecimal(nSquare);
            long nTriple = (long) Math.pow(n, 3);
            String hexatrigesimal = convertToHexatrigesimal(nTriple);
            return hexadecimal + hexatrigesimal;
        }

        private String convertToHexatrigesimal(long decimal) {
            StringBuilder hexatrigesimal = new StringBuilder();
            char[] hexadecimalChars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            while (decimal > 0) {
                int remainder = (int) (decimal % 36);
                hexatrigesimal.insert(0, hexadecimalChars[remainder]);
                decimal /= 36;
            }
            return hexatrigesimal.toString();
        }

        private String convertToHexadecimal(long decimal) {
            if (decimal == 0) {
                return "0";
            }
            StringBuilder hex = new StringBuilder();
            char[] hexChars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            while (decimal > 0) {
                int remainder = (int) (decimal % 16);
                hex.insert(0, hexChars[remainder]);
                decimal /= 16;
            }
            return hex.toString();
        }
    }
}
