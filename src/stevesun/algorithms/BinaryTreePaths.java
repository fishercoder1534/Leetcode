package stevesun.algorithms;

import stevesun.common.classes.TreeNode;
import stevesun.common.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

/**257. Binary Tree Paths
 *
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
*/
public class BinaryTreePaths {
    //a very typical/good question to test your recursion/dfs understanding.
    public List<String> binaryTreePaths_more_concise(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        if(root == null) return paths;
        dfs(root, paths, "");
        return paths;
    }
    
    private void dfs(TreeNode root, List<String> paths, String path) {
        if(root.left == null && root.right == null){
            paths.add(path + root.val);
            return;
        }
        path += root.val + "->";
        if(root.left != null) dfs(root.left, paths, path);
        if(root.right != null) dfs(root.right, paths, path);
    }
    
    public static void main(String...strings){
        BinaryTreePaths test = new BinaryTreePaths();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        List<String> res = test.binaryTreePaths(root);
        CommonUtils.print(res);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        dfs(root, paths, new StringBuilder());
        return paths;
    }

    private void dfs(TreeNode root, List<String> paths, StringBuilder sb) {
        if(root == null) return;
        if(root.left == null && root.right == null){
          sb.append(root.val);
          paths.add(sb.toString());
          return ;
        } 
        sb.append(root.val + "->");
        String curr = sb.toString();
        if(root.left != null) dfs(root.left, paths, sb);
        sb.setLength(0);
        sb.append(curr);
        if(root.right != null) dfs(root.right, paths, sb);
    }
}
