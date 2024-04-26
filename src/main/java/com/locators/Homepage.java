package com.locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class Homepage extends BaseClass {

	public Homepage(WebDriver xdriver) {
		driver = xdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nav-hamburger-menu")
	private WebElement select_all;

	@FindBy(xpath = "//div[@id=\"hmenu-content\"]//div[text()=\"Men's Fashion\"]")
	private WebElement mensfashion;

	@FindBy(xpath = "//a[text()=\"Men's Fashion\"]")
	private WebElement mensfashion1;

	@FindBy(xpath = "//div[@aria-label=\"4 Stars & Up\"]")
	private WebElement starrating;

	@FindBy(xpath = "//span[text()=\"₹1,000 - ₹5,000\"]")
	private WebElement filterbyprice;

	@FindBy(xpath = "(//div//span[text()=\"Puma\"])[2]")
	private WebElement pumabox;

	@FindBy(xpath = "//div//span[text()=\"Allen Solly\"]")
	private WebElement allensollybox;

	@FindBy(xpath = "//span[text()=\"M.R.P: \"]")
	private List<WebElement> secondproduct;

	@FindBy(xpath = "//input[@title=\"Add to Shopping Cart\"]")
	private WebElement addtocart;

	@FindBy(xpath = "//div[@data-feature-id='proceed-to-checkout-label']")
	private WebElement checkout_btn;

	
	
	public List<WebElement> getsecondproduct() {
		return secondproduct;
	}

	public void openMensFashion() {
		selectelemnet(driver, select_all);
		scrollview(mensfashion);
		selectelemnet(driver, mensfashion);
		javascript(mensfashion1);
	}

	public void filterstar() {
		selectelemnet(driver, starrating);
	}

	public void filterprice() {
		selectelemnet(driver, filterbyprice);
	}

	public void brandselection() {
		selectelemnet(driver, pumabox);
		selectelemnet(driver, allensollybox);

	}
	public void addingtocart(){
		windowhandles();
		selectelemnet(driver, addtocart);
		 
	 }
	
	public int getNumberOfProductsInCart() {
	return Integer.parseInt(String.valueOf(text(driver, checkout_btn).trim().charAt(16)));	
	}

}
