package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.List;

public class _751 {
    public static class Solution1 {
        public List<String> ipToCIDR(String ip, int n) {
            List<String> result = new ArrayList<>();
            //convert this dotted IP to long to avoid integer overflow
            long x = ipToLong(ip);

            while (n > 0) {
                //find the largest power-of-2 block aligned with x
                //if x == 0, any power of 2 up to 2^32 is aligned
                //ensure the block size does not exceed remaining IPs (n)
                long blockSize = (x == 0) ? (1L << 32) : (x & -x);

                while (blockSize > n) {
                    blockSize >>= 1; //then we keep shifting to the right by one bit, changing blockSize from 16 -> 8 -> 4 -> 2 -> 1
                }

                //compute prefix length and format as CIDR
                int prefixLength = 32 - Long.numberOfTrailingZeros(blockSize);
                result.add(longToIp(x) + "/" + prefixLength);

                //advance current IP and decrement remaining count
                x += blockSize;
                n -= (int) blockSize;
            }

            return result;
        }

        private long ipToLong(String ip) {
            String[] parts = ip.split("\\.");
            long res = 0;
            for (String part : parts) {
                //• res << 8 (Left Shift by 8 bits): Multiplies res by 256 (2⁸), shifting all existing bits 8 places to the left to make room for the next octet on the right. The newly opened 8 slots on the right are filled with zeros (00000000).
                //| (Bitwise OR): Drops the new 8-bit integer directly into the 8 empty zero-slots created on the right. (Since those 8 slots are all zeros, | acts just like addition +).
                res = (res << 8) | Integer.parseInt(part);
                //the above line is equivalent to below one, pick either one would make it AC'd.
                //res = (res * 256) + Integer.parseInt(part);
            }
            return res;
        }

        private String longToIp(long x) {
            return ((x >> 24) & 255) + "." +
                    ((x >> 16) & 255) + "." +
                    ((x >> 8) & 255) + "." +
                    (x & 255);
        }
    }
}
