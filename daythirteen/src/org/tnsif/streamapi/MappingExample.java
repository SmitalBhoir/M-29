//program to demonstrate on map operation

package org.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;

public class MappingExample {

	public static void main(String[] args) {
		// using collections
		List<String> obj=Arrays.asList("Smital","Kirti","Vaishnavi","Novina");
		obj.stream().map(i->i.length()).forEach((i)->System.out.print(i+" "));

	}

}