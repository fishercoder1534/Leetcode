package hard;

import java.util.ArrayList;
import java.util.List;

import classes.TreeNode;

public class BinaryTreePostOrderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        return post(root, list);
    }
    
    List<Integer> post(TreeNode root, List<Integer> list){
        if(root == null) return list;
        if(root.left != null) post(root.left, list);
        if(root.right != null) post(root.right, list);
        list.add(root.val);
        return list;
    }

}
