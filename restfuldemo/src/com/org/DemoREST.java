package com.org;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class DemoREST {
	private static EmployeeService service = new EmployeeService();
	

	@Path("/simple")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String test()
	{
		System.out.println("test()is called");
		return "<greetings>Hello Restful</greetings>";
	}
	@GET
	@Path("/getCustomer")
	@Produces(MediaType.APPLICATION_XML) 
	public Customer sendCustomer()
	{
		System.out.println("sendcustomer() is called");
		Customer c=new Customer(111,"Rahul",34);
		return c;
	}
	@Path("/storeCustomer")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.TEXT_PLAIN)
	public String recieveCustomer(Customer c) 
	{
		//call to Service or DAO classes
		System.out.println("Id = "+c.getCustomerId());
		System.out.println("Name = "+c.getCustomerName());
		System.out.println("Age = "+c.getAge());
		return "Stored Successfully";
	}
@Path("/storeEmp")
@POST
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.TEXT_PLAIN)
public String storeEmployee(Employee emp)
{
	int count=service.insertObject(emp);
	return count+" Record added";
}
@Path("/update/{i}/{s}")
@PUT
@Produces(MediaType.APPLICATION_XML)
public Employee updateEmployeeSalary(@PathParam("i")int id, 
		@PathParam("s") double salary) {
	Employee e = service.updateSalary(id, salary);
	return e;
}


}
