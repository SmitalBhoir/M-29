package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExecuter {

	public static void main(String[] args) throws LoginCredential {
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		String password = sc.nextLine();
		try {
		if (id.equals("smitalbhoir777@gmail.com") && password.equals("Bhoir@123")) {
			System.out.println("Login credentials are match");
		}
		else {
			throw new LoginCredential("Invalid credentials");
		}
	}
	catch(LoginCredential e){
		System.out.println("Exception handled "+e);
	}

}
}
