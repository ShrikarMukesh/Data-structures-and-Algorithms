package com.linkedlist.genericlinkedlist;
import java.util.Iterator;
public class GenericLinkedListMain {
	public static void main(String[] args) {
	
		GenericLinkedList<String> strList = new GenericLinkedList<>();
		strList.append("Shrikar");
		strList.append("Dinesh");
		strList.append("Mukesh");
		strList.append("Anup");
		strList.append("Shiva");
		
		Iterator<String> listIter = strList.iterator();
		while(listIter.hasNext()) {
			System.out.println("Elements in the List :" +listIter.next());
		}
		strList.delete("Dinesh");
		System.out.println("After Deletion : ");
		Iterator<String> listDeIter = strList.iterator();
		while(listDeIter.hasNext()) {
			System.out.println("Elements in the List :" +listDeIter.next());
		}
		GenericLinkedList<Employee> empList = new GenericLinkedList<>();
		Employee emp1 = new Employee(1, "Viru");
		empList.append(emp1);
		Employee emp2 = new Employee(2, "Viji");
		empList.append(emp2);
		Employee emp3 = new Employee(3, "Viki");
		empList.append(emp3);
		
		empList.delete(emp3);
		
		Iterator<Employee> empIter = empList.iterator();
		while(empIter.hasNext()) {
			System.out.println("Elements in the List :" +empIter.next().toString());
		}	
	}

}
