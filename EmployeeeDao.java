package com.pack.dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.pack.intro.Employeee;

public class EmployeeeDao{
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	/*
	 public List<Employeee> getvalues(){
	
	try
	{
	
	   Session session= factory.openSession();
	   Transaction tx=session.beginTransaction();
	   Criteria ct=session.createCriteria(Employeee.class);
	   ArrayList<Employeee> employees=(ArrayList<Employeee>) ct.add(Restrictions.gt("age", 50)).list();
	   tx.commit();
	   return employees;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	factory.close();
	}
	      return null;
	 }*/
	 
	
	 
	 /*public List<Employeee> getbycity()
	 {
	 try
	 {
	
	    Session session= factory.openSession();
	    Transaction tx=session.beginTransaction();
	    Criteria ct=session.createCriteria(Employeee.class);
	    ArrayList<Employeee>   employees=(ArrayList<Employeee>) ct.add(Restrictions.like("city", "b%")).list();
	        tx.commit();
	         return employees;
	    }
	 catch (Exception e) {
	 e.printStackTrace();
	             }
	 finally {
	 factory.close();
	 }
	       return null;
	  }*/
	/*
	
	 
	public ArrayList<Employeee> getAllEmployee(int age,String city)
	{
	
	try
	{
	
	   Session session= factory.openSession();
	   Transaction tx=session.beginTransaction();
	   Criteria ct=session.createCriteria(Employeee.class);
	   Criterion empage=Restrictions.gt("age", 80);
	   Criterion empcity= Restrictions.like("city","b%");
	   LogicalExpression andExp = Restrictions.and(empage,empcity);
	   ArrayList<Employeee> employees=(ArrayList<Employeee>) ct.add(andExp).list();
	   tx.commit();
	   return employees;
	   
	}
	catch (Exception e) {
	e.printStackTrace();
	            }
	finally {
	factory.close();
	}

	return null;

	
	}*/
	
	/*public ArrayList<Employeee> getAllEmployee1(int age,String dept)	{
	try
	{
	   Session session= factory.openSession();
	   Transaction tx=session.beginTransaction();
	   Criteria ct=session.createCriteria(Employeee.class);
	   Criterion empage=Restrictions.gt("age", 80);
	   Criterion empdept= Restrictions.like("dept","sales%");
	   LogicalExpression orExp = Restrictions.or(empage,empdept);
	   ArrayList<Employeee> employees=(ArrayList<Employeee>) ct.add(orExp).list();
	   tx.commit();
	   return employees;
	   
	}
	catch (Exception e) {
	e.printStackTrace();
	            }
	finally {
	factory.close();
	}

	return null;
	}*/
	
	public ArrayList<Employeee> SalesHr()
	{

	try
	{
	
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();
	   Criteria ct=session.createCriteria(Employeee.class);
	   Criterion ed1=Restrictions.ilike("dept","s%");
	   Criterion ed2= Restrictions.ilike("dept","h%");
	   LogicalExpression Exp = Restrictions.or(ed1,ed2);
	   ArrayList<Employeee> employee=(ArrayList<Employeee>) ct.add(Exp).list();
	     tx.commit();
	return employee;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	factory.close();
	}

	return null;

	
	}
}

	 
	 
	 