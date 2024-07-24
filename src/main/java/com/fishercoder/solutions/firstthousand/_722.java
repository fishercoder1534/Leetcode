package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.List;

public class _722 {
    public static class Solution1 {
        /**
         * My completely original solution.
         * Not a hard one, just some corner cases to consider.
         */
        public List<String> removeComments(String[] source) {
            List<String> result = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            boolean possiblyMultilineComment = false;
            for (String line : source) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == '/' && i + 1 < line.length()) {
                        //adding (&& !possiblyMultilineComment) is for cases like test 6
                        if (line.charAt(i + 1) == '*' && !possiblyMultilineComment) {
                            //but cannot break here, because this might be a single line comment, so we need to find the closing "*/"
                            possiblyMultilineComment = true;
                            //increment i by one to bypass this '*'
                            i++;
                        } else if (line.charAt(i + 1) == '/') {
                            //this is a single line comment, remove
                            if (!possiblyMultilineComment) {
                                //only at this time, we know this is not part of a possibly multiline comment,
                                //then we can safely break out, see test case 4
                                break;
                            }
                        } else if (!possiblyMultilineComment) {
                            sb.append(line.charAt(i));
                        }
                    } else if (line.charAt(i) == '*' && i + 1 < line.length() && line.charAt(i + 1) == '/' && possiblyMultilineComment) {
                        //this is the end of the multiline comment
                        possiblyMultilineComment = false;
                        //increment i by one to bypass the closing '/'
                        i++;
                    } else if (!possiblyMultilineComment) {
                        sb.append(line.charAt(i));
                    }
                }
                if (sb.length() > 0 && !possiblyMultilineComment) {
                    result.add(sb.toString());
                    sb.setLength(0);
                }
            }
            return result;
        }
    }
}
