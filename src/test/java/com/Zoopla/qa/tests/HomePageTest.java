package com.Zoopla.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Zoopla.qa.base.TestBase1;
import com.Zoopla.qa.pages.HomePage;
import com.Zoopla.qa.pages.PropertyPage;
import com.Zoopla.qa.pages.SearchPage;

public class HomePageTest extends TestBase1 {
	 SearchPage searchpage;
	 HomePage homepage;
	 PropertyPage propertypage;
	
	 public HomePageTest() {
     super();
    }
	
	@BeforeMethod
	public void setUp() {
		Initialization();
        searchpage=new SearchPage();
        homepage=searchpage.validateSearchField("London");
       }
	
	@Test(priority=1)
	public void homePageTitleTest() {
		String title = homepage.verifyHomePageTitle();
	    Assert.assertEquals(title, "Property for Sale in London - Buy Properties in London - Zoopla");
	}
	
	@Test(priority=2)
	public void homePageLabelTest() {
	 Assert.assertTrue(homepage.validateHomePageLabel());
		
	}
	
	@Test(priority=3)
	public void propertyPriceTest(){
		propertypage=homepage.clickOnPropertyPrice();
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
}