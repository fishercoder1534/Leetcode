package stevesun.algorithms;

import stevesun.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindLeavesofBinaryTree {

    List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> findLeaves(TreeNode root) {
        dfs(root);
        return result;
    }
    
    int dfs(TreeNode root){
        if(root == null) return 0;
        int level = Math.max(dfs(root.left), dfs(root.right))+1;
        if(result.size() < level){
            result.add(new ArrayList<Integer>());
        }
        result.get(level-1).add(root.val);
        return level;
    }

}
