package pack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestCRUD {

	public static void main(String[] args) {
		System.out.println("Doing update operation at runtime");
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=HibernatUtility.getSessionFatory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		System.out.println("Enter an id:");
		int tempId=sc.nextInt();
		sc.nextLine();
		Employee e=(Employee) s.get(Employee.class,tempId);
		if(e!=null)
		{
			System.out.println("Old name:"+e.getName());
			System.out.println("Enter name:");
			String tempName=sc.nextLine();
			e.setName(tempName);
			System.out.println("New name:"+e.getName());
			s.update(e);
			tx.commit();
		
			
		}
		else{
			System.err.println("Sorry,Id"+tempId+"Not found");
		}
		s.close();
		sf.close();
		sc.close();
		
	}

}
