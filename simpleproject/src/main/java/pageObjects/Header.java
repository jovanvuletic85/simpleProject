package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {

	public WebDriver driver;

	By instagramLink = By.cssSelector(".social_media_links .fa-instagram");
	By facebookLink = By.cssSelector(".fa-facebook");
	By srLanguageLink = By.xpath("//a[@href='../index.html']/i[.='  Sr']");
	By enLanguageLink = By.xpath("//a[@href='index.html']/i[.='En']");
	By emailLink = By.cssSelector(".fa-envelope");
	By phoneNumberLink = By.cssSelector(".fa-phone");
	By logoLink = By.cssSelector(".aligncenter img");
	By aboutUsLink = By.cssSelector("ul#navigation  .active");
	By reservationsLink = By.cssSelector("ul#navigation > li:nth-of-type(2) > a");
	By additionsLink = By.cssSelector("ul#navigation > li:nth-of-type(3) > a");
	By vrdnikLink = By.cssSelector("ul#navigation > li:nth-of-type(4) > a");
	By geographyLink = By.cssSelector("#navigation [href='\\.\\/vrdnik\\.html\\#Vrdnik-geography']");
	By climateLink = By.cssSelector("#navigation [href='\\.\\/vrdnik\\.html\\#Vrdnik-climate']");
	By tourismLink = By.cssSelector("#navigation [href='\\.\\/vrdnik\\.html\\#Vrdnik-tourism']");
	By culturalLink = By.cssSelector("#navigation [href='\\.\\/vrdnik\\.html\\#Vrdnik-culture']");
	By manifestationsLink = By.cssSelector("#navigation [href='\\.\\/vrdnik\\.html\\#Vrdnik-manifestations']");
	By contactLink = By.cssSelector("ul#navigation > li:nth-of-type(5) > a");
	By bookAccommodationBtn = By.cssSelector("div:nth-of-type(4) .boxed-btn3");
	By headerTitle = By.cssSelector(".bradcam_text h3");

	public Header(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getInstagramLink() {
		return driver.findElement(instagramLink);
	}

	public WebElement getFacebookLink() {
		return driver.findElement(facebookLink);
	}

	public WebElement getSrLanguageLink() {
		return driver.findElement(srLanguageLink);
	}

	public WebElement getEnLanguageLink() {
		return driver.findElement(enLanguageLink);
	}

	public WebElement getEmailLink() {
		return driver.findElement(emailLink);
	}

	public WebElement getPhoneNumberLink() {
		return driver.findElement(phoneNumberLink);
	}

	public WebElement getLogoLink() {
		return driver.findElement(logoLink);
	}

	public WebElement getAboutUsLink() {
		return driver.findElement(aboutUsLink);
	}

	public WebElement getReservationsLink() {
		return driver.findElement(reservationsLink);
	}

	public WebElement getAdditionsLink() {
		return driver.findElement(additionsLink);
	}

	public WebElement getVrdnikLink() {
		return driver.findElement(vrdnikLink);
	}

	public WebElement getGeographyLink() {
		return driver.findElement(geographyLink);
	}

	public WebElement getClimateLink() {
		return driver.findElement(climateLink);
	}

	public WebElement getTourismLink() {
		return driver.findElement(tourismLink);
	}

	public WebElement getCulturalLink() {
		return driver.findElement(culturalLink);
	}

	public WebElement getManifestationsLink() {
		return driver.findElement(manifestationsLink);
	}

	public WebElement getContactLink() {
		return driver.findElement(contactLink);
	}

	public WebElement getBookAccommodationBtn() {
		return driver.findElement(bookAccommodationBtn);
	}

	public WebElement getHeadertitle() {
		return driver.findElement(headerTitle);
	}

}
