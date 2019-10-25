package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import utils.TestBase;

public class LoginPageSteps extends  TestBase{
	LoginPage loginpage = new LoginPage();
	@Given("^user opens browser and logins to the site$")
	public void user_opens_browser_and_logins_to_the_site()  {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.initDriver();
	}

	@When("^user enters username as \"(.*)\"$")

	public void user_enters_username(String arg1)  {

		
	  loginpage.setUserName(arg1);
	}

	@Then("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password(String arg2)  {
	    
		  loginpage.setPassword(arg2);

	}
	@Then("^user click on the login button$")
	public void user_click_on_the_login_button()  {
	    
		loginpage.clickLoginButton(); 
	}

	@Then("^login fails with the invalid login message$")
	public void login_fails_with_the_invalid_login_message()  {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(loginpage.invalidloginMessage(), "The username or password you entered is not correct.");

	}
	



@Then("^retrieve user name and verify the invalid login message text color is \"([^\"]*)\"$")
public void verify_the_invalid_login_message_text_color_is(String arg1)  {
    // Write code here that turns the phrase above into concrete actions
	assertAll("invalid username - " +loginpage.getUserName(), () ->
	assertEquals(loginpage.invalidloginMessage(), "The username or password you entered is not correct."),
	()  -> assertEquals(loginpage.invalidloginMessageTextColor(), "#a94442")
		);


}
	
	@Then("^close the application$")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    TestBase.tearDown();
	}

}