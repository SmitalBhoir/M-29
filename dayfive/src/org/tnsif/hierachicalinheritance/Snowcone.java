// program on demo on hierachical inheritance 
//child class 1

package org.tnsif.hierachicalinheritance;

public class Snowcone extends Anroid  {
	
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
	public Snowcone() {
		System.out.println(" child 1 default constructor");
		
	}
	
	public Snowcone(int versionname, String modelname) {
		super();
		this.versionname = versionname;
		this.modelname = modelname;
	}
	@Override
	public String toString() {
		return "SnowCone [versionname=" + versionname + ", modelname=" + modelname + ", getBrand()=" + getBrand()
				+ ", getOwnername()=" + getOwnername() + "]";
	}
	private String getOwnername() {
		// TODO Auto-generated method stub
		return null;
	}
	private String getBrand() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}