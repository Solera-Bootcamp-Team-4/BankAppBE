package com.solera.team4.bankappbe;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static com.solera.team4.bankappbe.user.Login.tryLogin;
import static com.solera.team4.bankappbe.user.CreateNewUser.createNewUser;;

@SpringBootTest
public class BankappbeApplicationTests {

	@Test
	void testValidLogin() {
		String uname = "solera@solera.com";
		String pass = "bootcamp4";
		
		assertEquals(true, tryLogin(uname, pass));
	
	}
	
	@Test
	void testInvalidLogin() {
		String uname = "joe";
		String pass = "mama";
		
		assertEquals(false, tryLogin(uname, pass));
	}
	
	@Test
	void testCreateNewUser() {
		String uname = "test@test.com";
		String pass = "password";
		
		assertEquals(true, createNewUser(uname, pass));
	}
}
