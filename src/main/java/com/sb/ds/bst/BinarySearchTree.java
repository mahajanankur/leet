/**
 * 
 */
package com.sb.ds.bst;

/**
 * @author ankur
 * @crated 31-Jul-2021
 */
public class BinarySearchTree {

	private Node root;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(100);
		tree.insert(90);
		tree.insert(110);
		tree.insert(60);
		System.out.println(tree);
	}

	class Node {
		Node left;

		Node right;

		int value;

		public Node() {
		}

		public Node(Node left, Node right, int value) {
			super();
			this.left = left;
			this.right = right;
			this.value = value;
		}
	}

	public void insert(int val) {
		root = insertByRecursion(root, val);
	}

	private Node insertByRecursion(Node root, int val) {
		if (null == root) {
			root = new Node(null, null, val);
			return root;
		}
		if (val > root.value) {
			root.right = insertByRecursion(root.right, val);
		} else {
			root.left = insertByRecursion(root.left, val);
		}
		return root;
	}
}
