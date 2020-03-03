package com.Zoopla.qa.pages;

import java.util.List;

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
	List<WebElement> propertyList;
	
	@FindBy(xpath="(//ul[contains(@class,'listing-results')]//li[contains(@class,'srp clearfix')]//a[contains(@class,'listing-results-price')])[5]")
	WebElement selectfifthproperty;
	
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
	public void printPropertyDesc() {
	
	}
	  
	 
	public PropertyPage clickOnPropertyPrice() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",propertyPrice6);
		selectfifthproperty.click();
		return new PropertyPage();
		 
	 }
}
	 