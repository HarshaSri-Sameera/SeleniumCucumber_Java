package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demomadmax {
	
	WebDriver driver;
	
	@Given("User already in singup for CRM page")
	public void user_already_in_singup_for_crm_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://myprofile.technicalhub.io/login");
		System.out.println("user_already_in_signup_for_crm_page");
	}
	
	@When("User navigates to CRM Page")
	public void user_navigates_to_crm_page() {
		System.out.println("user_navigates_to_crm_page");
	}
	
	@When("Enter correct username and password")
	public void enter_correct_username_and_password() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("19A91A0570");
		driver.findElement(By.id("password")).sendKeys("MYPROFILE2002");
		driver.findElement(By.id("btn_login")).click();
		System.out.println("user_already_in_singup_for_crm_page");
	}
	
	@Then("verify home page should be displayed")
	public void verify_home_page_should_be_displayed() throws InterruptedException {		
		System.out.println("user_already_in_singup_for_crm_page");
		
	}
	
	@Then("user closes the browser")
	public void user_closes_the_browser() throws InterruptedException {
		System.out.println("user_already_in_singup_for_crm_page");
	}
	
//	@When("Enter correct username and p assword")
//	public void enter_correct_username_and_p_assword() {
////		Thread.sleep(3000);
//		driver.findElement(By.id("username")).sendKeys("19A91A0570");
//		driver.findElement(By.id("password")).sendKeys("MYPROFILE2002");
//		driver.findElement(By.id("btn_login")).click();
//		System.out.println("user_already_in_singup_for_crm_page");
//	}



}
