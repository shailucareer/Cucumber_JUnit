package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("MESSAGE "+ Thread.currentThread().getId()+"Given user is on login page");
	}

	@When("user enters username and pwd")
	public void user_enters_username_and_pwd() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("user is navigated on home page")
	public void user_is_navigated_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
	}
}
