/**
 * 
 */
package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import classes.TreeNode;

/**
 * This is a util class to contain all tree related methods.
 */
public class TreeUtils {
	
	/**
	 * This method is to construct a normal binary tree. The input reads like
	 * this for [5, 3, 6, 2, 4, null, null, 1]:

		       5
	         /   \
	        3     6
	       / \    / \
	      2   4  N   N
	     /
	    1 
	    
	 * where N is null.
	 * 
	 * Basically you go from top level to bottom, then left to right within the level
	 * 
	 * Cool! Confirmed/tested out that this one does exactly the same as the bruteforce one does!
	 */
	@Notes(issue = "This is usually how Leetcode OJ passes a binary tree into testing.")
	public static TreeNode constructBinaryTree(List<Integer> treeValues) {
		TreeNode root = new TreeNode(null, treeValues.get(0), null);

		final Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		final int half = treeValues.size() / 2;

		for (int i = 0; i < half; i++) {
			if (treeValues.get(i) != null) {
				final TreeNode current = queue.poll();
				final int left = 2 * i + 1;
				final int right = 2 * i + 2;

				if (treeValues.get(left) != null) {
					current.left = new TreeNode(null, treeValues.get(left),
							null);
					queue.add(current.left);
				}
				if (right < treeValues.size() && treeValues.get(right) != null) {
					current.right = new TreeNode(null, treeValues.get(right),
							null);
					queue.add(current.right);
				}
			}
		}
		return root;
	}
	
	@Notes(issue = "This brute force takes in only first seven values to construct a tree, I really need to write one method that takes any arbitrary number of values.")
	public static TreeNode bruteForceConstructBinaryTree(
			List<Integer> treeValues) {
		TreeNode root = null;

		if (treeValues.size() < 7)
			return root;

		root = new TreeNode(treeValues.get(0));
		root.left = new TreeNode(treeValues.get(1));
		root.right = new TreeNode(treeValues.get(2));
		root.left.left = new TreeNode(treeValues.get(3));
		root.left.right = new TreeNode(treeValues.get(4));
		root.right.left = new TreeNode(treeValues.get(5));
		root.right.right = new TreeNode(treeValues.get(6));
		return root;
	}

	public static void printBinaryTree(TreeNode root) {
		CommonUtils.println("\n\nPrinting out the binary tree in a very visual manner as below:");
		
		// imitating from BTreePrinter class
		int maxLevel = TreeUtils.maxLevel(root);

		printNodeInternal(Collections.singletonList(root), 1, maxLevel);
	}
	
	private static int maxLevel(TreeNode root) {
		if (root == null)
			return 0;

		return Math.max(TreeUtils.maxLevel(root.left),
				TreeUtils.maxLevel(root.right)) + 1;
	}
	
	private static void printNodeInternal(
			List<TreeNode> list, int level, int maxLevel) {
		if (list.isEmpty() || CommonUtils.isAllElementsNull(list))
			return;

		int floor = maxLevel - level;
		int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
		int firstSpaces = (int) Math.pow(2, (floor)) - 1;
		int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

		CommonUtils.printWhitespaces(firstSpaces);

		List<TreeNode> newNodes = new ArrayList<TreeNode>();
		for (TreeNode node : list) {
			if (node != null) {
				System.out.print(node.val);
				newNodes.add(node.left);
				newNodes.add(node.right);
			} else {
				newNodes.add(null);
				newNodes.add(null);
				System.out.print(" ");
			}

			CommonUtils.printWhitespaces(betweenSpaces);
		}
		System.out.println("");

		for (int i = 1; i <= endgeLines; i++) {
			for (int j = 0; j < list.size(); j++) {
				CommonUtils.printWhitespaces(firstSpaces - i);
				if (list.get(j) == null) {
					CommonUtils.printWhitespaces(endgeLines + endgeLines + i
							+ 1);
					continue;
				}

				if (list.get(j).left != null)
					System.out.print("/");
				else
					CommonUtils.printWhitespaces(1);

				CommonUtils.printWhitespaces(i + i - 1);

				if (list.get(j).right != null)
					System.out.print("\\");
				else
					CommonUtils.printWhitespaces(1);

				CommonUtils.printWhitespaces(endgeLines + endgeLines - i);
			}

			System.out.println("");
		}

		printNodeInternal(newNodes, level + 1, maxLevel);
	}
	
	public static void inOrderTraversal(TreeNode root){
		inOrder(root);
	}

	private static void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.val + " ");
		inOrder(root.right);
	}
	
	public static void main (String... args){
	    //test random int generator
		List<Integer> treeValues = CommonUtils.randomIntArrayGenerator(24);
		
		List<Integer> treeValues2 = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
		
		//test tree construction
		TreeNode root1 = bruteForceConstructBinaryTree(treeValues2);
		inOrderTraversal(root1);
		printBinaryTree(root1);
		
		// test tree construction
		TreeNode root2 = constructBinaryTree(treeValues);
		inOrderTraversal(root2);
		printBinaryTree(root2);
	}
}
