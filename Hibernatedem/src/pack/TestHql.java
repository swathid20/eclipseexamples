package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestHql {

	public static void main(String[] args) {
		SessionFactory sf=HibernatUtility.getSessionFatory();
		Session s=sf.openSession();
		/*String hibernatequery="Select obj from pack.Employee obj";
		Query query=s.createQuery(hibernatequery);
		@SuppressWarnings("rawtypes")
		List list=query.list();
		@SuppressWarnings("rawtypes")
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Employee e=(Employee) it.next();
			System.out.println("Id:"+e.getId()+" Name:"+e.getName()+" Salary:" +e.getSalary());
		}
		System.out.println("To retreive only salary");*/
		String hibernatequery="Select distinct e.name,e.salary from pack.Employee e";
		Query query=s.createQuery(hibernatequery);
		@SuppressWarnings("rawtypes")
		List list=query.list();
		@SuppressWarnings("rawtypes")   
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Object[] obj=(Object[]) it.next();
			String name=(String) obj[0];
			   double salary= (Double) obj[1];
			System.out.println("Name:"+name+" Salary"+salary);
			
			
		}
		s.close();
		sf.close();

	}

}
