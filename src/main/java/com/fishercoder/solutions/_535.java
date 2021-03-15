package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class _535 {

    public static class Solution1 {
        /**
         * Simple counter approach
         * Analysis:
         * The range of URLs that can be decoded is limited by the range of Integer.
         * If excessively large number of URLs have to be encoded, after the range of Integer is exceeded,
         * integer overflow could lead to overwriting previous URL's encodings.
         * The length of the URL isn't necessary shorter than incoming URL.
         * One potential security issue with this problem is that it's very easy to predict the next code generated,
         * since this pattern is very easy to be detected.
         */
        public class Codec {
            int i = 0;
            Map<Integer, String> map = new HashMap();
            public static final String PREFIX = "http://tinyurl/";

            public String encode(String longUrl) {
                map.put(i, longUrl);
                return PREFIX + i++;
            }

            public String decode(String shortUrl) {
                return map.get(Integer.parseInt(shortUrl.substring(PREFIX.length())));
            }
        }
    }

    public static class Solution2 {
        /**
         * Use Java built-in HashCode
         * Analysis:
         * hashCode() does NOT generate unique codes for different strings, collision might happen.
         * As the number of URLs increase, the probability of getting collision increases which leads to failure.
         */
        public class Codec {
            Map<Integer, String> map = new HashMap<>();
            public static final String PREFIX = "http://tinyurl/";

            // Encodes a URL to a shortened URL.
            public String encode(String longUrl) {
                /**I don't need to create a local variable to cache longUrl.hashCode()
                 * since Java's String cache it already. :) Look at its source code.*/
                map.put(longUrl.hashCode(), longUrl);
                return PREFIX + longUrl.hashCode();
            }

            // Decodes a shortened URL to its original URL.
            public String decode(String shortUrl) {
                return map.get(Integer.parseInt(shortUrl.substring(PREFIX.length())));
            }
        }
    }

    public static class Solution3 {
        /**
         * Use a random number
         */
        Map<Integer, String> map = new HashMap<>();
        Random random = new Random();
        public static final String PREFIX = "http://tinyurl/";

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            int num = random.nextInt(Integer.MAX_VALUE);
            while (map.containsKey(num)) {
                num = random.nextInt(Integer.MAX_VALUE);
            }
            map.put(num, longUrl);
            return PREFIX + num;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return map.get(Integer.parseInt(shortUrl.substring(PREFIX.length())));
        }
    }

    public static class Solution4 {
        /**
         * Use a random but fixed length encoding
         * Analysis:
         * 1. This is the most optimal solution so far.
         * 2. The number of URLs that can be encoded can be as big as Math.pow((10 + 26*2), FIXED_LENGTH), in below code, FIXED_LENGTH = 7
         * 3. The length of the shortened URL is fixed at a certain length, which could be a significant reduce for large URLs
         * 4. The performance of this scheme is pretty good, due to much smaller probability of encountering collision
         * 5. Predicting pattern/encoding isn't possible in this case since random numbers are used.
         */
        Map<String, String> map = new HashMap<>();
        public static final String PREFIX = "http://tinyurl/";
        public static final int FIXED_LENGTH = 7;
        Random random = new Random();
        String alphabet = "0123456789abcdefghijklmnopgrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String shortKey = getRandomFixedLengthKey();
            while (map.containsKey(shortKey)) {
                shortKey = getRandomFixedLengthKey();
            }
            map.put(shortKey, longUrl);
            return PREFIX + shortKey;
        }

        private String getRandomFixedLengthKey() {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < FIXED_LENGTH; i++) {
                stringBuilder.append(alphabet.charAt(random.nextInt(alphabet.length())));
            }
            return stringBuilder.toString();
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return map.get(shortUrl.substring(PREFIX.length()));
        }
    }
}
