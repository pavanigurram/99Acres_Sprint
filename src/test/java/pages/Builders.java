package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Builders {
	WebDriver driver;

	public Builders(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css="div#app>div>div:nth-of-type(2)>div:nth-of-type(2)>div:nth-of-type(2)>div>div:nth-of-type(3)>a") WebElement OwnerOption;
	@FindBy(xpath="(//span[@data-label='INSIGHTS'])[3]") WebElement insights;
	@FindBy(xpath="//div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[2]/ul[1]/li[1]/div[1]/ul[1]/li[7]/a[1]") WebElement  builders;
	
	
	public void Owneroptions() {
		OwnerOption.click();
	}
	public void insights() {
		insights.click();
	}
	public void BuildersInIndia() {
		builders.click();
	}
}
