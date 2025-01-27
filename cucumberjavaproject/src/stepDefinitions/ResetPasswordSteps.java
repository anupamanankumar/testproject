package stepDefinitions;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.PasswordResetPage;
import utils.TestBase;

public class ResetPasswordSteps extends TestBase {
	PasswordResetPage passwordresetpage = new PasswordResetPage();

	@Then("^user gets to Password Reset Page$")
	public void user_gets_to_Password_Reset_Page() {
		// Validate user is in the password reset page
		assertEquals("Reset Your Password", passwordresetpage.verifyResetPageDisplaysWithHeader());

	}

	@And("^user click on the Reset Password Button$")
	public void user_click_on_the_Reset_Password_Button() {
		// Write code here that turns the phrase above into concrete actions
		passwordresetpage.clickresetpasswordbutton();
	}

	@Then("^reset fails with the invalid username message$")
	public void reset_fails_with_the_invalid_username_message() {
		assertEquals(passwordresetpage.invaliduserMessage(), "We can't find a user with that username.");

	}

	@When("^user enters username as \"([^\"]*)\" in Password Reset Page$")
	public void user_enters_username_as_in_Password_Reset_Page(String arg1) {
		// Write code here that turns the phrase above into concrete actions
		passwordresetpage.setUserName(arg1);
	}

	@And("^verify the username message text color is \"([^\"]*)\"$")
	public void verify_the_username_message_text_color_is(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Write code here that turns the phrase above into concrete actions
		assertEquals(passwordresetpage.invalidUsernMessageTextColor(), "#a94442");

	}

}
