package intro;

import java.util.Scanner;

public class Employee {
  int empId,yrs;
  String empName;
  double sal;
  public void setEmployeeDetails()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter employee name");
	  empName=sc.nextLine();
	  System.out.println("Enter employee id");
	  empId=sc.nextInt();
	  System.out.println("Enter years of experience");
	  yrs=sc.nextInt();
	  System.out.println("Enter employee salary");
	  sal=sc.nextDouble();
  }
  void getEmployeeDetails()
  {
     System.out.println("==========EMPLOYEE DETAILS===========");
     System.out.println("Name:" +empName);
     System.out.println("ID:" +empId);
     System.out.println("Years of Experience:" +yrs);
     System.out.println("Salary:" +sal);
  }
  void getLoanEligibility()
  {
	  if(yrs>5)
	  {
		  if(sal >= 600000 && sal<1000000 )
		  {
			  System.out.println("2,00,000/- Loan is granted");
		  }
		  if(sal>=1000000 && sal<1500000)
		  {
			  System.out.println("5,00,000/- Loan is granted");
		  }
		  if(sal>=1500000)
		  {
			  System.out.println("7,00,000/- Loan is granted");
		  }
	  }
	  else
	  {
		  System.out.println("Not Eligibile For Loan");
	  }
  }


	public static void main(String args[])
	{
		Employee e=new Employee();
		e.setEmployeeDetails();
		e.getEmployeeDetails();
		e.getLoanEligibility();
	}
}

