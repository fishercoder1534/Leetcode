package stevesun.algorithms;

import stevesun.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthofBinaryTree {
/**We can solve this problem using both BFS and DFS:
 * DFS is to visit every single root to leaf path and return the shortest one.
 * BFS is to visit every level and return whenever we find the first leaf node.*/
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0) return right+1;
        if(right == 0) return left+1;
        return Math.min(left, right)+1;
    }
    
    public static void main(String[] args){
        MinimumDepthofBinaryTree test = new MinimumDepthofBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(test.minDepth(root));
    }
    

    public int minDepth_BFS(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()){
            level++;
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
                if(curr.left == null && curr.right == null) return level;
            }
        }
        return level;
    }
    


}
