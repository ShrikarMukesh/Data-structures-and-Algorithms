package com.binarysearchtree;

public class BinarySearchUtilityMain {

	public static void main(String[] args) {

		BinarySearchTree binTree = new BinarySearchTree();
		 binTree.insertRec(13);
		 binTree.insertRec(2);
		 binTree.insertRec(8);
		 binTree.insertRec(10);
		 binTree.insertRec(7);
		 binTree.insertRec(15);
		 binTree.insertRec(25);
		 binTree.insertRec(11);
		 binTree.insertRec(12);
		 
		 BinarySearchTree subTree=new BinarySearchTree();
		 subTree.insertRec(8);
		 subTree.insertRec(7);
		 subTree.insertRec(11);
		 
		 System.out.println("Is T2 subtree of T1 : " +BinarySearchUtility.subTree(binTree.getRootNode(), subTree.getRootNode()));
		 
		 BinaryTreeNode  dllhead = BinarySearchUtility.constructDLL(binTree.getRootNode());
		 System.out.println("DLL Traversal");
		 BinarySearchUtility.traverse(dllhead);
		 
		 System.out.println("Building Binary Tree using PreOrder and InOrder Travesal");
		 int[] preOrder = new int[]{7,3,1,0,2,5,4,6,11,9,8,10,13,12,14,15};
		 int[] inOrder = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		 BinaryTreeNode rootNode = BinarySearchUtility.buildBinaryTree(preOrder, inOrder, 0, 15);
		 BinarySearchUtility.preOrder(rootNode);
		 System.out.println();
		 BinarySearchUtility.inOrder(rootNode);
		 System.out.println();
		 BinarySearchUtility.resetIndexValue();
		 System.out.println("PreIndex Value after reset : " +BinarySearchUtility.getPreIndex());

	}

}
