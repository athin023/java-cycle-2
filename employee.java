import java.io.*;
import java.util.Scanner;

class employee
	{
  	 int eNo;
	 String eName;
	 double salary;
	 employee(int eNo, String eName, double salary)
		{
			this.eNo=eNo;
			this.eName=eName;
			this.salary=salary;
}
}

public class Main {
 public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("enter the number of employees");	
int n=sc.nextInt();
// create an array of employee numbers
employee[] employees=new employee[n];
//read employee info
for(int i=0;i<n;i++)
{
System.out.println("enter the details of employees"+(i+1)+":");
System.out.println("enter employee number");		
int eNo=sc.nextInt();
System.out.println("enter employee name");		
String eName=sc.next();
System.out.println("enter employee salary");		
Double salary=sc.nextDouble();
employees[i]=new employee(eNo,eName,salary);
}

System.out.println("enter employee number to search");		
int searchEno=sc.nextInt();
boolean found=false;
for(employee emp:employees)
{
if(emp.eNo==searchEno)
{
System.out.println("employee found");
System.out.println("Employee Number"+emp.eNo);
System.out.println("Employee Name"+emp.eName);
System.out.println("Salary"+emp.salary);
found=true;
break;
}
}
if(!found){
System.out.println("employee not found");
}
}
}








