package com.pack.service;



import java.util.ArrayList;

import com.pack.dao.EmployeeeDao;
import com.pack.intro.Employeee;


public class EmployeeeService {

	public static void main(String[] args) {
		
		EmployeeeDao dao=new EmployeeeDao();
		
		Employeee employee=new Employeee();
		
		  /*ArrayList<Employeee> empvalues=(ArrayList<Employeee>) dao.getvalues();
		  for(Employeee emp:empvalues)
		    {
		    System.out.println(emp);
		    }
		    */
		 
		/*ArrayList<Employeee> empcityvalues=(ArrayList<Employeee>) dao.getbycity();
		   for(Employeee emp1:empcityvalues)
		    {
		    System.out.println(emp1);
		    }*/
		
		  /* ArrayList<Employeee> empagecity=(ArrayList<Employeee>) dao.getAllEmployee(40, "b%");
		   for(Employeee emp1:empagecity)
		    {
		    System.out.println(emp1);
		 }
		*/
		
		/*ArrayList<Employeee> empagecity=(ArrayList<Employeee>) dao.getAllEmployee1(40, "sales%");
		   for(Employeee emp1:empagecity)
		    {
		    System.out.println(emp1);
		 }*/
	
		ArrayList<Employeee> empvalues4=dao.SalesHr();
		for(Employeee emp4:empvalues4)
		    {
		System.out.println(emp4);
		    }
	}
}


