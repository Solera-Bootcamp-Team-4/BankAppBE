package com.solera.team4.bankappbe;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BankappbeApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void enterTestUserDetails() {
		String uname = "solera@solera.com";
		String pass = "bootcamp4";
		
		AssertTrue(tryLogin(uname, pass));
	
	}
}
