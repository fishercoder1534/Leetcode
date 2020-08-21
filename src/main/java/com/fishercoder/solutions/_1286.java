package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1286 {
    public static class Solution1 {
        public static class CombinationIterator {

            List<String> list;
            int index;
            int combinationLength;
            boolean[] visited;

            public CombinationIterator(String characters, int combinationLength) {
                this.index = 0;
                this.list = new ArrayList<>();
                this.combinationLength = combinationLength;
                this.visited = new boolean[characters.length()];
                buildAllCombinations(characters, 0, new StringBuilder(), visited);
            }

            private void buildAllCombinations(String characters, int start, StringBuilder sb, boolean[] visited) {
                if (sb.length() == combinationLength) {
                    list.add(sb.toString());
                    return;
                } else {
                    for (int i = start; i < characters.length(); ) {
                        if (!visited[i]) {
                            sb.append(characters.charAt(i));
                            visited[i] = true;
                            buildAllCombinations(characters, i++, sb, visited);
                            visited[i - 1] = false;
                            sb.setLength(sb.length() - 1);
                        } else {
                            i++;
                        }
                    }
                }
            }

            public String next() {
                return list.get(index++);
            }

            public boolean hasNext() {
                return index < list.size();
            }
        }
    }
}
