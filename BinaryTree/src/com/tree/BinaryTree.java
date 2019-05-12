package com.tree;

import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {

	private BinTreeNode root = null;
	private int diameter;

	public BinaryTree() {
		
	}
	
	//Insert a Node(This is level order insertion)
	public void insert(int data) {
		BinTreeNode temp;

		BinTreeNode newNode = new BinTreeNode(data);
		newNode.setLeft(null);
		newNode.setRight(null);

		if(null == root) {
			root = newNode;
			return;
		}

		LinkedList<BinTreeNode> queue = new LinkedList<BinTreeNode>();

		queue.addLast(root);
		while(!(queue.isEmpty())) {
			
			temp = queue.removeFirst();

			if( temp.getLeft() != null) {
				queue.addLast(temp.getLeft());
			}
			else {
				temp.setLeft(newNode);
				return;
			}
			if( temp.getRight() != null) {
				queue.addLast(temp.getRight());
			}
			else {
				temp.setRight(newNode);
				return;
			}
		}
	}

	//Search and Check for a Node
	public boolean isPresent(int data) {
		return isPresent(root,data);
	}

	private  boolean isPresent(BinTreeNode root,int data) {
		boolean found;
		if(null ==root)
			return false;
		if(root.getData() == data)
			return true;
		found = isPresent(root.getLeft(), data);
		if(found == true)
			return true;
		return isPresent(root.getRight(), data);
	}

	//Level Order Traversal of the Tree
	public void levelOrder( ) {
		
		BinTreeNode temp = root;
		if(null == temp) {
			System.out.println("No Elements in the Tree");
			return;
		}

		LinkedList<BinTreeNode> queue = new LinkedList<BinTreeNode>();

		queue.addLast(temp);
		while(!(queue.isEmpty())) {
			temp = queue.removeFirst();
			System.out.print(" " +temp.getData());
			
			if( temp.getLeft() != null) {
				queue.addLast(temp.getLeft());
			}
			if(temp.getRight() != null) {
				queue.addLast(temp.getRight());
			}			
		}
	}

	//Sum of all the elements in the Tree
	public int sumAllElements() {
		return sumAllElements(root);
	}

	private int sumAllElements(BinTreeNode root) {
		if(null == root)
			return 0;
		else
			return(root.getData()+sumAllElements(root.getLeft())+sumAllElements(root.getRight()));
	}


	//Pre Order Traversal (Recursive)
	public void preOrderTraversal() {
		preOrder(root);
	}

	private void preOrder(BinTreeNode root) {

		if(null != root) {
			System.out.print(" " +root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}	
	}

	//Post Order Traversal (Recursive)
	public void postOrderTraversal() {
		postOrder(root);
	}


	private void postOrder(BinTreeNode root) {
		if(null != root) {

			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(" " +root.getData());
		}	
	}

	//In Order Traversal (Recursive)
	public void inOrderTraversal() {
		inOrder(root);
	}

	private void inOrder(BinTreeNode root) {
		if(null != root) {
			inOrder(root.getLeft());
			System.out.print(" " +root.getData());
			inOrder(root.getRight());	
		}
	}

	public boolean isTreeEmpty() {
		return (root==null);
	}

	public BinTreeNode getRootNode() {
		return root;
	}

	//Pre Order Traversal (Iterative)
	public void preOrderIterative() {
		preOrderIterative(root);
		System.out.println();
	}

	private void preOrderIterative(BinTreeNode root) {
		if(null == root)
			return ;
		Stack<BinTreeNode> stack = new Stack<BinTreeNode>();
		while(true){
			while(root!=null){
				System.out.print(" "+root.getData());
				stack.push(root);
				root=root.getLeft();
			}
			if(stack.isEmpty())
				break;
			root =(BinTreeNode)stack.pop();
			root = root.getRight();
		}	
	}

	public void preOrderIterativeImp() {
		preOrderIterativeImp(root);
		System.out.println();
	}

	private void preOrderIterativeImp(BinTreeNode root) {
		if(null == root)
			return ;
		Stack<BinTreeNode> stack = new Stack<BinTreeNode>();
		stack.push(root);
		while(!stack.isEmpty()){
			if(root!=null){
				System.out.print(" "+root.getData());
				root=root.getLeft();
				if(root!=null)
					stack.push(root);

			}
			else {	
				root =(BinTreeNode)stack.pop();
				root = root.getRight();
				if(root != null)
					stack.push(root);
			}
		}	
	}

	//In Order Traversal (Iterative)
	public void inOrderIterative() {
		inOrderIterative(root);
		System.out.println();
	}

	private void inOrderIterative(BinTreeNode root) {
		if(null == root)
			return ;
		Stack<BinTreeNode> stack = new Stack<BinTreeNode>();
		while(true){
			while(root!=null){
				stack.push(root);
				root=root.getLeft();
			}
			if(stack.isEmpty())
				break;
			root =(BinTreeNode)stack.pop();
			System.out.print(" "+root.getData());
			root = root.getRight();
		}
	}

	public void inOrderIterativeImp() {
		inOrderIterativeImp(root);
		System.out.println();
	}

	private void inOrderIterativeImp(BinTreeNode root) {
		if(null == root)
			return ;
		Stack<BinTreeNode> stack = new Stack<BinTreeNode>();
		stack.push(root);
		while(!stack.isEmpty()){
			if(root!=null){
				root=root.getLeft();
				if(root!=null)
					stack.push(root);
			}
			else {
				root =(BinTreeNode)stack.pop();
				System.out.print(" "+root.getData());
				root = root.getRight();
				if(root!=null)
					stack.push(root);
			}
		}
	}

	public void postOrderIterativeImp() {
		postOrderIterativeImp(root);
		System.out.println();
	}
	// Not working
	private void postOrderIterativeImp(BinTreeNode root) {
		if(null == root)
			return ;
		Stack<BinTreeNode> stack = new Stack<BinTreeNode>();
		stack.push(root);
		while(!stack.isEmpty()){
			if(root!=null){
				root=root.getLeft();
				if(root!=null)
					stack.push(root);
			}
			else {
				root =(BinTreeNode)stack.pop();
				stack.push(root);
				root = root.getRight();
				if(root!=null)
					stack.push(root);

			}

			root =(BinTreeNode)stack.pop();
			System.out.print(" "+root.getData());
			//stack.push(root);

		}
	}

	////Post Order Traversal (Iterative)
	public void postOrderIterative() {
		postOrderIterative(root);
		System.out.println();
	}

	private void postOrderIterative(BinTreeNode root) {
		if(root == null)
			return;
		Stack<BinTreeNode> stack = new Stack<BinTreeNode>();
		stack.push(root);
		BinTreeNode prev = null;
		while(!stack.isEmpty()) {
			root=stack.peek();
			//Downward movement traverse down
			if(prev==null || prev.getLeft() == root || prev.getRight() == root) {
				if(root.getLeft() != null) {
					stack.push(root.getLeft());
				}
				else if(root.getRight() != null)
					stack.push(root.getRight());
				else {
					System.out.print(" "+stack.pop().getData());
					//stack.pop();
				}
			}
			//Traverse Up from left child
			else if(root.getLeft() == prev) {
				if(root.getRight() != null)
					stack.push(root.getRight());
				else {
					System.out.print(" "+stack.pop().getData());
					//stack.pop();
				}
			}
			//Traverse up from right child
			else if(root.getRight() == prev) {
				System.out.print(" "+stack.pop().getData());
				//stack.pop();
			}
			prev = root;
		}

	}

	//Find Max element in the Binary Tree
	public int maxElement() {
		return maxElement(root);
	}

	private int maxElement(BinTreeNode root) {
		
		int left, right,max,root_value;
		if(root==null)
			return 0;
		else {
			left = maxElement(root.getLeft());
			right = maxElement(root.getRight());
			root_value = root.getData();
			max = Math.max(left, right);
			max = Math.max(max, root_value);

			return max;
		}
	}

	public int maxElementSecond() {
		return maxElementSecond(root);
	}

	private int maxElementSecond(BinTreeNode root) {

		if(root == null) return 0;
		return Math.max(root.getData(), Math.max(maxElementSecond(root.getLeft()), maxElementSecond(root.getRight())));
	}

	//Size of Binary Tree
	public int getSize() {
		return getSize(root);
	}

	private int getSize(BinTreeNode root) {
		if(root == null)
			return 0;
		else
			return (getSize(root.getLeft()) + getSize(root.getRight())+ 1);
	}

	//Get the Height of the Tree
	public int getHeight() {
		return getHeight(root);
	}
	private int getHeight(BinTreeNode root) {
		
		if(root == null) {
			return 0;
		}
		if(null == root.getLeft() && null == root.getRight()) {
			return 0;
		}
		else {
			return (Math.max(getHeight(root.getLeft()), getHeight(root.getRight()))+1);
		}
	}

	public int heightOfBinaryTree() {
		return heightOfBinaryTree(root);
	}

	private  int heightOfBinaryTree(BinTreeNode root) {
		
		int leftHeight, rightHeight;
		if(null == root) {
			return 0;
		}
		if(null == root.getLeft() && null == root.getRight())
			return 0;
		else {

			leftHeight = heightOfBinaryTree(root.getLeft());

			rightHeight = heightOfBinaryTree(root.getRight());

			if(leftHeight > rightHeight) {
				return (leftHeight + 1);
			}
			else {
				return (rightHeight + 1);
			}
			//return (1+Math.max(leftHeight, rightHeight));
		}
	}

	//Find the diameter of the Tree. 
	//Number of nodes on the longest path between two leaves in the tree
	public int diameterTree() {
		diameter = 0;
		diameterTree(root);
		return diameter;
	}

	private int diameterTree(BinTreeNode root) {
		int left, right;
		if(null == root) {
			return 0;
		}
		else {

			left = diameterTree(root.getLeft());
			right = diameterTree(root.getRight());
			if(left+right+1 > diameter)
				diameter = left+right+1;
			return Math.max(left, right)+1;
		}

	}

	//Number of nodes on the longest path between two leaves in the tree
	public int diameterTreeSec() {

		return diameterTreeSec(root);
	}

	public int diameterTreeSec(BinTreeNode root) {
		int leftDiameter, rightDiameter;
		if(null == root) {
			return 0;
		}
		else {

			int numNodesLeft = getHeight(root.getLeft())+1;
			int numNodesRight = getHeight(root.getRight())+1;

			leftDiameter = diameterTreeSec(root.getLeft());
			rightDiameter = diameterTreeSec(root.getRight());

			return Math.max(numNodesLeft+numNodesRight+1, Math.max(leftDiameter, rightDiameter));
		}

	}


	//Print paths form root-leaf
	public void  printPaths() {
		int[] path = new int[getHeight()+1];
		printPath(root, path, 0);
	}

	private  void printPath(BinTreeNode root, int[] path, int pathLen) {
		if(root == null) {
			return;
		}
		path[pathLen] = root.getData();
		pathLen++;
		if(root.getLeft() == null && root.getRight() == null) {
			printArray(path, pathLen);
		}
		else {
			printPath(root.getLeft(), path, pathLen);
			printPath(root.getRight(), path, pathLen);
		}	

	}

	//Print different paths from the root
	private void printArray(int [] arr, int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(" " +arr[i]);
		}
		System.out.println();
	}

	//Print Ancestor Nodes(General)
	public boolean printAllAncestors(int data) {
		System.out.println("Ancestor Nodes:");
		boolean hasAncestor = printAllAncestors(root,data);
		System.out.println();
		return hasAncestor;
	}

	private boolean printAllAncestors(BinTreeNode root, int data) {
		if(null == root)
			return false;
		if((root.getData() == data) ||
				(printAllAncestors(root.getLeft(), data)) || (printAllAncestors(root.getRight(), data))) {
			if(root.getData() != data)
				System.out.print(" " +root.getData());
			return true;
		}		
		return false;
	}

	//Does Tree has Path Sum = given Sum
	public boolean hasPathSum(int sum) {
		return hasPathSum(root, sum);
	}

	private boolean hasPathSum(BinTreeNode root, int sum) {
		if(null == root) 
			return (sum==0);
		else {
			int subSum = sum - root.getData(); 
			return(hasPathSum(root.getLeft(), subSum)||hasPathSum(root.getRight(), subSum));

		}
	}

}
