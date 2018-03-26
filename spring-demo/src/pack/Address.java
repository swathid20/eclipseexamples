package pack;

import org.springframework.stereotype.Component;

@Component
public class Address {
	String name;
	public Address(String name)
	{
		System.out.println("Address(parameters) is created");
	}
	
	public Address() {
		super();
		System.out.println("Address() is created");
		// TODO Auto-generated constructor stub
	}

	public void display()
	{
		System.out.println("display() of Address is called");
	}

}
