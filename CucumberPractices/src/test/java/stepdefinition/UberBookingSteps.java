package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("User wants to select a car type {string} from uber application")
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
	    System.out.println("Step 1 : Select car "+carType);
	}

	@When("user select cas {string} and pick up point {string} and drop location {string}")
	public void user_select_cas_and_pick_up_point_and_drop_location(String carType, String pickUpLocation, String dropLocation) {
		System.out.println("Step 2 : "+carType+" pickup at "+pickUpLocation+" drop at "+dropLocation);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("Step 3");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step 4");
	}

	@Then("User pays {int} Rs")
	public void user_user_pays_rs(Integer price) {
		System.out.println("Step 5 : Price is "+price);
	}
}
