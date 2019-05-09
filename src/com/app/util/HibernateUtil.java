package com.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf=null;
	static {
		Configuration cfg=new Configuration();
		cfg.configure();
		sf=cfg.buildSessionFactory();
		
	}
	public static SessionFactory getsf() {
		
		return sf;
	}
	

}
