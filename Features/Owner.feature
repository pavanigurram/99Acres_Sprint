    
 Feature: Owner Management on 99Acres Website

Scenario: Owner views insights
  Given user on 99acres Home Page
  When user clicks on For Owners option
  And click on Insights
  When click on Builders In India
  Then  all builders list diaplayed


 Scenario: Owner Services 
  Given user on 99acres Home Page
  When user clicks on For Owners option
  And click on Owner Offerings
  When choose owner services 
  And pick a plan
  Then  processed to purchase

Scenario: Articles and News
  Given user on 99acres Home Page
  When user clicks on For Owners option
  And  user clicks on Articles and News
  And  user clicks Real Estate News
  And  user clicks on subscribe option
  


  Scenario: Owner updates property details
  Given user on 99acres Home Page
  When user clicks on For Owners option
  And user clicks on Owner Offerings
  When user clicks on post property 
  And user adds basic details
  Then start sucessfull
  


  

Scenario Outline: Checking Eligibility
Given user on 99acres Home Page
When user click on menu bar
And user click on Home Loans
And user click on Check Eligibility
And user enters the age as <age>
And user enters the net income as <net_income>
And user enters the Existing Monthly EMI as <Existing_Monthly_EMI>
And user enters the Rate of Interest as <Rate_of_interest>
And user enters the Tenure as <Tenure>
Then user click on calaculate
 
Examples:
   |  age  | net_income | Existing_Monthly_EMI | Rate_of_interest | Tenure |
   |  "22" |   "50,000" |       "10,000"       |      "5.5"       |   "10" |
	 |  "28" |	"1,50,000"|       "12,500"			 |			"8.7" 			|		"7"  |	

	 
	 

  