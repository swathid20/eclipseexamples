package com.org;

public class EmployeeService {
	private EmployeeDAO dao=null;

	public EmployeeService() {
		dao=new EmployeeDAO();
		
	}
	public int insertObject(Employee emp)
	{
		int status=dao.store(emp);
		return status;
	}

	public Employee updateSalary(int id, double salary) {
		return dao.update(id, salary);
	}

	

}
