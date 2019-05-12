package com.tst;
public class TSTTest {
	public static void main(String[] args) {
		 TernarySearchTree tst = new TernarySearchTree();
		 tst.insert("apple");
		 tst.insert("pineapple");
		 tst.insert("mango");
		 tst.insert("pin");
		 tst.insert("pine");
		 System.out.println(tst.toString());
		 tst.insert("pi");
		 System.out.println(tst.toString());
		 System.out.println(tst.search("mango"));
		 System.out.println(tst.search("man"));
		 tst.delete("pineapple");
		 System.out.println(tst.toString());
	}

}
