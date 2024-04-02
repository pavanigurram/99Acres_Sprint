package stepdefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Builders;
import pages.CheckEligibility;
import pages.PostProperty;
import pages.article;
import pages.s1;
import pages.ownerService;

public class For_Owner {
	WebDriver driver;
	//s1 sObj = new s1(driver);
	@Given("user on 99acres Home Page")
	public void user_on_99acres_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
		driver = new ChromeDriver();
		driver.get("https://www.99acres.com/");
		driver.manage().window().maximize();
	}

	@When("user clicks on For Owners option")
	public void user_clicks_on_for_owners_option() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[3]/a")).click();
//		 WebElement ele = driver.findElement(By.linkText("For Owner"));
//	        ele.click();
		s1 sObj = new s1(driver);
		sObj.ownerOptions();
		PostProperty pp = new PostProperty(driver);
		pp.ownerOptions();;
	}

	@When("click on Insights")
	public void click_on_insights() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[3]/div/ul/li[2]/span")).click();
		s1 sObj = new s1(driver);
		sObj.Insights();
	}

	@When("click on Builders In India")
	public void click_on_builders_in_india() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[2]/ul[1]/li[1]/div[1]/ul[1]/li[7]/a[1]")).click();
		Builders build = new Builders(driver);
		build.BuildersInIndia();
		Thread.sleep(1000);
	}

	

	@Then("all builders list diaplayed")
	public void all_builders_list_diaplayed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	@When("click on Owner Offerings")
	public void click_on_owner_offerings() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//span[@data-label='OWNER OFFERINGS']")).click();
		article articleObj1 = new article(driver);
		articleObj1.ownerOffering();
		ownerService osObj = new ownerService(driver);
		osObj.owner_offering();
	}

	@When("choose owner services")
	public void choose_owner_services() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[3]/div/ul/li[1]/div/ul/li/div/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("//a[@data-label='LINK' and contains(text(),\"Owner Services\")]")).click();
//		driver.getWindowHandle();
//		//driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
//		driver.findElement(By.xpath("//text[text()='Owner']")).click();
		ownerService osObj1 = new ownerService(driver);
		osObj1.owner_service();
		
	}

	@When("pick a plan")
	public void pick_a_plan() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
	//	WebElement owner_plan=driver.findElement(By.xpath("//*[@id=\"Owner\"]/div[1]/text"));
//		owner_plan.click();
//		driver.findElement(By.id("clickableTextWithoutProperty")).click();
		ownerService osObj2 = new ownerService(driver);
		osObj2.ownerPlans();;
		Thread.sleep(5000);
	}

	@Then("processed to purchase")
	public void processed_to_purchase() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
       // driver.findElement(By.xpath("//*[@id=\"clickableTextWithoutProperty\"]")).click();
//		driver.findElement(By.xpath("//text[text()='Rent/Lease']")).click();
//		driver.findElement(By.xpath("//text[text()='Residential']")).click();
//		driver.findElement(By.xpath("//text[text()='5000 - 15000']")).click();
		ownerService osObj3 = new ownerService(driver);
		osObj3.addProprties();
		osObj3.rent();
		osObj3.residential();
		osObj3.price();
		
//		driver.findElement(By.xpath("//*[@id=\"bos_desk_preference_R\"]/div/span[2]/text")).click();
//		driver.findElement(By.xpath("//*[@id=\"bos_desk_preference_R\"]/div/span[2]/div")).click();
//		driver.findElement(By.xpath("//*[@id=\"bos_desk_price_RR2\"]/div/span[2]/text")).click();
		
//		WebElement viewplan =driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/button"));
//		viewplan.click();
	//	System.out.println("After clicking view plan user able to view differnt plans related to the choice");
	}
	
	
	@When("user clicks on Articles and News")
	public void user_clicks_on_articles_and_news() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[3]/div/ul/li[3]/span")).click();
//		driver.findElement(By.xpath("(//span[@data-custominfo='{\"custom_object\":{\"tab\":\"For Owners\"}}'])[3]")).click();
		article articleObj = new article(driver);
		articleObj.articles();
	}

	@When("user clicks Real Estate News")
	public void user_clicks_real_estate_news() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//a[@data-custominfo='{\"custom_object\":{\"url\":\"/articles/real-estate-news?fcat=home-owners\",\"tab\":\"For Owners\"}}']")).click();
		article articleObj1 = new article(driver);
		articleObj1.realEstate();
	}

	@When("user clicks on subscribe option")
	public void user_clicks_on_subscribe_option() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2800)");
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		//driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div/div/span")).click();
		article articleObj2 = new article(driver);
		articleObj2.subScribe();
	}
	

	
	
	@When("user clicks on Owner Offerings")
	public void user_clicks_on_owner_offerings() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//span[@data-label='OWNER OFFERINGS']")).click();
		PostProperty pp1 = new PostProperty(driver);
		pp1.ownerOffer();
		 
	}

	@When("user clicks on post property")
	public void user_clicks_on_post_property() {
	   
//		driver.findElement(By.xpath("//a[@href='https://www.99acres.com/postproperty/']")).click();
		//driver.findElement(By.xpath("//a[@data-custominfo='{\"custom_object\":{\"url\":\"/postproperty/\",\"tab\":\"For Owners\"}}']")).click();
		PostProperty pp2 = new PostProperty(driver);
		pp2.postProperty();
	}

	@When("user adds basic details")
	public void user_adds_basic_details() throws InterruptedException {
	   
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);
		//WebElement rent = driver.findElement(By.xpath("//span[text()='Rent / Lease']"));
	//	rent.click();
		PostProperty pp3 = new PostProperty(driver);
		pp3.rents();
//		JavascriptExecutor  js = (JavascriptExecutor) driver;
//		js.executeScript("argument[0].click();",rent);
		
//		driver.findElement(By.xpath("//input[@label='Residential']/following-sibling::label[1]")).click();
	pp3.residents();
	//driver.findElement(By.xpath("//span[text()='Flat/Apartment']")).click();
		pp3.falts();
	Thread.sleep(2000);
	JavascriptExecutor  js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1300)");
	//driver.findElement(By.xpath("//input[@data-attr='inputText']")).sendKeys("9390555254");
	pp3.phoneNo();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='buttonInput_continue_btn__1gb5M buttonInput_fullButton__3mGci']//button[1]")));
//	driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
	//WebElement start=driver.findElement(By.xpath("//div[@class='buttonInput_continue_btn__1gb5M buttonInput_fullButton__3mGci']//button[1]"));
//	
//	js.executeScript("argument[0].click()",start);
	//start.click();
	
	}
	@Then("start sucessfull")
	public void start_sucessfull() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	@When("user click on menu bar")
	public void user_click_on_menu_bar() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		//  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[6]/div[1]/i")).click();
		CheckEligibility ce1 = new CheckEligibility(driver);
		ce1.menuBar();
		Thread.sleep(2000);
	}

	@When("user click on Home Loans")
	public void user_click_on_home_loans() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div[6]/div[2]/div[2]/div[4]/div[1]/div/a")).click();
		CheckEligibility ce2 = new CheckEligibility(driver);
		ce2.lone();
	    Thread.sleep(2000);
	 
	}

	@When("user click on Check Eligibility")
	public void user_click_on_check_eligibility() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.findElement(By.xpath("//div[text()='CHECK ELIGIBILITY']")).click();
		CheckEligibility ce3 = new CheckEligibility(driver);
		ce3.check();
	}

	@When("user enters the age as {string}")
	public void user_enters_the_age_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"checkEliComponent\"]/div[2]/form/div[1]/div[4]/div[1]/input")).
		 * sendKeys(Keys.DELETE); driver.findElement(By.xpath(
		 * "//*[@id=\"checkEliComponent\"]/div[2]/form/div[1]/div[4]/div[1]/input")).
		 * sendKeys(string);;
		 */
		//WebElement ele=driver.findElement(By.xpath("//*[@id=\"checkEliComponent\"]/div[2]/form/div[1]/div[4]/div[1]/input"));
		//ele.click();
		Thread.sleep(1000);
		CheckEligibility ce4 = new CheckEligibility(driver);
		ce4.age(string);
//		ele.sendKeys(Keys.CONTROL,"a");
//		ele.sendKeys(Keys.DELETE);
//		ele.sendKeys(string);
		
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//driver.findElement(By.xpath("//*[@id=\"checkEliComponent\"]/div[2]/form/div[1]/div[4]/div[1]/input")).sendKeys(string);
	}

	@When("user enters the net income as {string}")
	public void user_enters_the_net_income_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
//		WebElement ele=driver.findElement(By.xpath("(//ul[@class='phnCodeListing hide1']/following-sibling::input)[3]"));
		CheckEligibility ce5 = new CheckEligibility(driver);
		ce5.income(string);
//		ele.sendKeys(Keys.CONTROL,"a");
//		ele.sendKeys(Keys.DELETE);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		ele.sendKeys(string);
	}

	@When("user enters the Existing Monthly EMI as {string}")
	public void user_enters_the_existing_monthly_emi_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	//	WebElement ele=driver.findElement(By.xpath("(//div[@class='eoiLyr_inpWrap wid50']//input)[3]"));
		CheckEligibility ce6 = new CheckEligibility(driver);
		ce6.presentEmi(string);
//		ele.sendKeys(Keys.CONTROL,"a");
//		ele.sendKeys(Keys.DELETE);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		ele.sendKeys(string);
	}

	@When("user enters the Rate of Interest as {string}")
	public void user_enters_the_rate_of_interest_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
//		WebElement ele=driver.findElement(By.xpath("//div[contains(@class,'eoiLyr_inpWrap wid50')]//input[contains(@value,'8.9')]"));
		CheckEligibility ce7 = new CheckEligibility(driver);
		ce7.interest(string);
//		ele.sendKeys(Keys.CONTROL,"a");
//		ele.sendKeys(Keys.DELETE);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		ele.sendKeys(string);
	}

	@When("user enters the Tenure as {string}")
	public void user_enters_the_tenure_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//div[@id='checkEliComponent']/div[2]/form[1]/div[1]/div[5]/div[2]/input[1]]")).clear();
//		/WebElement ele=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/div[2]/form/div[1]/div[5]/div[2]/input"));
		CheckEligibility ce8 = new CheckEligibility(driver);
		ce8.tenure(string);
//		ele.sendKeys(Keys.CONTROL,"a");
//		ele.sendKeys(Keys.DELETE);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		ele.sendKeys(string);
	}

	@Then("user click on calaculate")
	public void user_click_on_calaculate() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//button[text()='Calculate']")).click();
		CheckEligibility ce9 = new CheckEligibility(driver);
		ce9.calculate();
		JavascriptExecutor  js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		WebElement ele=driver.findElement(By.xpath("//div[@class='borrowUptoLegend']//div[@class='emiPrice']"));
		String amountBorrow =ele.getText();
		System.out.println("Amount you Borrow :"+amountBorrow);
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='loanAmountLegend']//div[@class='emiPrice']"));
		String amountPayable=ele1.getText();
		System.out.println("Amount you have to pay :"+amountPayable);
	}


	
	
}
