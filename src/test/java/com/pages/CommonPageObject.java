package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class CommonPageObject extends PageObject {

	@FindBy(id = "leaderboard_link")
	private WebElement finalScoreLink;
	@FindBy(id = "close_incorrect_modal_btn")
	private WebElement inCorrectAnswerModal;
	@FindBy(xpath = "//button[@class='btn btn-secondary']")
	private WebElement tryAgainModal;
	@FindBy(id = "close_correct_modal_btn")
	private WebElement tryNextBattle;
	@FindBy(xpath = "//*[contains(text(),'COVID-19 THE GAME - LEADERBOARD')]")
	private WebElement leaderBoardPage;

	public WebElement getLeaderBoardPage() {
		return leaderBoardPage;
	}

	public WebElement getfinalScoreLink() {
		return finalScoreLink;
	}

	public WebElement getInCorrectAnswerModal() {
		return inCorrectAnswerModal;
	}

	public WebElement getTryAgainModal() {
		return tryAgainModal;
	}
	public WebElement getTryNextBattle() {
		return tryNextBattle;
	}

}
