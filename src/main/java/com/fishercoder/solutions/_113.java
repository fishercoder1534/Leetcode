package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

/**113. Path Sum II
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]
*/
public class _113 {
    //also, it's possible that a node's value could be negative, as long as the sum of root to leaf ends up to sum
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> allPaths = new ArrayList();
        if(root == null) return allPaths;
        List<Integer> path = new ArrayList();
        dfs(root, path, allPaths, sum);
        return allPaths;
    }

    
    private void dfs(TreeNode root, List<Integer> path, List<List<Integer>> allPaths, int sum) {
        path.add(root.val);
        if(root.left != null){
            dfs(root.left, path, allPaths, sum-root.val);
        }
        if(root.right != null){
            dfs(root.right, path, allPaths, sum-root.val);
        }
        if(root.left == null && root.right == null){
            if(sum == root.val){
                List<Integer> onePath = new ArrayList(path);
                allPaths.add(onePath);
            }
        }
        path.remove(path.size()-1);
    }


    public static void main(String...strings){
        _113 test = new _113();
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        int sum = 1;
        
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(-2);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right = new TreeNode(-3);
//        root.right.left = new TreeNode(-2);
//        root.left.left.left = new TreeNode(-1);
//        int sum = 2;
//         1
//        / \
//      -2   -3
//      / \   / 
//     1   3 -2 
//    /      
//   -1
        
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        int sum = 22;
//         5
//        / \
//       4   8
//      /   / \
//     11  13  4
//    /  \    / \
//   7    2  5   1
        List<List<Integer>> res = test.pathSum(root, sum);
        CommonUtils.printListList(res);
    }

}
