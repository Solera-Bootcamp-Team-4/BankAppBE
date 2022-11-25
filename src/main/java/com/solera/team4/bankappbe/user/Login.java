package com.solera.team4.bankappbe.user;

public class Login {
	
	public static boolean tryLogin(String uname, String pass) {
		if(uname == "solera@solera.com" && pass == "bootcamp4") {
			return true;
		}
		else System.out.println("Invalid Login");
		return false;
		
	}
}
