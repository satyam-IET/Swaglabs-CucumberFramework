package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps{
	WebDriver driver = Baseclass.driver;
	
    @Given("^User has opened the Swaglab application$")
    public void user_has_opened_the_swaglab_application() throws Throwable {
    	
        driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
    }

    @When("^User enters username \"([^\"]*)\"$")
    public void user_enters_username_something(String username) throws Throwable {
    	
    	WebElement UserName = driver.findElement(By.xpath("//input[@name='user-name']"));
    	UserName.sendKeys(username);
        
    }

    @Then("^User should be landed on the Products Page$")
    public void user_should_be_landed_on_the_products_page() throws Throwable {
    	
    	WebElement ProductPageTitle = driver.findElement(By.xpath("//*[@class='title']"));
		String ActText =  ProductPageTitle.getText();
		String ExpText = "PRODUCTS";
		
		Assert.assertEquals(ExpText, ActText);
        
    }

    @Then("^User should be getting the \"([^\"]*)\"$")
    public void user_should_be_getting_the_something(String Experror) throws Throwable {
    	
    	WebElement ErrorMsg = driver.findElement(By.xpath("//*[@data-test='error']"));
		String ActError =  ErrorMsg.getText();
		
		Assert.assertEquals(ActError, Experror);
        
    }

    @And("^User enters password \"([^\"]*)\"$")
    public void user_enters_password_something(String password) throws Throwable {
    	
    	WebElement UserPass = driver.findElement(By.xpath("//input[@name='password']"));
    	UserPass.sendKeys(password);
        
    }

    @And("^User clicks on Login button$")
    public void user_clicks_on_login_button() throws Throwable {
    	
    	WebElement UserLogin = driver.findElement(By.xpath("//input[@name='login-button']"));
    	UserLogin.click();
        
    }

}
	
	
