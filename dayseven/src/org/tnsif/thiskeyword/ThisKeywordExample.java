//program to demonstrate on this keyword
package org.tnsif.thiskeyword;

public class ThisKeywordExample {
	private int cvvno ;
	private long atmno;
	
	//parameterized  constructor 
	public ThisKeywordExample(int cvvno, long atmno) {
		super();
		//current class instance return by this keyword
		this.cvvno = cvvno;
		this.atmno = atmno;
	}
	
	public void print ()
	{
		System.out.println("CVV no is "+cvvno+" atm no "+atmno);
	}
	
}
