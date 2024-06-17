package com.fishercoder.solutions.secondthousand;

public class _1061 {
    public static class Solution1 {
        public String smallestEquivalentString(String s1, String s2, String baseStr) {
            UnionFind unionFind = new UnionFind();
            for (int i = 0; i < s1.length(); i++) {
                unionFind.union(s1.charAt(i), s2.charAt(i));
            }
            StringBuilder sb = new StringBuilder();
            for (char c : baseStr.toCharArray()) {
                sb.append((char) (unionFind.find(c) + 'a'));
            }
            return sb.toString();
        }

        class UnionFind {
            int[] ids;

            public UnionFind() {
                this.ids = new int[26];
                for (int i = 0; i < ids.length; i++) {
                    ids[i] = i;
                }
            }

            public void union(char a, char b) {
                int x = find(a);
                int y = find(b);
                if (x < y) {
                    ids[y] = x;
                } else {
                    ids[x] = y;
                }
            }

            public int find(char x) {
                while (x - 'a' != ids[x - 'a']) {
                    ids[x - 'a'] = ids[ids[x - 'a']];
                    x = (char) (ids[x - 'a'] + 'a');
                }
                return x - 'a';
            }
        }
    }
}
