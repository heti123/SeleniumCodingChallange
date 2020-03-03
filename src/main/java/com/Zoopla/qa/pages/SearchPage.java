package com.Zoopla.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Zoopla.qa.base.TestBase1;

public class SearchPage extends TestBase1 {
	        
			//Page Factory OR
			@FindBy(id="search-input-location")
			WebElement searchfield;
			
			@FindBy(xpath="//li[@tabindex='-1'][2]")
			WebElement searchCity;
			
			@FindBy(xpath="//button[text()='Search']")
			WebElement searchBtn;
			
			@FindBy(className="icon--logo")
			WebElement zooplaLogo;
			
			public SearchPage() {
				PageFactory.initElements(driver, this);
				
			}
			
			//Actions
			
			public String validateSearchPageTitle() {
				return driver.getTitle();
			}
			
			public  boolean validateZooplaLogo() {
				return zooplaLogo.isDisplayed();
			}
			
			public HomePage validateSearchField(String searchtext)  {
				WebDriverWait wait=new WebDriverWait(driver,10);
	            wait.until(ExpectedConditions.visibilityOf(searchfield));
	            String location= prop.getProperty("Location");
	            searchfield.sendKeys(location);
				searchBtn.click();
		        return new HomePage();
				
			}
			
			
			

	}
		    


