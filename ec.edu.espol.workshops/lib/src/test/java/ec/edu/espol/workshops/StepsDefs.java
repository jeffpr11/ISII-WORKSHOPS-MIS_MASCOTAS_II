package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepsDefs {
	 private Integer actualAnswer;
	 private CarInsurance car_insurance;
	 
	 @Given("{int}-year-old {string} {string}, license {string}")
	 public void get_data_client(Integer age, String married, String sex, String license) {
		 car_insurance  = new CarInsurance(age, married, sex, license);
	 }
	 
	 @When("Get calculate the premiun")
	 public void calculate_premiun() {
	 actualAnswer = car_insurance.programConsole();
	 }
	 
	 @Then("I should be {int}")
	 public void i_should_be(Integer expectedAnswer) {
	 assertEquals(expectedAnswer, actualAnswer);
	 }
}