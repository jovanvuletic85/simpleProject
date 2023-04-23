package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact {

	public WebDriver driver;

	By messageField = By.cssSelector("textarea#message");
	By messageFieldError = By.cssSelector("label");
	By nameField = By.cssSelector("input#name");
	By nameFieldError = By.cssSelector("#contactForm [class='col-sm-6']:nth-of-type(2) label");
	By emailField = By.cssSelector("input#email");
	By emailFieldError = By.cssSelector("#contactForm [class='col-sm-6']:nth-of-type(3) label");
	By subjectField = By.cssSelector("input#subject");
	By subjectFieldError = By.cssSelector("#contactForm [class='col-12']:nth-of-type(4) label");
	By sendBtn = By.cssSelector(".button-contactForm");

	public Contact(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getMessageField() {
		return driver.findElement(messageField);
	}

	public WebElement getMessageFieldError() {
		return driver.findElement(messageFieldError);
	}

	public WebElement getNameField() {
		return driver.findElement(nameField);
	}

	public WebElement getNameFieldError() {
		return driver.findElement(nameFieldError);
	}

	public WebElement getEmailField() {
		return driver.findElement(emailField);
	}

	public WebElement getEmailFieldError() {
		return driver.findElement(emailFieldError);
	}

	public WebElement getSubjectField() {
		return driver.findElement(subjectField);
	}

	public WebElement getSubjectFieldError() {
		return driver.findElement(subjectFieldError);
	}

	public WebElement getSendBtn() {
		return driver.findElement(sendBtn);
	}
}
