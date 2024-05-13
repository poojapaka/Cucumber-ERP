package stepDefinations;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps
{
	WebDriver driver;
	String Expected = "";
	String Actual ="";
	@Given("User Navigate Url {string} in a browser")
	public void lanchurl(String  url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(url);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@When("user Enter {string} in Username")
	public void enteruser(String username) {
	    driver.findElement(By.name("txtUsername")).sendKeys(username);
	}
	@When("user Enter {string} in password")
	public void enterpassword(String password) {
	   driver.findElement(By.name("txtPassword")).sendKeys(password);
	}
	@When("user clicks Loginbutton")
	public void user_clicks_loginbutton() {
	    driver.findElement(By.name("Submit")).click();
	}
	@When("user clicks pim")
	public void user_clicks_pim() {
	   driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	}
	@When("user clicks Add button")
	public void user_clicks_add_button() {
	    driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
	}
	@When("user Enter {string} in Firstname")
	public void user_enter_in_firstname(String Firstname) {
	driver.findElement(By.name("firstName")).sendKeys(Firstname);    
	}
	@When("user Enter {string} in middlename")
	public void user_enter_in_middlename(String middlename) {
	    driver.findElement(By.name("middleName")).sendKeys(middlename);
}
	@When("user Enter {string} in Lastname")
	public void user_enter_in_lastname(String lastname) {
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);    
	}
	@When("user Capture EID BeforeAdding emp")
	public void user_capture_eid_before_adding_emp() {
	   Expected = driver.findElement(By.name("employeeId")).getAttribute("value");
	}
	@When("user click save button")
	public void user_click_save_button() {
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	}
	@When("user Capture Eid AfterAdding Employee")
	public void user_capture_eid_after_adding_employee() {
	    Actual = driver.findElement(By.xpath("//input[@name='personal")).getAttribute("value");
	}
	@Then("user validates Eid")
	public void user_validates_eid() {
	    if(Expected.equals(Actual))
	    {
	    	System.out.println("Add Employee sucess: :"+Expected+"    "+Actual);
	    }
	    else
	    {
	    	System.out.println("Add Employee unscess: : "+ Expected+"    "+Actual);
	    }
	}
	@Then("user close Browser")
	public void user_close_browser() {
	    driver.quit();
	    }
}
