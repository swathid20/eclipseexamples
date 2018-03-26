package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	
@Autowired
private EmployeeDAO dao;
int status;

public int insert(Employee e)
{
	status=dao.insert(e);
	return status;
}
public void delete(Employee e)
{
	dao.delete(e);
}
public List<Employee> getEmployee()
{
		return dao.getAllEmployees();
}
public void updatename(Employee e)
{
	dao.updateName(e);
}
public void updatesalary(Employee e)
{
	dao.updateSalary(e);
}
public void updatedesignation(Employee e)
{
	dao.updateDesignation(e);
}
}
