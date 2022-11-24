package com.solera.team4.bancappbe;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BancappbeApplicationTests {

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
