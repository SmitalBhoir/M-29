//customer entity
package org.tnsif.arrays;
public class Customer {
	
	//private data members
	private int id;
	private String name;
	//constructor
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
