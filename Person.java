package io.javabrains;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName,String lastName,int age) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String newName) {
		this.lastName=newName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String newName) {
		this.firstName=newName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int newAge) {
		this.age=newAge;
	}
	
	public String toString() {
		return "Person ["+"firstname "+this.firstName+" lastname "+this.lastName+" age "+this.age+" ]";
	}
	
	
	
	
}
