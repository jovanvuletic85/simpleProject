package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	public WebDriver driver;

	By imageOne = By.cssSelector("a[alt='brvnareAlaVrdnik5'] > .single-gallery-image");
	By imageTwo = By.cssSelector("a[alt='brvnareAlaVrdnik15'] > .single-gallery-image");
	By imageThree = By.cssSelector("a[alt='brvnareAlaVrdnik14'] > .single-gallery-image");
	By imageFour = By.cssSelector("a[alt='brvnareAlaVrdnik12'] > .single-gallery-image");
	By imageFive = By.cssSelector("a[alt='brvnareAlaVrdnik13'] > .single-gallery-image");
	By imageSix = By.cssSelector("a[alt='brvnareAlaVrdnik1'] > .single-gallery-image");
	By imageSeven = By.cssSelector("a[alt='brvnareAlaVrdnik4'] > .single-gallery-image");
	By imageEight = By.cssSelector("a[alt='brvnareAlaVrdnik8'] > .single-gallery-image");
	By arrowRightBtn = By.cssSelector(".mfp-arrow-right");
	By arrowLeftBtn = By.cssSelector(".mfp-arrow-left");
	By counter = By.cssSelector(".mfp-counter");
	By closeBtn = By.cssSelector(".mfp-close");
	By contactBtn = By.linkText("Contact Us");

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getImageOne() {
		return driver.findElement(imageOne);
	}

	public WebElement getImageTwo() {
		return driver.findElement(imageTwo);
	}

	public WebElement getImageThree() {
		return driver.findElement(imageThree);
	}

	public WebElement getImageFour() {
		return driver.findElement(imageFour);
	}

	public WebElement getImageFive() {
		return driver.findElement(imageFive);
	}

	public WebElement getImageSix() {
		return driver.findElement(imageSix);
	}

	public WebElement getImageSeven() {
		return driver.findElement(imageSeven);
	}

	public WebElement getImageEight() {
		return driver.findElement(imageEight);
	}

	public WebElement getArrowRightBtn() {
		return driver.findElement(arrowRightBtn);
	}

	public WebElement getArrowLeftBtn() {
		return driver.findElement(arrowLeftBtn);
	}

	public WebElement getCounter() {
		return driver.findElement(counter);
	}

	public WebElement getCloseBtn() {
		return driver.findElement(closeBtn);
	}

	public WebElement getContactBtn() {
		return driver.findElement(contactBtn);
	}
}
