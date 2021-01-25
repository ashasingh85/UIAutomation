package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class AreYouGamePageObject extends PageObject {

	@FindBy(id="start")
	private WebElement startButton;
	@FindBy(xpath="//button[@id='close_modal_btn_2']")
	private WebElement tryAgainButton;
	@FindBy(id="answer_1")
	private WebElement answer1;
	@FindBy(id="answer_2")
	private WebElement answer2;
	@FindBy(xpath="//*[@id='continue']")
	//*[@id="continue"]
	private WebElement continueButton;
	@FindBy(id="close_modal_btn_2")
	private WebElement tryAgainModal;
	
	public WebElement getStartButton() {
		return startButton;
	}
	public WebElement getTryAgainButton() {
		return tryAgainButton;
	}
	public WebElement getAnswer1() {
		return answer1;
	}
	public WebElement getAnswer2() {
		return answer2;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	public WebElement getTryAgainModal() {
		return tryAgainModal;
	}

	

}
