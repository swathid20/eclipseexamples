package pack;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernatUtility {
	public static SessionFactory getSessionFatory(){
		SessionFactory sf=null;
		Configuration cf=new Configuration();
		cf.configure();
		sf=cf.buildSessionFactory();
		return sf;
	}

}
