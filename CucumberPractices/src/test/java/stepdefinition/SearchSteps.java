package stepdefinition;

import amazonimplementation.Product;
import amazonimplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class SearchSteps {
	
	Product product;
	Search search;
	
	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step 1: I am on Serach page");
	}

	//()=capture groups, [] ranges, {} quantity
	//Quantifiers in RegEx +,*,?,{n}
	@When("^I search for a product \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_a_product_and_price(String productName, Integer price) {
		System.out.println("Step 2: Search the product name : "+productName+" price: "+price);
		
		product = new Product(productName,price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3: product "+productName+" is displayed");
		
		search = new Search();
		String prdctName = search.displayProduct(product);
		//Assert.assertEquals(product.getProduct(), prdctName);
	}
	
	@Then("OrderId is {int} and user name is {string}")
	public void order_id_is_and_user_name_is(Integer orderId, String user) {
	    System.out.println("Order id is "+orderId+ " and username is "+user);
	}

}
