package pack;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDAO {
public int store(Employee e){
	int status=0;
	SessionFactory sf=HibernatUtility.getSessionFatory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	s.save(e);
	tx.commit();
	status=1;
	s.close();
	sf.close();
	return status;
}
public List retrieveAll() {
	List list = null;
	SessionFactory sf = HibernatUtility.getSessionFatory();
	Session s = sf.openSession();
	Criteria crt = s.createCriteria(Employee.class);
	list = crt.list();
	return list;
}

}
