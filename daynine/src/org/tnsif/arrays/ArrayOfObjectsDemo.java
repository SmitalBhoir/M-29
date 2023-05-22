//program to demonstrate on Array object class
package org.tnsif.arrays;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		//array of customer class
		Customer[] arr= new Customer[2];
		
		arr[0]= new Customer(23456,"Smital");
        arr[1]= new Customer(5678,"Sam");
        
        for(int i=0; i<arr.length;i++) 
        {
        	System.out.println(arr[i].getId()+ ""+arr[i].getName());
        }
        
	}

}
