package stepdefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactStepDefination {
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
		List<List<String>> data=credentials.raw();
	   driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(data.get(0).get(0));
	   driver.findElement(By.xpath("//input[@id='cemail']")).sendKeys(data.get(0).get(1));
	   driver.findElement(By.xpath("//input[@id='cphones']")).sendKeys(data.get(0).get(2));
	   driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(data.get(0).get(3));
	   JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,400)");
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
