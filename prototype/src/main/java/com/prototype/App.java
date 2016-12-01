package com.prototype;

import com.prototype.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		EmployeeCache cache=new EmployeeCache();
    		cache.setEmployee();
    		Employee emp1=cache.getEmployee(1);
    		Employee emp2=cache.getEmployee(2);
    		System.out.println(emp1.getSal());
    		System.out.println(emp2.getSal());
    }
}
