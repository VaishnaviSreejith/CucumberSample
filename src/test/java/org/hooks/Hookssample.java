package org.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.stepdefinition.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hookssample extends BaseTest {

	@Before
	public void before() {
		WebDriverManager.chromedriver().browserVersion("123.0.6312.59");
		driver=new ChromeDriver();
//		String title = driver.getTitle();
//		System.out.println(title);

	}

	@After
	public void after() {
		driver.quit();
	}

}
