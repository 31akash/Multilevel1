package com.multi;

public class B extends A 
{
	public void empname() 
	{
		System.out.println("employee name is abc");
	}
	public void empid() 
	{
		System.out.println("employee id is 317");
	} 
	public static void main(String[] args) 
	{
		B emp=new B();
		emp.empname();
		emp.empid();
		emp.comname();
		emp.comloc();

}
}
