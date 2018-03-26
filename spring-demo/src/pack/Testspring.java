package pack;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Testspring {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		/*Identifier id=(Identifier)ctx.getBean("b1");
		id.display();
		Identifier id1=(Identifier)ctx.getBean("b2");
		id1.display();
*/
		Customer c=(Customer) ctx.getBean("c1");
		c.getInformations();
		/*Bank bank1=(Bank)ctx.getBean("bank");
		System.out.println(bank1.getLocations());*/
	}

}
