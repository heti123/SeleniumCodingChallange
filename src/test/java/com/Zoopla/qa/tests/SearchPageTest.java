package com.Zoopla.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Zoopla.qa.base.TestBase1;
import com.Zoopla.qa.pages.HomePage;
import com.Zoopla.qa.pages.SearchPage;

public class SearchPageTest extends TestBase1 {
	
	SearchPage searchpage;
	HomePage homepage;
	
	public SearchPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		Initialization();
		searchpage=new SearchPage();
	}
	

	@Test(priority=1)
	public void searchPageTitleTest() {
		String title = searchpage.validateSearchPageTitle();
		Assert.assertEquals(title,"Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents");
	}
	
	@Test(priority=2)
	public void zooplaLogoTest() {
		Assert.assertTrue(searchpage.validateZooplaLogo());
	}
	
	@Test(priority=3)
	public void searchFieldTest() {
	 homepage=searchpage.validateSearchField("London");
    
    }
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	

}
