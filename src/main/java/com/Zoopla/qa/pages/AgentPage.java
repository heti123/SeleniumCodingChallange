package com.Zoopla.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoopla.qa.base.TestBase1;

public class AgentPage extends TestBase1 {
	
	@FindBy(xpath="//img[@class='agent_logo']")
	WebElement agentLogo;
	
	@FindBy(xpath="(//span[@class='agent_phone'])[2]")
	WebElement agentPhone;
	
	public AgentPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	 public boolean verifyagentLogo() {
		return agentLogo.isDisplayed();
	 }
	 
	 public String verifyAgentPhone() {
		 return agentPhone.getText();
	 }
}
