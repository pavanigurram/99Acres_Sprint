package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class article {
WebDriver driver;

public article(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//span[@data-label='OWNER OFFERINGS']") WebElement owneroffering;
@FindBy(xpath="(//span[@data-custominfo='{\"custom_object\":{\"tab\":\"For Owners\"}}'])[3]") WebElement articles;
@FindBy(xpath="//a[@data-custominfo='{\"custom_object\":{\"url\":\"/articles/real-estate-news?fcat=home-owners\",\"tab\":\"For Owners\"}}']") WebElement realestate;
@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div/div/div/span") WebElement subscription;

public void ownerOffering() {
	owneroffering.click();
}
public void articles() {
	articles.click();
}
public void realEstate() {
	realestate.click();
}
public void subScribe() {
	subscription.click();
}
}
