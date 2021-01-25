package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class BattleFieldGamePageObject extends PageObject {

	@FindBy(xpath = "//p[@class='alpha-heading']")
	private WebElement theGameLogo;
	@FindBy(id = "news")
	private WebElement areYouGame;
	@FindBy(id = "bus")
	private WebElement takeTheBus;
	@FindBy(id = "restaurant")
	private WebElement publicPlace;
	@FindBy(id = "office")
	private WebElement goToOffice;
	

	public WebElement getTheGameLogo() {
		return theGameLogo;
	}
	public WebElement getaAreYouGame() {
		return areYouGame;
	}
	public WebElement getTakeTheBus() {
		return takeTheBus;
	}
	public WebElement getPublicPlace() {
		return publicPlace;
	}
	public WebElement getGoToOffice() {
		return goToOffice;
	}


	



}
