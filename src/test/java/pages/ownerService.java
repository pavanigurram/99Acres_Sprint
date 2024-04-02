package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ownerService {
	WebDriver driver;

	public ownerService(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@data-label='OWNER OFFERINGS']") WebElement ownerofferings;
	@FindBy(xpath="//a[@data-custominfo='{\"custom_object\":{\"url\":\"/do/buyourservices?userClass=O&referrer=HP.TOP_NAV_FOR_OWNERS_OWNER_SERVICES\",\"tab\":\"For Owners\"}}']") WebElement ownerservice;
	@FindBy(css="div#Owner>div>text") WebElement ownerPlan;
	@FindBy(id="clickableTextWithoutProperty")WebElement addProperty;
	@FindBy(xpath="//text[text()='Rent/Lease']")WebElement rents;
	@FindBy(xpath="//text[text()='Residential']")WebElement residentials;
	@FindBy(xpath="//text[text()='5000 - 15000']")WebElement costs;
	
	
	public void owner_offering() {
		ownerofferings.click();
	}
	public void owner_service() {
		ownerservice.click();
	}
	public void ownerPlans() {
		ownerPlan.click();
	}
	public void addProprties() {
		addProperty.click();
	}
	public void rent() {
		rents.click();
	}
	public void residential() {
		residentials.click();
	}
	public void price() {
		costs.click();
	}
}
