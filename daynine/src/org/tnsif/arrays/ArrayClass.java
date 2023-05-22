//program to demonstrate on Arrays Class
package org.tnsif.arrays;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		//array initialization
		int array[]= {12,67,54,90,87};
		//using arrays class, we print all the array elements
		System.out.println(Arrays.toString(array));
        //sorting
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
