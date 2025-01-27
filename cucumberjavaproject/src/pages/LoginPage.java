package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.Color;

import utils.TestBase;

public class LoginPage extends TestBase {

	By login_page_username = By.name("username");
	By login_page_password = By.name("password");
	By login_page_loginbutton = By.xpath("//button[text()='Login']");
	By login_page = By.id("conversations-app");
	By login_page_invalidloginmessage = By.xpath("//div[@id='conversations-app']//div[@class='auth-errors']");
	By login_page_forget_link = By.linkText("Forget?");

	public LoginPage() {

	}

	public void setUserName(String text) {
		driver.findElement(login_page_username).clear();
		driver.findElement(login_page_username).sendKeys(text);

	}

	public String getUserName() {

		System.out.print("usename" + driver.findElement(login_page_username).getText());
		return driver.findElement(login_page_username).getText();
	}

	public void setPassword(String text) {
		driver.findElement(login_page_password).clear();

		driver.findElement(login_page_password).sendKeys(text);

	}

	public void clickForgetLink() {
		driver.findElement(login_page_forget_link).click();

	}

	public void clickLoginButton() {
		driver.findElement(login_page_loginbutton).click();

	}

	public String invalidloginMessage() {
		String invalidLoginMessage = null;

		if (driver.findElement(login_page_invalidloginmessage) != null) {

			invalidLoginMessage = driver.findElement(login_page_invalidloginmessage).getText();
			return invalidLoginMessage;
		}
		return invalidLoginMessage;
	}

	public String invalidloginMessageTextColor() {
		String colorString = null;
		if (driver.findElement(login_page_invalidloginmessage) != null) {
			colorString = Color.fromString(driver.findElement(login_page_invalidloginmessage).getCssValue("color"))
					.asHex();
			return colorString;
		}
		return colorString;

	}

}
