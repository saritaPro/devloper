import java.io.*;
public class Employee
{
	public String name;
	private double salary;
	public Employee (String empName)
 	{name=empName;}
	public void setSalary(double empsal)
	{salary=empsal;}
	public void printEmp()
	{
	 System.out.println("Name:"+name);
	 System.out.println("salary:"+salary);
	}
	public static void main(String args[])
  {
	Employee empOne=new Employee("Sarita");
	empOne.setSalary(50000);
	empOne.printEmp();
	}
}


