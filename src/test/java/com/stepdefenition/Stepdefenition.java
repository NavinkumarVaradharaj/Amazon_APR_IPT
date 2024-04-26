package com.stepdefenition;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.baseclass.BaseClass;
import com.pom.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdefenition extends BaseClass {

	PageObjectManager obj = new PageObjectManager(driver);

	@Given("navigate to amzon homepage")
	public void navigate_to_amzon_homepage() {
		launchbrowser();

		launchurl("https://www.amazon.in//");
		LOGGER.info("url launched succesfully");

		String a1 = driver.getTitle();
		System.out.println(a1);
		// Assert.assertEquals(a1, "Amazon.in");

	}

	@When("Click on fashion and click on mens")
	public void click_on_fashion_and_click_on_mens() throws InterruptedException {

		obj.page().openMensFashion();
		LOGGER.info("mens fashioned sucessfully");

	}

	@When("Fileter by Average custumor review {int} stars and up")
	public void fileter_by_average_custumor_review_stars_and_up(Integer int1) {

		obj.page().filterstar();
		LOGGER.info("filter applied succesfully");

	}

	@When("Filter by price {int}-{int}")
	public void filter_by_price(Integer int1, Integer int2) {

		obj.page().filterprice();
		LOGGER.info("filterprice applied succesfully");

	}

	@When("Select puma and Allen Solley in brands")
	public void select_puma_and_allen_solley_in_brands() throws Throwable {

		obj.page().brandselection();
		LOGGER.info("brand selected sucessfully");

	}

	@When("Count the number of result in first page and log to console")
	public void count_the_number_of_result_in_first_page_and_log_to_console() {
		timeout();

		System.out.print("Count of total products in the current page : " + obj.page().getsecondproduct().size());
		screenshot("cart page");
		LOGGER.info("number of result in first page is displayed");
	}

	@When("Click the second product  and add to cart")
	public void click_the_second_product_and_add_to_cart() {
		int size = obj.page().getsecondproduct().size();

		if (size >= 2) {
			WebElement secondelement = obj.page().getsecondproduct().get(1);
			secondelement.click();
		} else {
			System.out.println("not passed");
		}
		LOGGER.info("second product added to the cart");

	}

	@When("Validate Number and Cart is increased by {int}")
	public void validate_number_and_cart_is_increased_by(int int1) throws Throwable {

		obj.page().addingtocart();

		Assert.assertTrue(obj.page().getNumberOfProductsInCart() == 1);
		LOGGER.info("program passed");

	}
}
