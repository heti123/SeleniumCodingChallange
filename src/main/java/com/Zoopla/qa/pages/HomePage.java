package com.Zoopla.qa.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoopla.qa.base.TestBase1;

public class HomePage extends TestBase1{
	
	
	@FindBy(xpath="//h1[contains(text(),'Property for sale in')]")
	WebElement propertyLabel;
	
	@FindBy(xpath="//ul[contains(@class,'listing-results')]//li[contains(@class,'srp clearfix')]//a[contains(@class,'listing-results-price')]")
	WebElement propertyPriceList;
	
	@FindBy(xpath="(//ul[contains(@class,'listing-results')]//li[contains(@class,'srp clearfix')]//a[contains(@class,'listing-results-price')])[5]")
	WebElement propertyPrice;
	
	@FindBy(xpath="(//p[@class='top-half listing-results-marketed'])[4]")
	WebElement propertyPrice6;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle() {
		 return driver.getTitle();
	}
	public boolean validateHomePageLabel() {
		 return propertyLabel.isDisplayed();
	 }
	//public void listofPropertyPrice() {
	   // Dimension total = propertyPriceList.getSize();
		//for(int i=1;i=>total;i++)
			//System.out.println(propertyPriceList.getText());

	 
	public PropertyPage clickOnPropertyPrice() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",propertyPrice6);
		propertyPrice.click();
		return new PropertyPage();
		 
	 }
}
	 