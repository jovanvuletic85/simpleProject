package com.brvnarealavrdnik;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.Homepage;

public class GalleryTest extends BasePage {

	public GalleryTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setup() throws IOException {
		driver = getDriver();
		driver.get(getUrl());
	}

	@Test
	public void galleryImageTest() throws InterruptedException, IOException {

		Homepage home = new Homepage(driver);
		home.getImageOne().click();
		String imgOne = home.getCounter().getText();
		Assert.assertEquals("1 of 8", imgOne);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
