package utils;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;
public class HibernateUtils {
	 private static SessionFactory factory;

	    static {
	        System.out.println("in static init block");
	        try {
	            // Create the SessionFactory from hibernate.cfg.xml
	            factory = new Configuration().configure().buildSessionFactory();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }  
	    }

	    // Getter for SessionFactory
	    public static SessionFactory getFactory() {
	        return factory;
	    }
}
