package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestInheritance {

	public static void main(String[] args) {
		SessionFactory sf=HibernatUtility.getSessionFatory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Person p=new Person(101,"Raj");
		Customer c=new Customer(102, "Rahul", "hdfc");
		Student st=new Student(103,"Swathi","A");
		s.save(p);
		s.save(c);
		s.save(st);
		tx.commit();
		s.close();
		sf.close();
		
		

	}

}
