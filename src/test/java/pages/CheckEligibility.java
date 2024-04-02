package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckEligibility {
WebDriver driver;

public CheckEligibility(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[6]/div[1]/i") WebElement menu;
@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div[2]/div[6]/div[2]/div[2]/div[4]/div[1]/div/a") WebElement lone;
@FindBy(xpath="//div[text()='CHECK ELIGIBILITY']") WebElement check;
@FindBy(xpath="//*[@id='checkEliComponent']/div[2]/form/div[1]/div[4]/div[1]/input") WebElement ages;
@FindBy(xpath="/html/body/div[1]/div[3]/div[4]/div/div[2]/form/div[1]/div[4]/div[3]/input") WebElement income;
@FindBy(xpath="//*[@id='checkEliComponent']/div[2]/form/div[1]/div[4]/div[4]/input") WebElement presentEMI;
@FindBy(xpath="//*[@id='checkEliComponent']/div[2]/form/div[1]/div[5]/div[1]/input") WebElement interest;
@FindBy(xpath="//*[@id='checkEliComponent']/div[2]/form/div[1]/div[5]/div[2]/input") WebElement tenure;
@FindBy(xpath="//button[text()='Calculate']") WebElement calculate;

public void menuBar() {
	menu.click();
}
public void lone() {
	lone.click();
}
public void check() {
	check.click();
}
public void age(String age) {
	ages.sendKeys(Keys.CONTROL,"a");
	ages.sendKeys(Keys.DELETE);

	ages.sendKeys(age);
}
public void income(String net_income) {
	income.sendKeys(Keys.CONTROL,"a");
	income.sendKeys(Keys.DELETE);
	income.sendKeys(net_income);
}
public void presentEmi(String Existing_Monthly_EMI) {
	presentEMI.sendKeys(Keys.CONTROL,"a");
	presentEMI.sendKeys(Keys.DELETE);
	presentEMI.sendKeys(Existing_Monthly_EMI);
}
public void interest(String Rate_of_interest) {
	interest.sendKeys(Keys.CONTROL,"a");
	interest.sendKeys(Keys.DELETE);
	interest.sendKeys(Rate_of_interest);
}
public void tenure(String Tenure) {
	tenure.sendKeys(Keys.CONTROL,"a");
	tenure.sendKeys(Keys.DELETE);
	tenure.sendKeys(Tenure);
}
public void calculate() {
	calculate.click();
}
}
