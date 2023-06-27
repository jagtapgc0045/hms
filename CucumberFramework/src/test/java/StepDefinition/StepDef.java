package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.AddNewCustomer;
import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	public WebDriver driver;
	public ChromeOptions CO;
	public LoginPage loginpg;
	
	public AddNewCustomer a;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		CO = new ChromeOptions();

		CO.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		CO.addArguments("start-maximized");

		driver = new ChromeDriver();
		loginpg = new LoginPage(driver);
		a=new AddNewCustomer(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);

	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) throws InterruptedException {
		loginpg.enterEmail(string);
		loginpg.enterPassword(string2);
		

	}

	@When("Click on Login")
	public void click_on_login() {
		loginpg.clicklogin(); 

	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expTitle) {
		String actTitle= driver.getTitle();
		if(actTitle.equals(expTitle))
		{
			Assert.assertTrue(true);//pass
		}
		else
		{
			Assert.assertTrue(false);//fail 
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		loginpg.logout();

	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
		driver.quit();
	}
	
	//==========Add Customer========//
	

	@Then("User can view Dashboad")
	public void user_can_view_dashboad() {
	
	   String Actualtitle=driver.getTitle();
	}

	@When("User click on customers Menu")
	public void user_click_on_customers_menu() {
	    
	}

	@When("click on customers Menu Item")
	public void click_on_customers_menu_item() {
	    
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
	   
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
	    
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
	    
	}

	@When("click on Save button")
	public void click_on_save_button() {
	    
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
	    
	}


}
