package org.hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.stepdefinition.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hookssample extends BaseTest {

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
//		String title = driver.getTitle();
//		System.out.println(title);

	}

	@After
	public void after() {
		driver.quit();
	}

}
