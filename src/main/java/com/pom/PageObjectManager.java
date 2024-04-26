package com.pom;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.locators.Homepage;

public class PageObjectManager extends BaseClass {
	public PageObjectManager(WebDriver xdriver) {
		driver = xdriver;
	}

	private Homepage hpage;

	public Homepage page() {
		if (hpage == null) {
			hpage = new Homepage(driver);
		}
		return hpage;
	}
}
