package com.tree;

public class BinTreeNode {
	
	private int data;
	private BinTreeNode left = null;
	private BinTreeNode right = null;

	public BinTreeNode(int data) {
		super();
		this.data = data;
	}
	public BinTreeNode() {
		
	}
	//getters and setters
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinTreeNode getLeft() {
		return left;
	}
	
	public void setLeft(BinTreeNode left) {
		this.left = left;
	}
	
	public BinTreeNode getRight() {
		return right;
	}
	
	public void setRight(BinTreeNode right) {
		this.right = right;
	}
		
}
