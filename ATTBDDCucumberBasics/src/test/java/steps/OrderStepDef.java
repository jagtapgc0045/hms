package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStepDef {
	
	@Given("user should be logged into the application")
	public void user_should_be_logged_into_the_application() {
		System.out.println("Given statement for login");
	}

	@When("user should be at orders page")
	public void user_should_be_at_orders_page() {
		System.out.println("When statement for orders page");
	}

	@When("user clicks on past order button")
	public void user_clicks_on_past_order_button() {
		System.out.println("When statement for past order button");
	}

	@Then("user should able to see the past order information")
	public void user_should_able_to_see_the_past_order_information() {
		System.out.println("Then statement for past order button");
	}

	@When("user clicks on current order button")
	public void user_clicks_on_current_order_button() {
		System.out.println("When statement for current order button");
	}

	@Then("user should be able to see the current order information")
	public void user_should_be_able_to_see_the_current_order_information() {
		System.out.println("Then statement for current order button");
	}

	@When("user clicks on cancelled order button")
	public void user_clicks_on_cancelled_order_button() {
		System.out.println("When statement for cancelled order button");
	}

	@Then("user should be able to see the cancelled order information")
	public void user_should_be_able_to_see_the_cancelled_order_information() {
		System.out.println("Then statement for cancelled order button");
	}

}
