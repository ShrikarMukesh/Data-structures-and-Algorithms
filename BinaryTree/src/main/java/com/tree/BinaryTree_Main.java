package com.tree;

public class BinaryTree_Main {
	public static void main(String[] args) {
		BinaryTree binTree = new BinaryTree();
		binTree.insert(4);
		binTree.insert(45);
		binTree.insert(76);
		binTree.insert(87);
		binTree.insert(92);
		binTree.insert(6);
		binTree.insert(34);
		binTree.insert(95);
		System.out.println("Level Order Traversal");
		binTree.levelOrder();
		System.out.println();
		System.out.println("Pre Order Traversal");
		binTree.preOrderTraversal();
		System.out.println();
		System.out.println("Post Order Traversal");
		binTree.postOrderTraversal();
		System.out.println();
		System.out.println("In Order Traversal");
		binTree.inOrderTraversal();
		System.out.println();
		System.out.println("***********Iterative Traversal******************");
		System.out.println("PreOrder Iterative");
		binTree.preOrderIterativeImp();
		System.out.println("InOrder Iterative");
		binTree.inOrderIterativeImp();
		System.out.println("PostOrder Iterative");
		binTree.postOrderIterative();
		
		BinaryTree binTree2 = new BinaryTree();
		binTree2.insert(4);
		binTree2.insert(45);
		binTree2.insert(76);
		binTree2.insert(87);
		binTree2.insert(105);
		binTree2.insert(6);
		binTree2.insert(34);
		binTree2.insert(92);
		
		System.out.println("Sum of All Node Elements : " +binTree2.sumAllElements());
		System.out.println("is this element present : "+binTree2.isPresent(34));
		System.out.println("Finding Max Element in the Tree : " +binTree2.maxElement());
		System.out.println("Finding Max Element in the Tree Second : " +binTree2.maxElementSecond());
		System.out.println("Finding Size of the Tree : " +binTree2.getSize());
		System.out.println("Height of the Tree : "+binTree2.getHeight());
		System.out.println("Height of the Tree Post Order: "+binTree2.heightOfBinaryTree());
		System.out.println("Diameter of the Tree : "+binTree2.diameterTree());
		System.out.println("Diameter of the Tree Second : "+binTree2.diameterTreeSec());
		System.out.println("Print Path from root-leaf : ");
		binTree2.printPaths();
		System.out.println("Print Ancestor : " +binTree2.printAllAncestors(105));
		System.out.println("Has Path Sum : "+binTree2.hasPathSum(86));	
		
	}

}
