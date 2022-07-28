package com.udemy.examples;

public class Main {
  static int i=0;
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashtable ht = new SimpleHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);
       // ht.put("Bill", billEnd);

        
        ht.printHashtable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key smith: " + ht.get("Smith"));
      
        ht.remove("Wilson");
        System.out.println();
        System.out.println("after removing");
        
        ht.printHashtable();
    }
}
