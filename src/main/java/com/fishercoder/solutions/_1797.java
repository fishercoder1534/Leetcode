package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1797 {
    public static class Solution1 {
        public static class AuthenticationManager {

            int timeToLive;
            int currentTime;
            Map<String, Integer> map;//tokenId -> expireTime

            public AuthenticationManager(int timeToLive) {
                this.timeToLive = timeToLive;
                this.currentTime = 0;
                this.map = new HashMap<>();
            }

            public void generate(String tokenId, int currentTime) {
                map.put(tokenId, currentTime + timeToLive);
            }

            public void renew(String tokenId, int currentTime) {
                Integer expireTime = map.getOrDefault(tokenId, -1);
                if (expireTime == -1 || expireTime <= currentTime) {
                    return;
                }
                map.put(tokenId, currentTime + timeToLive);
            }

            public int countUnexpiredTokens(int currentTime) {
                Map<String, Integer> tmp = new HashMap<>();
                for (String token : map.keySet()) {
                    if (map.get(token) > currentTime) {
                        tmp.put(token, map.get(token));
                    }
                }
                map.clear();
                map.putAll(tmp);
                return map.size();
            }
        }
    }
}
