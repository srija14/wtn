package com.wipro.inheritance;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		Person p= new Person("Srija");
		Employee e=new Employee("neha",10000,2017,"12345");
		System.out.println(p);
		System.out.println(e);
	}
}
