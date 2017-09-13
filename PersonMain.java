package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaFunctionalProject{
	
	public static void main(String args[]) {
	List<Person> people=Arrays.asList(new Person("Charles","Dickens",60),
			new Person("Lewis","Caroll",45),
			new Person("Thomas","Carlayle",25),
			new Person("Henry","Busted",52),
			new Person("Tom","Rasheed",61));
	
	
	//Sort people by last name
	Collections.sort(people,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
	
	
	//Create method that prints all the elements of a list
	printConditionally(people,p->true);
	
	
	//Create a method that prints all the people in the list whose last name starts with C
	printConditionally(people,p->p.getFirstName().startsWith("C"));

	
	
	}
	
	
	public static void printConditionally(List<Person> people,Condition condition){
		for(Person p:people) {
			if(condition.test(p)) {
				System.out.print(p);
			}
		}
	}
	
	
	
	
	
	
	
}