package com.Zoopla.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Zoopla.qa.base.TestBase1;
import com.Zoopla.qa.pages.AgentPage;
import com.Zoopla.qa.pages.HomePage;
import com.Zoopla.qa.pages.PropertyPage;
import com.Zoopla.qa.pages.SearchPage;

public class PropertyPageTest extends TestBase1 {
	
	PropertyPage propertypage;
	SearchPage searchpage;
	AgentPage agentpage;
	HomePage homepage;
	
	public PropertyPageTest() {
	super();
	}
	
	@BeforeMethod
	public void setUp() {
		Initialization();
		searchpage=new SearchPage();
		homepage=new HomePage();
		homepage=searchpage.validateSearchField("London");
        propertypage=homepage.clickOnPropertyPrice();
		
		}
	@Test(priority=1)
	public void agentLogoTest() {
        Assert.assertTrue(propertypage.validateAgentLogo());
        }
	@Test(priority=2)
	public void agentNameTest() {
		agentpage=propertypage.validateAgentname();
		}
	@Test(priority=3)
	public void agentPhoneNoTest() {
		Assert.assertTrue(propertypage.validateAgentPhoneNo());
	   }
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
