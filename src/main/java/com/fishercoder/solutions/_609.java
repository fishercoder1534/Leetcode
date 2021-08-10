package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _609 {

    public static class Solution1 {
        public List<List<String>> findDuplicate(String[] paths) {
            Map<String, List<String>> contentMap = new HashMap<>();
            for (String path : paths) {
                String[] contents = path.split(" ");
                List<String> list = new ArrayList<>();
                for (int i = 1; i < contents.length; i++) {
                    list.add(contents[i]);
                    int start = contents[i].indexOf('(');
                    int end = contents[i].indexOf(')');
                    String content = contents[i].substring(start + 1, end);
                    if (!contentMap.containsKey(content)) {
                        contentMap.put(content, new ArrayList<>());
                    }
                    List<String> dupFiles = contentMap.get(content);
                    dupFiles.add(contents[0] + "/" + contents[i].substring(0, start));
                }
            }
            List<List<String>> result = new ArrayList<>();
            for (String key : contentMap.keySet()) {
                if (contentMap.get(key).size() > 1) {
                    result.add(contentMap.get(key));
                }
            }
            return result;
        }
    }
}
