package myhooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	
	//@Before(order = 1)
	@Before("@Smoke")
	public void setUpBrowser(Scenario sc) {
		System.out.println("Launch Chrome Browser");
		System.out.println(sc.getName());
		//int i = 9/0; For error
	}
	
	@Before(order = 2)
	public void setUpUrl() {
		System.out.println("Launch Amazon application");
	}
	
	@After("@Smoke")
	//@After(order = 1)
	public void tearDownCloseApp() {
		System.out.println("Close the app");
	}
	
	@After(order = 2)
	public void tearDownCloseBrowser() {
		System.out.println("Close the browser");
	}

	@BeforeStep
	public void takeScreenShot() {
		System.out.println("Take the screenshot");
	}
	
	@AfterStep
	public void takeScreenShotRefreshPage() {
		System.out.println("Take the screenshot and refresh page");
	}
	
	
}
