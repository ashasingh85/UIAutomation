package com.steps;

import com.pages.CommonPageObject;
import com.pages.TakeTheBusPageObject;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class TakeTheBusPageStep extends ScenarioSteps{

	private static final long serialVersionUID = 1L;
	TakeTheBusPageObject takeTheBusPage;
	CommonPageObject commonPageObject;
	
	@Step("Play the bus game with correct answer")
	public void playBusGameCorrectAnswer() {
		takeTheBusPage.getBusStart().click();
		takeTheBusPage.getBusAnswer1().click();
		commonPageObject.getTryNextBattle().click();
		
}
	@Step("Play the Bus game with incorrect answer")
	public void playBusGameInCorrectAnswer() {
		
		takeTheBusPage.getBusStart().click();
		takeTheBusPage.getBusAnswer2().click();
		commonPageObject.getInCorrectAnswerModal().click();
	}
	
	@Step("Play the Bus game and do no select an answer")
	public void playBusGameNoAnswer() {
		takeTheBusPage.getBusStart().click();
		if(commonPageObject.getTryAgainModal().isDisplayed()) {
			commonPageObject.getTryAgainModal().click();
		}
	}
	

}
