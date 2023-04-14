//program to demonstrate on hierachical inheritance
//parent class

package org.tnsif.hierachicalinheritance;

public class Tiramisu extends Anroid {
	
	private int versionname;
	private String modelname ;
	public int getVersionname() {
		return versionname;
	}
	public void setVersionname(int versionname) {
		this.versionname = versionname;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public Tiramisu() {
		super();
		System.out.println(" child2 default constructor");
	}
	
	public Tiramisu(int versionname, String modelname) {
		super();
		this.versionname = versionname;
		this.modelname = modelname;
	}
	@Override
	public String toString() {
		return "Trramisu [versionname=" + versionname + ", modelname=" + modelname + ", getBrand()=" + getBrand()
				+ ", getOwnername()=" + getOwnername() + "]";
	}
	private String getBrand() {
		// TODO Auto-generated method stub
		return null;
	}
	private String getOwnername() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}