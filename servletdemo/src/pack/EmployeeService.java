package pack;

import java.util.List;

public class EmployeeService {
private EmployeeDAO dao=null;
public EmployeeService()
{
	dao=new EmployeeDAO();
}
public int insert(int id,String name,double salary)
{
	Employee emp=new Employee(id,name,salary);
	int status=dao.store(emp);
	return status;
}
public List displayAll()
{
	
}
}
