package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Practice1 {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("Practice1 "+ Thread.currentThread().getId()+"Practice1 : I want to write a step with precondition");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("Practice1 : I validate the outcomes");
	}
}
