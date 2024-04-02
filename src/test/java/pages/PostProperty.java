package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostProperty {
	WebDriver driver;

	public PostProperty(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css="div#app>div>div:nth-of-type(2)>div:nth-of-type(2)>div:nth-of-type(2)>div>div:nth-of-type(3)>a") WebElement OwnerOption;
	@FindBy(xpath="//span[@data-label='OWNER OFFERINGS']") WebElement ownerOffering;
	@FindBy(xpath="//a[@href='https://www.99acres.com/postproperty/']") WebElement postPropertyForFee;
	@FindBy(xpath="//span[text()='Rent / Lease']") WebElement rentOrLease;
	@FindBy(xpath="//input[@label='Residential']/following-sibling::label[1]") WebElement residentials;
	@FindBy(xpath="//span[text()='Flat/Apartment']") WebElement flats;
	@FindBy(xpath="//input[@data-attr='inputText']") WebElement phoneNum;

	public void ownerOptions() {
		OwnerOption.click();
	}
	public void ownerOffer() {
		ownerOffering.click();
	}
	public void postProperty() {
		postPropertyForFee.click();
	}
	public void rents() {
		rentOrLease.click();
	}
	public void residents() {
		residentials.click();
	}
	public void falts() {
		flats.click();
	}
	public void phoneNo() {
		phoneNum.sendKeys("9390555254");
	}
}
