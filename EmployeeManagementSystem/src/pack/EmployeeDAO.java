package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository

public class EmployeeDAO {
	
	@Autowired
	
	private JdbcTemplate template;
	public int insert(Employee e)
	{
		template.update(("insert into Employee values(?, ?, ?,?)"), new Object[]{e.getId(),e.getName(),e.getSalary(),e.getDesignation()});
		int status=1;
		return status;
	}
public void delete(Employee e)
{
	template.update(("delete from Employee where id=?"),new Object[]{e.getId()});
}
public List<Employee> getAllEmployees() {
	List<Employee> list = template.query("select * from Employee", 
			new EmployeeRowMapper());
	return list;
}
public void updateName(Employee e)
{
	
	template.update(("UPDATE Employee SET name=? WHERE id=?"), new Object[]{e.getName(),e.getId()});
}
public void updateSalary(Employee e)
{
	template.update(("UPDATE Employee SET salary=? WHERE id=?"), new Object[]{e.getSalary(),e.getId()});
}
public void updateDesignation(Employee e)
{
	template.update(("UPDATE Employee SET designation=? WHERE id=?"), new Object[]{e.getDesignation(),e.getId()});
}


}
