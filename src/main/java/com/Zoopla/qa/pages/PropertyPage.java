package com.Zoopla.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zoopla.qa.base.TestBase1;

public class PropertyPage extends TestBase1 {
	
	@FindBy(xpath="//div[@class='ui-agent__logo']//img[@class='js-lazy-loaded']")
	WebElement agentLogo;
	
	@FindBy(xpath="(//h4[@class=\"ui-agent__name\"])[1]")
	WebElement agentName;
	
	@FindBy(xpath="(//p[@class=\"ui-agent__tel ui-agent__text\"])[1]//a[@class=\"ui-link\"]")
	WebElement agentPhoneNo;
	
	public PropertyPage() {
		PageFactory.initElements(driver, this);
	}
	
	public Boolean validateAgentLogo() {
		return agentLogo.isDisplayed();
		
		}
	public AgentPage validateAgentname() {
		 System.out.println(agentName.getText());
		 agentName.click();
		 return new AgentPage();
	}
	
	public Boolean validateAgentPhoneNo() {
        System.out.println(agentPhoneNo.getText());
        return agentPhoneNo.isDisplayed();
		 
	}
	
	

}
