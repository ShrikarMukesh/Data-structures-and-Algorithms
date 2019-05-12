package com.BinaryTree.examples;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class BinaryTree {
	public void PreOrder(BinaryTreeNode root) {
		if(root != null) {
			System.out.print(" "+root.data);
			PreOrder(root.left);
			PreOrder(root.right);
		}
	}
	public ArrayList<Integer> PreOrderTraversal(BinaryTreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null) {
			return res;
		}
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		s.push(root);
		while(!s.isEmpty()) {
			BinaryTreeNode temp = s.pop();
			res.add(temp.data);
			if(temp.right != null) {
				s.push(temp.right);
			}
			if(temp.left !=null) {
				s.push(temp.left);
			}
		}
		return res;
	}
	static void insert(BinaryTreeNode temp, int key)
	{
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(temp);

		// Do level order traversal until we find
		// an empty place. 
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			if (temp.left == null) {
				temp.left = new BinaryTreeNode(key);
				break;
			} else
				q.add(temp.left);

			if (temp.right == null) {
				temp.right = new BinaryTreeNode(key);
				break;
			} else
				q.add(temp.right);
		}
	}
	public static void main(String args[])
	{
		BinaryTreeNode root = new BinaryTreeNode(10);
		root.left = new BinaryTreeNode(11);
		root.left.left = new BinaryTreeNode(7);
		root.right = new BinaryTreeNode(9);
		root.right.left = new BinaryTreeNode(15);
		root.right.right = new BinaryTreeNode(8);

		BinaryTree binaryTree = new BinaryTree();
		System.out.print( "PreOrder traversal before insertion:");
		binaryTree.PreOrder(root);
		insert(root, 89);
		System.out.println();
		binaryTree.PreOrder(root);
		System.out.println();
		

	}
}