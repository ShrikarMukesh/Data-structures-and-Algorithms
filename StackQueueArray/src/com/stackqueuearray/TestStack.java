package com.stackqueuearray;

public class TestStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayStack arrStack = new ArrayStack(10);
		try {
				arrStack.push(5);
				arrStack.push(8);
				arrStack.push(9);
				arrStack.push(20);
				arrStack.push(45);
				arrStack.push(68);
				System.out.println("Traversing...");
				arrStack.traverse();
				arrStack.push(70);
				arrStack.push(8);
				arrStack.push(9);
				arrStack.push(20);
				arrStack.push(45);
				arrStack.push(68);
				arrStack.traverse();
			}
		catch(Exception e){
			System.out.println(e.getMessage());
			arrStack.traverse();
			arrStack.pop();
			arrStack.pop();
			arrStack.traverse();
			try {
				while(!arrStack.isStackEmpty())
					arrStack.pop();
				arrStack.pop();
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		System.out.println("Program terminating normally.....");
	}

}
