package com.org;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDAO {
	public int store(Employee emp) {
		int status = 0;
		SessionFactory sf=HibernatUtility.getSessionFatory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(emp);
		tx.commit();
		status = 1;
		s.close();
		sf.close();
		return status;
	}

	public Employee update(int id, double salary) {
		Employee e = null;
		SessionFactory sf = HibernatUtility.getSessionFatory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		e = (Employee) s.get(Employee.class, id);
		if(e != null) {
			e.setSalary(salary);
			s.update(e);
			tx.commit();
		}
		s.close();
		sf.close();
		return e;
	}
	

}
