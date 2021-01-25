package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class HomePageObject extends PageObject {
	

	@FindBy(id="worrior_username")
	private WebElement warriorName;
	@FindBy(xpath="/html/body/row[3]/div/div/a[1]")
	//@FindBy(xpath="//*[contians(text(),'Create warrior')]")
	//@FindBy(css="a#warrior")
	private WebElement createWarriorButton;
	@FindBy(id="start")
	private WebElement startYourJourney;
	


	
    public WebElement getWarriorName() {
		return warriorName;
	}
    public WebElement getCreateWarriorButton() {
		return createWarriorButton;
	}
    public WebElement getStartYourJourney() {
		return startYourJourney;
	}


	
 
    
}





