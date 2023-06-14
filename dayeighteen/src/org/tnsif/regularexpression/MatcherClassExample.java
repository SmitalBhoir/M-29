//program to demonstrate on matcher class
package org.tnsif.regularexpression;

import java.util.regex.Pattern;

public class MatcherClassExample {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("job");
		Pattern p1=Pattern.compile("programming");
		Matcher m=p.matcher("Java programming is  enough"
				+ "to get a job");
		while(m.find())
		{
			System.out.printf("pattern found from:" ,+m.start()+m.end()-1);
		}

	}

}
