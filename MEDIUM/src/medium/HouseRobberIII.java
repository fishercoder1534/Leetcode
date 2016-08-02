package medium;

import java.util.HashMap;
import java.util.Map;

import classes.TreeNode;

public class HouseRobberIII {

    //simple recursion without cacheing: 1189 ms
    public int rob(TreeNode root) {
        if(root == null) return 0;
        
        int val = 0;
        if(root.left != null){
            val += rob(root.left.left) + rob(root.left.right);
        }
        if(root.right != null){
            val += rob(root.right.left) + rob(root.right.right);
        }
        val = Math.max(val + root.val, rob(root.left) + rob(root.right));
        return val;
    }
    
    //same idea, but with cacheing via a hashmap: 8 ms
    public int rob_dp(TreeNode root) {
        Map<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();
        return get(root, map);
    }
    
    private int get(TreeNode root, Map<TreeNode, Integer> map){
        if(root == null) return 0;
        if(map.containsKey(root)) return map.get(root);
        
        int val = 0;
        if(root.left != null) val += get(root.left.left, map) + get(root.left.right, map);
        if(root.right != null) val += get(root.right.left, map) + get(root.right.right, map);
        int max = Math.max(root.val + val, get(root.left, map) + get(root.right, map));
        map.put(root, max);
        return max;
    }


}
