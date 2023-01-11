package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	WebDriver driver;

	@Given("chrome browser is opened")
	public void chrome_browser_is_opened() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("VARUN "+ Thread.currentThread().getId());
	}

	@And("www.google.com site is loaded")
	public void www_google_com_site_is_loaded() {
		driver.get("https://www.google.com");
	}

	@When("^user searches for (.*)$")
	public void user_searches_for_skype(String data) {
		driver.findElement(By.name("q")).sendKeys(data);
	}

	@And("hit Enter")
	public void hit_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^(.*) must be displayed$")
	public void www_skype_com_must_be_displayed(String site) throws InterruptedException {
		driver.findElement(By.xpath("//cite[contains(.,"+site+")]"));
		Thread.sleep(5000);
		driver.quit();
	}
}
