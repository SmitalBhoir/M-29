package org.tnsif.multilevel;

public class MultilevelInheritanceExecutor {
	
	public static void main (String[] args) {
		City c =new City();
		c.setCityname("Pune");
		c.setArea("Viman Nagar");
		c.setStatename("Maharastra");
		c.setLanguage("Marathi");
		c.setCityname("India");
		c.setStatename("Delhi");
		
		System.out.println(c);
		
	
	}

}
