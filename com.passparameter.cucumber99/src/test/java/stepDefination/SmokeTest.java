package stepDefination;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	public WebDriver driver;
	@Given("^Open chrome browser and start application$")
	public void open_chrome_browser_and_start_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://localhost/POS/public/login";
		String driverPath = "c:\\chromedriver.exe";
		driver.get(baseUrl);
	}

	@When("^I enter the valid username and valid password$")
	public void i_enter_the_valid_username_and_valid_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pointofsale");


	}

	@Then("^User should be login successfully$")
	public void user_should_be_login_successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='loginButton']")).click();
		Thread.sleep(4000);
	}

	@Then("^Click on sale$")
	public void click_on_sale() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[7]/a[1]")).click();
	}

	@Then("^click on resigter mode and select$")
	public void click_on_resigter_mode_and_select() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[2]/div[1]/button[1]/span[2]")).click();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		//		WebElement phone =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[2]/div[1]/ul[1]/li[2]/input[1]"));
	}

	@Then("^create new item and submit$")
	public void create_new_item_and_submit() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[2]/div[1]/ul[1]/li[3]/button[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/input[1]")).sendKeys("Laptopbattery");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("laptops");
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[7]/div[1]/div[1]/input[1]")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[7]/div[1]/div[1]/input[1]")).sendKeys("2000");
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[8]/div[1]/div[1]/input[1]")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[8]/div[1]/div[1]/input[1]")).sendKeys("4000");
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[11]/div[1]/input[1]")).sendKeys("5");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[12]/div[1]/input[1]")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[12]/div[1]/input[1]")).sendKeys("1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[13]/div[1]/input[1]")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[13]/div[1]/input[1]")).sendKeys("1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]")).click();


	}
	@Then("^create new customer$")
	public void create_new_customer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/button[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/input[1]")).sendKeys("maddy");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[3]/div[1]/input[1]")).sendKeys("abxc");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[5]/div[1]/div[1]/input[1]")).sendKeys("maddy2365@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[7]/div[1]/input[1]")).sendKeys("Nasik");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[14]/div[1]/div[1]/input[1]")).sendKeys("5");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(4000);
	    
	}

	@Then("^Creat the invoice of the customer$")
	public void creat_the_invoice_of_the_customer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(4000);
	   
	}

	@Then("^Get the screenShoot$")
	public void get_the_screenShoot() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("E:\\ScreenShot_POS_cucumber.jpg"));

	}

}
