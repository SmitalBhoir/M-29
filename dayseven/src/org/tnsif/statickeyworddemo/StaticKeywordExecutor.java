//driver class
package org.tnsif.statickeyworddemo;

public class StaticKeywordExecutor {

	public static void main(String[] args) {
		/*without creating the object, we will
		 get the value for static variable  */
		
        System.out.println(Employee.companyName);
        Employee e= new Employee(101,"Smital B");
        System.out.println(e);
        
        System.out.println(Employee.companyName);
        Employee e1= new Employee(102,"Sam B");
        System.out.println(e1);
        
        
	}
	
	

}
