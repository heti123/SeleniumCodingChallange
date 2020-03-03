package com.Zoopla.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoopla.qa.base.TestBase1;

public class AgentPage extends TestBase1 {
	
	@FindBy(xpath="//h1[@class=\"bottom-half\"]//child::b[1]")
	WebElement agentName;
	
	@FindBy(xpath="(//span[@class='agent_phone'])[2]")
	WebElement agentPhone;
	
	public AgentPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	 public String getAgentName() {
		return agentName.getText();
	 }
	 
	 public String getAgentPhone() {
		 return agentPhone.getText();
	 }
}
