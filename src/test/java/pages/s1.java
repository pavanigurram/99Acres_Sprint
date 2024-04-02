package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class s1 {
WebDriver driver;

public s1(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(css="div#app>div>div:nth-of-type(2)>div:nth-of-type(2)>div:nth-of-type(2)>div>div:nth-of-type(3)>a") WebElement OwnerOption;
@FindBy(xpath="(//span[@data-label='INSIGHTS'])[3]") WebElement insights;
@FindBy(xpath="//div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[2]/ul[1]/li[1]/div[1]/ul[1]/li[7]/a[1]") WebElement  areaConvertion;
@FindBy(xpath="//input[@data-label='state']") WebElement  state;
@FindBy(xpath="//div[contains(@class,'selectBox__selectList selectBox__show')]//div[1]") WebElement  apState;
@FindBy(css="div#app>div>div>div:nth-of-type(2)>div>div>div:nth-of-type(4)>div:nth-of-type(2)>div>div") WebElement  unit1;
@FindBy(css="div#app>div>div>div:nth-of-type(2)>div>div>div:nth-of-type(4)>div:nth-of-type(2)>div>div:nth-of-type(2)>div:nth-of-type(19)") WebElement  one;
@FindBy(css="div#app>div>div>div:nth-of-type(2)>div>div>div:nth-of-type(6)>div:nth-of-type(2)>div>div") WebElement  unit2;
@FindBy(css="div#app>div>div>div:nth-of-type(2)>div>div>div:nth-of-type(6)>div:nth-of-type(2)>div>div:nth-of-type(2)>div:nth-of-type(4)>span") WebElement  calculation;


public void ownerOptions() {
	OwnerOption.click();
}
public void Insights() {
	insights.click();
}
public void   areaconvertion() {
	areaConvertion.click();
}
public void State() {
	state.click();
}
public void ApState() {
	apState.click();
}
public void Unit1() {
	unit1.click();
}
public void One() {
	one.click();
}
public void Unit2() {
	unit2.click();
}
public void Calculations() {
	calculation.click();
}
}
