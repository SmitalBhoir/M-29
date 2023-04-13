//program to demonstrate on package and access specifier
package org.tnisf.firstpackage;

public class Base {
	/*
	 * declaring all the access specifier with variable and method
	 */
	
	int vardefault =10;
	public String name ="john";
	private int pinno = 2332;
	protected float salary = 3429f;
	
	//access specifier with method
	
	void methoddefault()
	{
		System.out.println("Default access method " +vardefault);
	}

	 public void methodpublic()
	{
		System.out.println("public access method " +name);
	}
	 
	 protected void methodprotected()
		{
			System.out.println("protected access method " +salary);
		}

	
	}