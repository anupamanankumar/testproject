package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.PasswordResetPage;
import utils.TestBase;

public class LoginPageSteps extends  TestBase{
	LoginPage loginpage = new LoginPage();
	
	@Given("^user opens browser and logins to the site$")
	public void user_opens_browser_and_logins_to_the_site()  {
	   	TestBase.initDriver();
	}

	@Given("^user clicks on Forget link$")
	public PasswordResetPage user_clicks_on_Forget_link() { 
	    // Write code here that turns the phrase above into concrete actions
		loginpage.clickForgetLink();
		return new PasswordResetPage();
		
	}

	
	@When("^user enters username as \"(.*)\"$")

	public void user_enters_username(String arg1)  {

		
	  loginpage.setUserName(arg1);
	}

	@And("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password(String arg2)  {
	    
		  loginpage.setPassword(arg2);

	}
	@And("^user click on the login button$")
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
	
	@And("^close the application$")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    TestBase.tearDown();
	}

}
