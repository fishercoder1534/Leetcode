package stevesun.algorithms;

import stevesun.common.classes.TreeNode;

/**101. Symmetric Tree

    Total Accepted: 121737
    Total Submissions: 346738
    Difficulty: Easy

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3

Note:
Bonus points if you could solve it both recursively and iteratively. */
public class SymmetricTree {
	//a very natural idea flows out using recursion. Cheers.
	public boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		return isSymmetric(root.left, root.right);
	}

	private boolean isSymmetric(TreeNode left, TreeNode right) {
		if(left == null || right == null) return left == right;
		if(left.val != right.val) return false;
		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
	}

	public static void main(String... strings) {
		SymmetricTree test = new SymmetricTree();
		TreeNode root = new TreeNode(1);
		System.out.println(test.isSymmetric(root));
	}
}
