package org.tnsif.interfacedemo;

import org.tnsif.interfacedemo.Outerinterface.innerinterface;

public class NestedInterfaceEx implements innerinterface  {
	
	private String str1;
	private String str2;
	
	//setter getter
	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	@Override
	public String Concanate() {
		
		return str1+str2;
	}
	
	

}