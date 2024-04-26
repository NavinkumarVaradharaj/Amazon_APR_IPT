package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	@Before
	public static void before() {
		System.out.println("code started");
	}

	@After
	public static void after(Scenario scr) {
		timeout();
		String screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		scr.attach(screenshotAs, "jpeg", scr.getName());
	}
}
