package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitionsample extends BaseTest {


	@Given("^User is already on login page$")
	public void User_is_already_on_login_page() {

		driver.get("https://adactinhotelapp.com/");

	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("vaishnavi119");
		driver.findElement(By.id("password")).sendKeys("vaishnavi");

	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_password() {
		driver.findElement(By.id("login")).click();

	}

	@Given("^User enters location value$")
	public void User_enters_location_value() {
		Select selectLocation = new Select(driver.findElement(By.id("location")));
		selectLocation.selectByValue("Sydney");

	}

	@When("^User click submit button$")
	public void user_click_submit_button() {
		driver.findElement(By.id("Submit")).click();

	}

	@Then("^User is on detail page$")
	public void user_is_on_detail_page() {
		String title = driver.getTitle();
		System.out.println(title);

	}

}
