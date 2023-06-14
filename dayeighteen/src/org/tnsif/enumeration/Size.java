package org.tnsif.enumeration;
//enum can implements an interface
public enum Size implements Pizza {
	SMALL, MEDUIM, LARGE;

	@Override
	public void displaySize() {
		System.out.println("Size: " +this);
		
	}
	
	
	

}
