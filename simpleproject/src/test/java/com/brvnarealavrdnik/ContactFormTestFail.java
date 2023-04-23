package com.brvnarealavrdnik;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.Contact;
import pageObjects.Header;

public class ContactFormTestFail extends BasePage {

	public ContactFormTestFail() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setup() throws IOException {
		driver = getDriver();
		driver.get(getUrl());
	}

	@Test
	public void contactFormTest() throws IOException {

		Header head = new Header(driver);
		head.getContactLink().click();

		Contact contactPage = new Contact(driver);
		contactPage.getMessageField().sendKeys("message");
		contactPage.getEmailField().click();
		String errorMessage = "at least 20 characters";
		String actualMessage = contactPage.getMessageFieldError().getText();
		Assert.assertEquals(actualMessage, errorMessage);

		contactPage.getNameField().sendKeys("a");
		contactPage.getEmailField().click();
		String errorName = "your name must consist of at least 2 characters";
		String actualName = contactPage.getNameFieldError().getText();
		Assert.assertEquals(actualName, errorName);

		contactPage.getEmailField().sendKeys("email");
		contactPage.getMessageField().click();
		String errorMail = "Please enter a valid email address.";
		String actualMail = contactPage.getEmailFieldError().getText();
		Assert.assertEquals(actualMail, errorMail);

		contactPage.getSubjectField().sendKeys("sub");
		contactPage.getEmailField().click();
		String errorSubject = "your subject must consist of at least 4 characters";
		String actualSubject = contactPage.getSubjectFieldError().getText();
		Assert.assertEquals(actualSubject, errorSubject);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
