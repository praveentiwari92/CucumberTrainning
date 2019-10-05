package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination 
{
	WebDriver driver;
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe"); 
		driver =new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.mysiponline.com/login.php");
	}

	@When("^title of login page is My SIP Online Login$")
	public void title_of_login_page_is_Login_Page() 
	{
	   String title = driver.getTitle();
	   System.out.println(title);
	   Assert.assertEquals("My SIP Online Login", title);
			   
	}
	// Regular Expresion
	// \"(.*)\"
	// \"([^\"]*)\"

	@Then("^user enter \"(.*)\" and \"(.*)\"$")
	public void user_enter_username_and_user_enter_password(String username, String pasword) 
	{
	  driver.findElement(By.id("email")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(pasword); 
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()
	{
	   driver.findElement(By.xpath("//button[@class='btn btn-primary teal']")).click();
	   
	}

	@Then("^user is on Dashboard page$")
	public void user_is_on_Dashboard_page() throws InterruptedException 
	{
		Thread.sleep(5000);
	    boolean sd = driver.findElement(By.className("logo")).isDisplayed();
	    
	    System.out.println(sd);
	    
	    if (sd==true)
	    {
	    	System.out.println("user login successfully");
	    	
	    }
	    else {
	    	System.out.println("user unable to logind");
	    }
	}

	@Then("^user click on invest Now Link$")
	public void user_click_on_invest_Link()
	{
	    driver.findElement(By.xpath("//a[@class='mobile-hide-menu']")).click();
	
	}

	@Then("^user click on start Lumpsum Link$")
	public void user_click_on_start_Lumpsum_Link() throws InterruptedException 
	{
	Thread.sleep(5000);
	 driver.findElement(By.xpath("//a[contains(text(),'Start Lumpsum')]")).click();
	}
	
	@Then("^user Scroll down Page$")
	public void user_Scroll_down_Page() throws Throwable {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,400)");
	}
		
	@Then("^user click on invest now button$")
	public void user_click_on_invest_now_button()
	{
		driver.findElement(By.className("btn-success")).click();
	}
	
	@Then("^user enter amount$")
	public void user_enter_amount()
	{
	    driver.findElement(By.id("amount_btn")).sendKeys("5000");
	}

	@Then("^user select SIP Date$")
	public void user_select_SIP_Date() 
	{
		driver.findElement(By.id("dt15")).click();
	}

	@Then("^user click on Buy Now button$")
	public void user_click_on_Buy_Now_button() 
	{
	    driver.findElement(By.className("BuyNow")).click();
	}

	
	
	
	
	
	
	
	
	
}
