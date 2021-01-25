package com.steps;

import com.pages.CommonPageObject;
import com.pages.PublicPlacePageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PublicPlacePageStep extends ScenarioSteps{

	private static final long serialVersionUID = 1L;
	PublicPlacePageObject publicPlacePage;
	CommonPageObject commonPageObject;
	
	@Step("Play the public place game with correct answer")
	public void playPublicGameCorrectAnswer() {
		publicPlacePage.getRestaurantStart().click();
		publicPlacePage.getrestaurantAnswer1().click();
		commonPageObject.getTryNextBattle().click();
		
}
	@Step("Play the public place game with incorrect answer")
	public void playPublicGameInCorrectAnswer() {
		publicPlacePage.getRestaurantStart().click();
		publicPlacePage.getrestaurantAnswer1().click();
		commonPageObject.getInCorrectAnswerModal().click();
	}
	
	@Step("Play the public place game and do not select an answer")
	public void playPublicGameNoAnswer() {
		publicPlacePage.getRestaurantStart().click();
		if(commonPageObject.getTryAgainModal().isDisplayed()) {
			commonPageObject.getTryAgainModal().click();
		}
	}
}
