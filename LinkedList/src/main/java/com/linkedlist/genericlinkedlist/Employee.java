package com.linkedlist.genericlinkedlist;
public class Employee {
	private int Id;
	private String name;
	public Employee(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee){
			Employee emp = (Employee)obj;
			return (Id == emp.getId());
		}
		return false;
	}
	@Override
	public String toString() {
		return "Id : "+Id + "  Name : "+name;
	}

}
