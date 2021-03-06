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

public class AgentPageTest extends TestBase1 {
	PropertyPage propertypage;
	SearchPage searchpage;
	AgentPage agentpage;
	HomePage homepage;
	
	public AgentPageTest() {
	super();
	}
	
	@BeforeMethod
	public void setUp() {
		Initialization();
		searchpage=new SearchPage();
		homepage=new HomePage();
		propertypage=new PropertyPage();
		agentpage=new AgentPage();
		homepage=searchpage.validateSearchField("London");
        propertypage=homepage.clickOnPropertyPrice();
        agentpage=propertypage.validateAgentname();
		}
	
	@Test
	public void agentNameVerifyTest() {
		System.out.println(agentpage.getAgentName());
		
	}
	
	@Test(priority=1)
	public void agentPhoneTest() {
		System.out.println(agentpage.getAgentPhone());
	}
	
	@AfterMethod
	public void tearDown() {
	  driver.quit();
	}

}
