package com.binarysearchtree;

import java.util.LinkedList;
import java.util.Stack;

public class BinarySearchTree {

	private BinaryTreeNode root;
	private  int count = 0;
	private int diameter;
	private int prev;
	int sum =0;

	//private Stack<BinaryTreeNode> s =new Stack<BinaryTreeNode>();
	//private BinaryTreeNode n;

	public BinaryTreeNode getRootNode() {
		return root;
	}
	//Insert recursive
	public void insertRec(int data) {
		root = insertRec(root,data);
	}
	public BinaryTreeNode insertRec(BinaryTreeNode root,int data) {

		if(root == null) {

			BinaryTreeNode newBinNode = new BinaryTreeNode(data);
			root = newBinNode;
		}
		else {
			if(data < root.getData()) {
				root.setLeft(insertRec(root.getLeft(), data));
			}
			else {
				root.setRight(insertRec(root.getRight(), data));
			}
		}
		return root;
	}

	public void insertIterative(int value) {  

		if(root == null) {
			root = new BinaryTreeNode(value);
			return;
		}
		BinaryTreeNode current = root;
		while (current != null)
		{
			if(value < current.getData())  {   

				if(current.getLeft() == null) { 
					current.setLeft(new BinaryTreeNode(value)); 
					return; 
				}
				else {
					current = current.getLeft();  
				}
			}
			else {
				if(current.getRight() == null) { 
					current.setRight(new BinaryTreeNode(value));
					return; 
				}
				else {
					current = current.getRight(); 
				}
			}
		}
	}

	//PreOrder Traversal
	public void preOrder() {
		preOrder(root);
	}
	private void preOrder(BinaryTreeNode root) {
		if(null != root) {
			System.out.print(root.getData()+" ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
	//InOrder Traversal
	public void inOrder() {
		inOrder(root);
	}
	private  void inOrder(BinaryTreeNode root) {
		if(null == root) {
			return;
		}
		else { 
			inOrder(root.getLeft());
			System.out.print(root.getData()+" ");
			inOrder(root.getRight());
		}	
	}
	//PostOrder Traversal
	public void postOrder() {
		postOrder(root);
	}

	public void postOrder(BinaryTreeNode root) {
		if(null == root) {
			return;
		}
		else {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData()+" ");
		}
	}

	//Find the Maximum Value in the Tree
	public int findMax() {
		BinaryTreeNode result = findMax(root);
		return result.getData();
	}
	private BinaryTreeNode findMax(BinaryTreeNode root) {

		BinaryTreeNode temp = root;
		while(temp.getRight() != null) {
			temp = temp.getRight();
		}
		return temp;
	}
	public int findMin() {
		BinaryTreeNode result = findMin(root);
		return result.getData();
	}
	//Find the Maximum Value in the Tree
	private BinaryTreeNode findMin(BinaryTreeNode root) {

		BinaryTreeNode temp = root;
		while(temp.getLeft() != null) {
			temp = temp.getLeft();
		}
		return temp;
	}

	public int findMaxRec() {
		BinaryTreeNode result = findMaxRec(root);
		return result.getData();
	}
	// Find Max Value using Recursion 
	public static BinaryTreeNode findMaxRec(BinaryTreeNode root) {

		if(root == null){
			return root;
		}
		else if(null == root.getRight()) {
			return root;
		}
		else {
			return findMaxRec(root.getRight());
		}

	}

	//Delete a Node from the Tree
	public void  delete(int data) {	
		root = delete(root, data);
	}

	public BinaryTreeNode delete(BinaryTreeNode root,int data) {
		BinaryTreeNode temp;
		if(null == root) {
			System.out.println("Element Not Found");
			return null;
		}
		else if(data < root.getData()) {
			root.setLeft(delete(root.getLeft(), data));
		}
		else if(data > root.getData()) {
			root.setRight(delete(root.getRight(), data));
		}
		else {
			if(root.getLeft() != null && root.getRight() != null) {
				temp = findMax(root.getLeft()); 

				root.setData(temp.getData());

				root.setLeft(delete(root.getLeft(), root.getData()));
			}
			else {
				//temp = root;

				if(root.getLeft() != null) {
					root = root.getLeft();
				}
				else if(root.getRight() != null) {
					root = root.getRight();
				}
				else {
					root = null;
				}
				root = null;
			}
		}
		return root;
	}

	//Calculate Sum of all the elements in the Tree
	public int treeSum() {
		return treeSum(root);
	}

	private int treeSum(BinaryTreeNode root) {
		if(null == root) {
			return 0;
		}
		else {
			int leftSum = treeSum(root.getLeft());
			int rightSum = treeSum(root.getRight());
			return (root.getData() + leftSum + rightSum);
			//return(root.getData() + treeSum(root.getLeft()) + treeSum(root.getRight()));
		}
	}

	public int leafSum() {
		int result = leafSum(root);
		return result;
	}
	public int leafSum(BinaryTreeNode root){ 

		if (root == null) {
			return 0; 
		}
		if (root.getLeft() == null && root.getRight() == null) {
			sum = sum + root.getData(); 
		}
		leafSum(root.getLeft()); 
		leafSum(root.getRight()); 
		return sum;
	} 

	//LevelOrder Traversal
	public void levelOrder() {
		levelOrder(root);
	}
	public void levelOrder(BinaryTreeNode root) {
		BinaryTreeNode temp = root;
		if(null == temp) {
			System.out.println("No Elements in the Tree");
			return;
		}

		LinkedList<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();

		queue.addLast(temp);
		while(!(queue.isEmpty())) {
			temp = queue.removeFirst();
			System.out.print(" " +temp.getData());
			if(null != temp.getLeft()) {
				queue.addLast(temp.getLeft());
			}
			if(null != temp.getRight()) {
				queue.addLast(temp.getRight());
			}		
		}
	}

	public void preOrderIterativeImp() {
		preOrderIterativeImp(root);
		System.out.println();
	}

	private void preOrderIterativeImp(BinaryTreeNode root) {

		if(null == root) {
			return;
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(root);
		while(!stack.isEmpty()){
			if(root!=null){
				System.out.print(" "+root.getData());
				stack.push(root);
				root=root.getLeft();
			}
			else {

				root =(BinaryTreeNode)stack.pop();
				stack.push(root);
				root = root.getRight();
				stack.pop();
			}
		}	
	}

	//Height of the Tree
	public int heightBST() {
		return heightOfBinaryTree(root);
	}

	private int heightOfBinaryTree(BinaryTreeNode root) {

		int leftHeight, rightHeight;

		if(null == root) {
			return 0;
		}
		else {

			leftHeight = heightOfBinaryTree(root.getLeft());

			rightHeight = heightOfBinaryTree(root.getRight());

			if(leftHeight > rightHeight) {

				return (leftHeight +1);
			}
			else {
				return (rightHeight +1);
			}
		}
	}
	//Is this Binary Search Tree
	public boolean isBinarySearchTree() {
		return isBST(root);
	}

	private  boolean isBST(BinaryTreeNode root) {
		if(null == root) {
			return true;
		}
		if(root.getLeft() != null && findMax(root.getLeft()).getData() > root.getData()) {
			return false;
		}
		if(root.getRight() != null && findMin(root.getRight()).getData() < root.getData()) {
			return false;
		}
		/*if(!isBST(root.getLeft()) || !isBST(root.getRight())) {
			return false;
		}*/
		if(!isBST(root.getLeft())) {
			return false;
		}
		if(!isBST(root.getRight())) {
			return false;
		}
		return true;
	}
	//check BST Hacker rank solution
	boolean checkBST() {
		return checkBST(root, 0, 10000); // range of values in problem
	}

	boolean checkBST(BinaryTreeNode node, int min, int max) {
		if (node == null) {
			return true;
		} else if (node.getData() < min || node.getData() > max) {
			return false;
		}
		return checkBST(node.getLeft(), min, node.getData() - 1) && checkBST(node.getRight(), node.getData() + 1, max);
	}

	//Print different paths from the root
	public void  printPaths() {
		int[] path = new int[heightBST()];
		printPath(root, path, 0);
	}
	private  void printPath(BinaryTreeNode root, int[] path, int pathLen) {
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
	private void printArray(int [] arr, int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(" " +arr[i]);
		}
		System.out.println();
	}
	//Find the diameter of the Tree
	public int diameterTree() {
		diameterTree(root);
		return diameter+1;
	}

	public int diameterTree(BinaryTreeNode root) {
		int left, right;
		if(null == root) {
			return 0;
		}
		else {
			left = diameterTree(root.getLeft());
			right = diameterTree(root.getRight());
			if(left+right > diameter) {
				diameter = left+ right;
			}
			return Math.max(left, right)+1;
		}
	}

	//Is this Balanced Tree
	public boolean isBalanced() {
		if(isBalanced(root) == -1) {
			return false;
		}
		else {
			return true;
		}
	}

	private int isBalanced(BinaryTreeNode root) {
		int left,right;
		if(root==null) {
			return 0;
		}
		left = isBalanced(root.getLeft());
		if(left==-1) {
			return left;
		}
		right = isBalanced(root.getRight());
		if(right==-1) {
			return right;
		}
		if((Math.abs(left-right))>1) {
			return -1;
		}
		return Math.max(left, right)+1;
	}
	//Print the values in the range
	public void printRange(int k1,int k2) {
		
		printRange(root,k1,k2);
		System.out.println();
	}

	private void printRange(BinaryTreeNode root, int k1, int k2) {

		if(root==null)
			return;
		if(k1<=root.getData()) 
			printRange(root.getLeft(),k1,k2);

		if(k1<=root.getData() && k2>=root.getData())
			System.out.print(" "+root.getData());

		if(k2>=root.getData())
			printRange(root.getRight(),k1,k2);	
	}
	
	//Print Ancestor Nodes(General)
	public boolean printAllAncestors(int data) {
		
		System.out.println("Ancestor Nodes:");
		boolean hasAncestor = printAllAncestors(root,data);
		System.out.println();
		return hasAncestor;
	}

	private boolean printAllAncestors(BinaryTreeNode root, int data) {
		if(null == root)
			return false;
		if((root.getData() == data) || (root.getData() == data) ||
				(printAllAncestors(root.getLeft(), data)) || (printAllAncestors(root.getRight(), data))) {
			System.out.print(" " +root.getData());
			return true;
		}		
		return false;
	}

	//LCA(General)
	public BinaryTreeNode findLCA(int num1, int  num2) {
		return findLCA(root,num1, num2 );
	}

	private BinaryTreeNode findLCA(BinaryTreeNode root, int num1, int num2) {

		BinaryTreeNode left, right;
		if(null==root) { 
			return root;
		}
		if(root.getData()==num1 || root.getData()==num2) {
			return root;
		}
		left=findLCA(root.getLeft(), num1, num2);
		right=findLCA(root.getRight(), num1, num2);
		if(left!=null && right!=null) {
			return root;
		}
		if(left!=null) {
			return left;
		}
		else {
			return right;
		}
	}
  /**************************************************************** */
	//Check isBST second
	public boolean isBSTImprovedSec() {
		prev=0;
		return isBSTImprovedSec(root);
	}

	private boolean isBSTImprovedSec(BinaryTreeNode root) {
		if(null == root) {
			return true;
		}
		if(!isBSTImprovedSec(root.getLeft())) {
			return false;
		}
		if(root.getData()<prev) {
			return false;
		}
		System.out.println("prev = "+prev +" root = "+root.getData());
		prev = root.getData();
		//System.out.println("prev"+prev +"root"+root.getData());
		return (isBSTImprovedSec(root.getRight()));
	}

	private void resetCount() {
		count = 0;
	}

	public BinaryTreeNode pubkthSmallestNodeSecond(int k) {
		resetCount();
		return kthSmallestNodeSecond(root,k);
	}

	private BinaryTreeNode kthSmallestNodeSecond(BinaryTreeNode root, int k) {
		if(null == root) {
			return null;
		}

		BinaryTreeNode left = kthSmallestNodeSecond(root.getLeft(),k);
		if(left != null) return left;
		if(++count == k) {

			//System.out.println(+k +"th Node" + ":" +root.getData());
			return root;
		}
		return kthSmallestNodeSecond(root.getRight(), k);
	}

    //Search the Node
	public boolean searchNode(int data) {

		BinaryTreeNode b = searchNode(root, data);
		if(b.getData() == data) {
			return true;
		}else {
			return false;
		}
		//return searchNode(root, data);
	}

	private BinaryTreeNode searchNode(BinaryTreeNode root, int data) {

		BinaryTreeNode left,right;
		if(root==null)
			return null;
		if(root.getData()==data)
			return root;
		left=searchNode(root.getLeft(), data);
		right=searchNode(root.getRight(), data);
		if(left!=null)
			return left;
		else 
			return right;
	}

	public boolean isTreeEmpty() {
		return (root==null);
	}

	public void deleteIterative(int key) {

		Stack<BinaryTreeNode> binNodeStack = new Stack<BinaryTreeNode>();
		if (root == null)
			return ;
		BinaryTreeNode deleteNode = root;
		while (deleteNode != null){
			if (key < deleteNode.getData()){
				binNodeStack.push(deleteNode);
				deleteNode = deleteNode.getLeft();
			}else if (key > deleteNode.getData()){
				binNodeStack.push(deleteNode);
				deleteNode = deleteNode.getRight();
			}else{

				if (deleteNode.getLeft() == null && deleteNode.getRight() == null){
					BinaryTreeNode temp = (BinaryTreeNode)binNodeStack.pop();
					if(temp.getLeft() == deleteNode)
						temp.setLeft(null);
					else
						temp.setRight(null);
					deleteNode = null;
				}else if (deleteNode.getLeft()== null){
					BinaryTreeNode temp = (BinaryTreeNode)binNodeStack.pop();
					if(temp.getLeft() == deleteNode)
						temp.setLeft(deleteNode.getRight());
					else
						temp.setRight(deleteNode.getRight());
					deleteNode = null;
				}else if (deleteNode.getRight() == null){
					BinaryTreeNode temp = (BinaryTreeNode)binNodeStack.pop();
					if(temp.getLeft() == deleteNode)
						temp.setLeft(deleteNode.getLeft());
					else
						temp.setRight(deleteNode.getLeft());
					deleteNode = null;
				}else{
					BinaryTreeNode maxNode = findMax(deleteNode.getLeft());
					deleteNode.setData(maxNode.getData());
					key = maxNode.getData();
					binNodeStack.push(deleteNode);
					deleteNode = deleteNode.getLeft(); 
				}
			}
		}
		binNodeStack=null;
	}

	public void deleteIterativeImproved(int key) {

		BinaryTreeNode binNodeParent = null;
		if (root == null)
			return ;
		BinaryTreeNode deleteNode = root;
		while (deleteNode != null){
			if (key < deleteNode.getData()){
				binNodeParent = deleteNode;
				deleteNode = deleteNode.getLeft();
			}else if (key > deleteNode.getData()){
				binNodeParent = deleteNode;
				deleteNode = deleteNode.getRight();
			}else{

				if (deleteNode.getLeft() == null && deleteNode.getRight() == null){
					BinaryTreeNode temp = binNodeParent;
					if(temp.getLeft() == deleteNode)
						temp.setLeft(null);
					else
						temp.setRight(null);
					deleteNode = null;
				}else if (deleteNode.getLeft()== null){
					BinaryTreeNode temp = binNodeParent;
					if(temp.getLeft() == deleteNode)
						temp.setLeft(deleteNode.getRight());
					else
						temp.setRight(deleteNode.getRight());
					deleteNode = null;
				}else if (deleteNode.getRight() == null){
					BinaryTreeNode temp = binNodeParent;
					if(temp.getLeft() == deleteNode)
						temp.setLeft(deleteNode.getLeft());
					else
						temp.setRight(deleteNode.getLeft());
					deleteNode = null;
				}else{
					BinaryTreeNode maxNode = findMax(deleteNode.getLeft());
					deleteNode.setData(maxNode.getData());
					key = maxNode.getData();
					binNodeParent = deleteNode;
					deleteNode = deleteNode.getLeft(); 
				}
			}
		}
	}

	/*public BinaryTreeNode preOrderSuccessor(BinaryTreeNode root) {
		if(root!= null)
			n=root;
		if(n.getLeft() != null){
			s.push(n);
			n = n.getLeft(); 
		}
		else {
			while(n.getRight()==null) {
				n=s.pop();
			}
			n=n.getRight();
		}
		return n;
	}*/

	public CessorResult preSuccessor(int key) {
		CessorResult res=preSuccessor(root,key);
		if(res.getResult()!=null)
			return res;
		else
			return new CessorResult(null, false);
	}

	private  CessorResult preSuccessor(BinaryTreeNode root, int key) {
		if(root == null)
			return new CessorResult(null, false);
		if(key==root.getData() && root.getLeft()!=null) {
			CessorResult res = new CessorResult(root.getLeft(), true);
			return res;
		}

		if(key==root.getData() && root.getRight()!=null){
			CessorResult res = new CessorResult(root.getRight(), true);
			return res;
		}
		if(key==root.getData()) {
			CessorResult res = new CessorResult(null, true);
			return res;
		}
		else if(key<root.getData()) {
			CessorResult res = preSuccessor(root.getLeft(), key);
			if(res.isFound() && res.getResult()==null && root.getRight()!=null) {
				res.setResult(root.getRight());
			}
			return res;
		}
		else {
			CessorResult res = preSuccessor(root.getRight(), key);
			return res;
		}
	}
    //
	public CessorResult prePredecessor(int key) {
		return prePredecessor(root,key);
	}

	private  CessorResult prePredecessor(BinaryTreeNode root, int key) {
		if(root==null)
			return new CessorResult(null, false);
		if(key==root.getData())
			return new CessorResult(null, true);
		else if(key<root.getData()){
			CessorResult res=prePredecessor(root.getLeft(), key);
			if(res.isFound() && res.getResult()==null){
				res.setResult(root);
			}

			return res;
		}
		else {
			CessorResult res=prePredecessor(root.getRight(), key);
			if(res.isFound() && res.getResult()==null && root.getLeft()!=null) {
				res.setResult(findMax(root.getLeft()));
			}
			if(root.getLeft()==null)
				res.setResult(root);

			return res;
		}

	}
    //
	public void pruneTree(int k1,int k2) {
		root=pruneTree(root,k1,k2);
	}

	private BinaryTreeNode pruneTree(BinaryTreeNode root, int k1, int k2) {

		if(root==null)
			return null;
		else{
			root.setLeft(pruneTree(root.getLeft(), k1, k2));
			root.setRight(pruneTree(root.getRight(), k1, k2));

			if(k1<=root.getData() && k2>=root.getData())
				return root;
			if(root.getData()<k1)
				return root.getRight();
			if(root.getData()>k2)
				return root.getLeft();

		}
		return root;
	}	
}
