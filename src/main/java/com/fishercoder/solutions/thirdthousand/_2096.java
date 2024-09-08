package com.fishercoder.solutions.thirdthousand;

import com.fishercoder.common.classes.TreeNode;

public class _2096 {
    public static class Solution1 {
        /*
         * Steps for this problem:
         * 1. find the path from root the start and dest respectively, mark them using two directions: 'L' and 'R', i.e. you can only go down from root, so there's no up, 'U' direction;
         * 2. the LCA (the lowest common ancestor) of start and dest will be the joint of the shortest path;
         * 3. find the longest common prefix of these two paths, that can be cut off;
         * 4. reverse the startPath, so it becomes the path from start to LCA, then concatenate with destPath
         */
        public String getDirections(TreeNode root, int startValue, int destValue) {
            StringBuilder sb = new StringBuilder();
            String pathForStart = "";
            if (findPathFromRoot(root, startValue, sb)) {
                pathForStart = sb.toString();
            }
            sb.setLength(0);
            String pathForDest = "";
            if (findPathFromRoot(root, destValue, sb)) {
                pathForDest = sb.toString();
            }
            int lastIdenticalCharIndex = -1;
            int minLen = Math.min(pathForStart.length(), pathForDest.length());
            for (int i = 0; i < minLen; i++) {
                if (pathForStart.charAt(i) == pathForDest.charAt(i)) {
                    lastIdenticalCharIndex = i;
                } else {
                    break;
                }
            }
            sb.setLength(0);
            sb.append(pathForStart.substring(lastIdenticalCharIndex + 1));
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == 'L' || sb.charAt(i) == 'R') {
                    sb.setCharAt(i, 'U');
                }
            }
            sb.append(pathForDest.substring(lastIdenticalCharIndex + 1));
            return sb.toString();
        }

        private boolean findPathFromRoot(TreeNode root, int target, StringBuilder sb) {
            if (root == null) {
                return false;
            }
            if (root.val == target) {
                return true;
            }
            if (findPathFromRoot(root.left, target, sb.append("L"))) {
                return true;
            }
            sb.setLength(sb.length() - 1);
            if (findPathFromRoot(root.right, target, sb.append("R"))) {
                return true;
            }
            sb.setLength(sb.length() - 1);
            return false;
        }
    }
}
