package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user is at login screen")
	public void prconditions()
	{
		System.out.println("Preconditions for Given statements");
	}
	
	@When("user enters username")
	public void enteringusername()
	{
		System.out.println("Entering Username");
	}
	
	@When("user enters password")
	public void enteringpassword()
	{
		System.out.println("Entering password");
	}
	
	@When("user clicks on login button")
	public void clickOnLogin()
	{
		System.out.println("Clicking on login");
	}
	
	@Then ("User should get logged in")
	public void validatelogin()
	{
		System.out.println("User has been logged in");
	}
	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("Title of page should be pagetitle")
	public void title_of_page_should_be_pagetitle() {
	    // Write code here that turns the phrase above into concrete actions
	}

}
