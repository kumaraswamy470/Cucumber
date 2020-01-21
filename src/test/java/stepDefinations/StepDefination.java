package stepDefinations;

import org.openqa.selenium.WebDriver;

import CommonFunLibrary.FunctionERP;
import cucumber.api.java.en.When;

public class StepDefination {
	static WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
	 driver=FunctionERP.startBrowser("chrome");
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
	   FunctionERP.openApplication(driver);
	}

	@When("^Wait for Username$")
	public void wait_for_Username() throws Throwable {
	    FunctionERP.waitForElement(driver, "name", "username", "10");
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
	    FunctionERP.typeAction(driver, "name", "username", "admin");
	}

	@When("^Wait for password$")
	public void wait_for_password() throws Throwable {
	    FunctionERP.waitForElement(driver, "name", "password", "10");
	}

	@When("^Enter password$")
	public void enter_password() throws Throwable {
	   FunctionERP.typeAction(driver, "name", "password", "master");
	}

	@When("^Click  on Login$")
	public void click_on_Login() throws Throwable {
	   FunctionERP.clickAction(driver, "id", "btnsubmit");
	}

	@When("^Wait for Logout$")
	public void wait_for_Logout() throws Throwable {
	   FunctionERP.waitForElement(driver, "id","logout", "30");
	}

	@When("^Click on Logout$")
	public void click_on_Logout() throws Throwable {
	   FunctionERP.clickAction(driver, "id", "logout");
	}

	@When("^Wait for OK$")
	public void wait_for_OK() throws Throwable {
	    FunctionERP.waitForElement(driver, "xpath","//button[@class='ajs-button btn btn-primary']", "20");
	}

	@When("^Click on OK$")
	public void click_on_OK() throws Throwable {
	   FunctionERP.clickAction(driver, "xpath", "//button[@class='ajs-button btn btn-primary']");
	}

	@When("^CloseBrowser$")
	public void closebrowser() throws Throwable {
	  FunctionERP.closeBrowser(driver);
	}

	
	
}
