package com.multi;

public class C extends B 
{
public void projname() 
	{
		System.out.println("project  name is F1 car");

	}
public void projbud() 
	{
		System.out.println("Budget is 3,00,00,000");
	}
public static void main(String[] args) 
	{
		System.out.println("**Overall Details**");
		C proj=new C();
		proj.empname();
		proj.empid();
		proj.comname();
		proj.comloc();
		proj.projname();
		proj.projbud();
}
}

