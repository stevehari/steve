package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import resources.base;
@RunWith(Cucumber.class)
public class stepDefinition 
{
/*@Given("^user is on login page$")
public void user_is_on_login_page()
{
driver.get(prop.getProperty("url"));

}
@When("^when user enters password and username$")
public void user_enters_password_and_username()throws Throwable 
{
	driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));;
	driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.id("loginbutton")).click();
}
@Then("^home page of the User is visibile$")
public void home_page_of_the_user_is_visibile() 
{

}

@And("^click on the profile$")
public void click_on_the_profile() 
{
	
}*/
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("hari");
	    throw new PendingException();

	}

	@When("^when user enters password and username$")
	public void when_user_enters_password_and_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("hari");
		    throw new PendingException();

	}

	@Then("^home page of the User is visibile$")
	public void home_page_of_the_User_is_visibile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("hari");
		    throw new PendingException();


	}

	@Then("^click on the profile$")
	public void click_on_the_profile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("hari");
		    throw new PendingException();


	}
}
