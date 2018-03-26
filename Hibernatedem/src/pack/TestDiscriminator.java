package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestDiscriminator {

	public static void main(String[] args) {
		SessionFactory sf=HibernatUtility.getSessionFatory();
		Session s=sf.openSession();
		Criteria crt=s.createCriteria(Person.class);
		List list=crt.list();
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Person p=(Person) it.next();
			if(p instanceof Customer)
			{
				Customer c=(Customer) p;
				System.out.println("Id:"+c.getUid()+" Name:"+c.getName()+" Bank:"+c.getBankName());
				}
			else if(p instanceof Student)
			{
				Student st=(Student) p;
				System.out.println("Id:"+st.getUid()+" Name:"+st.getName()+" Grades"+st.getGrades());
			}
			else
			{
				System.out.println("Id:"+p.getUid()+" Name"+p.getName());
			}
		}
		s.close();
		sf.close();
	}

}
