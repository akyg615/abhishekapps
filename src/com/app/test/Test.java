package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Employee;
import com.app.util.HibernateUtil;

public class Test {
public static void main(String[] args) throws Exception {
	Transaction tx=null;
	try(Session ses=HibernateUtil.getsf().openSession())
	{
		tx=ses.beginTransaction();
		Employee e=new Employee();
		e.setEmpId(8);
		e.setEmpName("rahul");
		e.setEmpSal(53.2);
		ses.save(e);
		tx.commit();
	}
	catch(Exception e)
	{
		System.out.println(e);
		tx.rollback();
	}
	System.out.println("done");
}
}
