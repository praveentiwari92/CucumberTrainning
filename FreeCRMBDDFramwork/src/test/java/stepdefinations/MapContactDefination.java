package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MapContactDefination {

	
	WebDriver driver;
	@Given("^user is already on contact page$")
	public void user_is_already_on_contact_page() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe"); 
		driver =new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.mysiponline.com/contact-us.php");
	}
	
	

	@Then("^user enter contact details$")
	public void user_enter_contact_details(DataTable credentials) 
	{
		for(java.util.Map<String, String> data:credentials.asMaps(String.class, String.class))
		{
		   
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(data.get("UserName"));
	   driver.findElement(By.xpath("//input[@id='cemail']")).sendKeys(data.get("Email"));
	   driver.findElement(By.xpath("//input[@id='cphones']")).sendKeys(data.get("MobileNo"));
	   driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(data.get("Message"));
	   JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,400)");
	}
	}
	@Then("^user click on submit button$")
	public void user_click_on_submit_button() 
	{
		
		 driver.findElement(By.xpath("//button[@id='btn_submit']")).click();
	}

	@Then("^close browser$")
	public void close_browser() 
	{
	   
	    driver.quit();
	}

}
