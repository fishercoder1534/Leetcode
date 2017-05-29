package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.

 Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.

 Note: Do not use class member/global/static variables to store states. Your encode and decode algorithms should be stateless.
 */
public class EncodeandDecodeTinyURL {
    public class Codec {
        Map<String, Long> map = new HashMap<>();
        Long maxValue = 0L;
        Map<Long, String> reverseMap = new HashMap<>();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            maxValue++;
            map.put(longUrl, maxValue);
            reverseMap.put(maxValue, longUrl);
            return String.valueOf(maxValue);
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return String.valueOf(reverseMap.get(Long.valueOf(shortUrl)));
        }
    }
}
