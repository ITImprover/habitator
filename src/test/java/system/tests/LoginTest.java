package system.tests;

import org.junit.*;
import system.tests.AbstractTest;

public class LoginTest extends AbstractTest {
	@Before
	public void setUp() throws Exception {
		init();
	}

	@Test
	public void shouldAuthentificateWhenCorrectCredentials() throws Exception {
		appManager.login("bender", "password");
		appManager.isLogged();
	}

	@Test
	public void shouldNotAuthentificateWhenIncorrectCredentials() throws Exception {
		appManager.login("noname", "nopassword");
		appManager.isNotLogged();
	}

}

