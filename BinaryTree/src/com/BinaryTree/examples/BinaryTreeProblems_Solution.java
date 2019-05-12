package com.BinaryTree.examples;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeProblems_Solution {
	//Problems & Solution Program (1)
    public int maxInBinaryTree(BinaryTreeNode root) {
    	int maxValue = Integer.MIN_VALUE;
    	if(root != null) {
    		int leftMax = maxInBinaryTree(root.left);
    		int rightMax = maxInBinaryTree(root.right);
    		if(leftMax > rightMax) {
    			maxValue = leftMax;
    		}else {
    			maxValue = rightMax;
    		}
    		if(root.data >maxValue) {
    			maxValue = root.data;
    		}
    	}
    	return maxValue;
    }
    public int maxInBinaryTreeLevelOrder(BinaryTreeNode root) {
    	int max = Integer.MIN_VALUE;
    	if(root == null) {
    		return Integer.MIN_VALUE;
    	}
    	Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
    	q.offer(root);
    	while(!q.isEmpty()) {
    		BinaryTreeNode temp = q.poll();
    		if(temp.getData() > max) {
    			max = temp.getData();
    		}
    		if(temp != null) {
    			if(temp.getLeft() != null) {
    				q.offer(temp.getLeft());
    			}
    			if(temp.getRight() !=null) {
    				q.offer(temp.getRight());
    			}
    		}
    	}
    	return max;
    }
    public static void main(String[] args) {
    	
    	BinaryTreeNode root = new BinaryTreeNode(10);
		root.left = new BinaryTreeNode(11);
		root.left.left = new BinaryTreeNode(7);
		root.right = new BinaryTreeNode(9);
		root.right.left = new BinaryTreeNode(15);
		root.right.right = new BinaryTreeNode(8);
    	BinaryTreeProblems_Solution binaryTree = new BinaryTreeProblems_Solution();
    	System.out.println("Maximum Element in Binary tree = " + binaryTree.maxInBinaryTree(root));
    	System.out.println("Maximum Element in Binary tree Levelorder  = " + binaryTree.maxInBinaryTreeLevelOrder(root));
	}
}
