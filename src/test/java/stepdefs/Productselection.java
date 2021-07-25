package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Productselection {
	
	   WebDriver driver = Baseclass.driver;
	
	   @Given("^User has opened the Swaglab applications$")
	    public void user_has_opened_the_swaglab_applications() throws Throwable {
		   
		    driver.get("https://www.saucedemo.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	        
	    }

	    @When("^User enters usernames \"([^\"]*)\"$")
	    public void user_enters_usernames_something(String username) throws Throwable {
	    	
	    	WebElement UserName = driver.findElement(By.xpath("//input[@name='user-name']"));
	    	UserName.sendKeys(username);
	        
	    }

	    @And("^User enters passwords \"([^\"]*)\"$")
	    public void user_enters_passwords_something(String password) throws Throwable {
	    	
	    	WebElement UserPass = driver.findElement(By.xpath("//input[@name='password']"));
	    	UserPass.sendKeys(password);
	        
	    }

	    @And("^User clicks on Login buttons$")
	    public void user_clicks_on_login_buttons() throws Throwable {
	    	
	    	WebElement UserLogin = driver.findElement(By.xpath("//input[@name='login-button']"));
	    	UserLogin.click();
	        
	    }
	    
	    @Given("^User should be landed on product page $")
	    public void user_should_be_landed_on_product_page() throws Throwable {
	    	
	    	WebElement ProductPageTitle = driver.findElement(By.xpath("//*[@class='title']"));
			String ActText =  ProductPageTitle.getText();
			String ExpText = "PRODUCTS";
			
			Assert.assertEquals(ExpText, ActText);
	        
	    }

	    @And("^User selects product and clicks on add to cart button \"([^\"]*)\"$")
	    public void user_selects_product_and_clicks_on_add_to_cart_button_something(String product) throws Throwable {
	    	
	    	WebElement productselection = driver.findElement(By.xpath("//*[text()='" + product + "']//following::button[1]"));
			productselection.click();
	    }
	    

	    @And("^User selects a multiple product and add to cart$")
	    public void user_selects_a_multiple_product_and_add_to_cart(DataTable table) throws Throwable {
	    	
	       String Product1 = table.cell(0, 0);
	       String Product2 = table.cell(1, 0);
	       String Product3 = table.cell(2, 0);
	       String Product4 = table.cell(3, 0);
	       
	       WebElement productselection1 = driver.findElement(By.xpath("//*[text()='" + Product1 + "']//following::button[1]"));
		   productselection1.click();
		   
		   WebElement productselection2 = driver.findElement(By.xpath("//*[text()='" + Product2 + "']//following::button[1]"));
		   productselection2.click();
		   
		   WebElement productselection3 = driver.findElement(By.xpath("//*[text()='" + Product3 + "']//following::button[1]"));
		   productselection3.click();
		   
		   WebElement productselection4 = driver.findElement(By.xpath("//*[text()='" + Product4 + "']//following::button[1]"));
		   productselection4.click();
	       
	      
	    }
	    
	    @Then("^User should be able to see product in cart$")
	    public void user_should_be_able_to_see_product_in_cart() throws Throwable {
	    	
	    	WebElement openCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    	openCart.click();
	    	Thread.sleep(3000);
	    	
	    	
	      }

}
