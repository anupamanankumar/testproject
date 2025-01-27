package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.Color;

import utils.TestBase;

public class PasswordResetPage extends TestBase {

	By passwordreset_page_username = By.name("username");
	By passwordreset_page_header = By.tagName("h1");
	By passwordreset_page_resetbutton = By.xpath("//button[text()='Reset Password']");
	By passwordreset_page_invalidusernamenamemessage = By
			.xpath("//div[@id='conversations-app']//div[@class='auth-errors']");

	public PasswordResetPage() {

	}

	public void setUserName(String text) {
		driver.findElement(passwordreset_page_username).clear();
		driver.findElement(passwordreset_page_username).sendKeys(text);

	}

	public String getUserName() {

		System.out.print("usename" + driver.findElement(passwordreset_page_username).getText());
		return driver.findElement(passwordreset_page_username).getText();
	}

	public void clickresetpasswordbutton() {
		driver.findElement(passwordreset_page_resetbutton).click();

	}

	public String invaliduserMessage() {
		String invalidusermsg = null;

		if (driver.findElement(passwordreset_page_invalidusernamenamemessage) != null) {

			invalidusermsg = driver.findElement(passwordreset_page_invalidusernamenamemessage).getText();
			return invalidusermsg;
		}
		return invalidusermsg;
	}

	public String invalidUsernMessageTextColor() {
		String colorString = null;
		if (driver.findElement(passwordreset_page_invalidusernamenamemessage) != null) {
			colorString = Color
					.fromString(driver.findElement(passwordreset_page_invalidusernamenamemessage).getCssValue("color"))
					.asHex();
			return colorString;
		}
		return colorString;

	}

	public String verifyResetPageDisplaysWithHeader() {
		String passwordreset_page_header_text = null;
		passwordreset_page_header_text = driver.findElement(passwordreset_page_header).getText();
		return passwordreset_page_header_text;
	}

}
