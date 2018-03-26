package pack;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service=(EmployeeService) context.getBean("service");
		Employee emp=(Employee)context.getBean("employeeobject");
		Scanner sc=new Scanner(System.in);
		int i;
		int res;	
		String a;
		do
			{
			System.out.println("******** Employee Management System ********");
			System.out.println("1)Add   2)Delete by Id  3) Display All  4) Update by id  5) Exit");
			i=sc.nextInt();
			switch (i) 
			{
			case 1:
			{
				System.out.println("**** Performing Insert ****");
				System.out.println("Enter Id");
				emp.setId(sc.nextInt());
				System.out.println("Enter Name");
				emp.setName(sc.next());
				System.out.println("Enter Salary");
				emp.setSalary(sc.nextDouble());
				System.out.println("Enter Designation");
				emp.setDesignation(sc.next());
				res=service.insert(emp);
				if(res==1)
				System.out.println("**** Employee information stored successfully ****");
				break;
			}
			case 2:
		{
		System.out.println(" *** Performing Delete ***");
				System.out.println("Enter Id");
				emp.setId(sc.nextInt());
				service.delete(emp);
				break;
				
			}
			case 3:
			{
				System.out.println("**** Displaying All Employees ****** ");
				List<Employee> employeeList = service.getEmployee();
				for(Employee e : employeeList) 
				{
					System.out.println("Id="+e.getId()+ ",Name="+e.getName()+",Salary="+e.getSalary()+",Designation= "+e.getDesignation());
				}
				break;
			}
			case 4:
		{
				System.out.println("Enter Id");
				emp.setId(sc.nextInt());
				do
				{
				System.out.println("***** A sub menu to update the following ****");
				System.out.println("(a)Name	(b)Salary 	(c)Designation	(d)Exit");
				a=sc.next();
				switch (a) {
				case "a":
				{
					System.out.println("Enter new name");
					emp.setName(sc.next());
					service.updatename(emp);
			    	break;
				}
				case "b":
				{
					System.out.println("Enter new salary");
					emp.setSalary(sc.nextDouble());
					service.updatesalary(emp);
					break;
				}
				case "c":
				{
					System.out.println("Enter new designation");
					emp.setDesignation(sc.next());
					service.updatesalary(emp);
					break;
				}

				default:
					break;
				}
				}while(a=="d");
			
			}
			default:
				break;
			}
			
			}while( i<5);
		
System.out.println("***Main menu exits***");
System.out.println("****Thank you for visiting*****");
	}

}
