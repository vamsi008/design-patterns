package com.strategy;

import com.strategy.model.BusinessAnalyst;
import com.strategy.model.Employee;
import com.strategy.model.Programmer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee emp1= new Programmer();
        Employee emp2=new BusinessAnalyst();
        System.out.println("emp2 is ::"+emp2.getSal()+"can employee code ::"+emp2.getCode().isCoder());
        System.out.println("emp1 is ::"+emp1.getSal()+"can employee code ::"+emp1.getCode().isCoder());
    }
}
