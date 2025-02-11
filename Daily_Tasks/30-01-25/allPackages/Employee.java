package allPackages;
import java.util.Scanner;

public class Employee {

	int empid;
	String empName;
	double empsalary;

  public void setDetails(int empid,String empName,double empsalary)
  {
	  this.empid=empid;
	  this.empName=empName;
	  this.empsalary=empsalary;
  }
  public void getDetails() {
	  System.out.println("id of the employee"+empid);
	  System.out.println("name of the emplotee"+empName);
	  System.out.println("Salary of the emplotee"+empsalary);
	  
  }
  public void getEligibilityloan(int years)
  {
	  if(years>5) {
		  if(empsalary==600000)
		   System.out.println("2 lakhs loan is granted");
		  else if(empsalary>=1000000)
			  System.out.println("5 lakhs loan is granted");
		  else if(empsalary>=1500000)
			  System.out.println("7 lakhs loan is granted");
		  else
			  System.out.println("No loan is granted");
	  }
	  else {
		  System.out.println("no lakhs loan is granted");
	  }
  }
	  public static void main(String[] args)
	  {
		  Employee e=new Employee();
		  
		  Scanner sc= new Scanner(System.in);
		  
		  System.out.println("enter id");
		  int empid=sc.nextInt();
		  System.out.println("enter name ");
		  String s=sc.next();
		  System.out.println("enter salary ");
		 double sal=sc.nextDouble();
		 System.out.println("enter years ");
		 int years=sc.nextInt();
		 e.setDetails(empid, s, sal);
		 e.getDetails();
		 e.getEligibilityloan(years);
		 
		 
		  
	  }
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

