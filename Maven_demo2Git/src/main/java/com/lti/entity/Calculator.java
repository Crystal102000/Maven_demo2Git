package com.lti.entity;

public class Calculator {

		public int Add (int x, int y)
		{
			int res = x+y;
			return res;
		
		}
		
		public void searchEmpId(int empid)
		{
			if(empid==0)
			{
				throw new ArithmeticException("u enetered zero");
			}
			else
			{
				System.out.println(" do something");
			}
			
		}
}
