package com.prototype;

import java.util.HashMap;
import java.util.Map;

import com.prototype.model.BusinessAnalyst;
import com.prototype.model.Employee;
import com.prototype.model.Programmer;

public class EmployeeCache {
	
	private Map<Integer,Employee> cachedInfo=new HashMap<Integer,Employee>();
	public Employee getEmployee(int id){
		
		Employee temp=cachedInfo.get(id);
		return (Employee)temp.clone();
	}
	
	public void setEmployee(){
		
		Employee emp1=new BusinessAnalyst();
		emp1.setId(1);
		cachedInfo.put(emp1.getId(),emp1);
		
		Employee emp2=new Programmer();
		emp1.setId(2);
		cachedInfo.put(emp1.getId(),emp1);
			
	}

}
