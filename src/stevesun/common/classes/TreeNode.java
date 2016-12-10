package stevesun.common.classes;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    
    public TreeNode(int x){this.val = x;}
    
    public TreeNode(TreeNode left, int val, TreeNode right) {
        this.left = left;
        this.val = val;
        this.right = right;
    }
}
