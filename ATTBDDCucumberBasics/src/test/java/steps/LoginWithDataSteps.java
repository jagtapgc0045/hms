package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	@Given("user it at the login screen")
	public void user_it_at_the_login_screen() {
		System.out.println("Given statement for login screen");
	    
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
	    System.out.println("Entering username as "+username);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String password) {
	    System.out.println("Entering password as "+password);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	    System.out.println("clicking submit button");
	}

	@Then("user should redirect to Home page")
	public void user_should_redirect_to_home_page() {
	     System.out.println("rederecting to home page");
	}

}
