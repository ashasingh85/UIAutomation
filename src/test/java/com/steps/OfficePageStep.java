package com.steps;

import com.pages.CommonPageObject;
import com.pages.OfficePageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class OfficePageStep extends ScenarioSteps{

	private static final long serialVersionUID = 1L;
	OfficePageObject officePage;
	CommonPageObject commonPageObject;
	
	@Step("Play the office game with correct answer")
	public void playOfficeGameCorrectAnswer() {
		officePage.getOfficeStart().click();
		officePage.getOfficeAnswer1().click();
		
		
}
	@Step("Play the office game with incorrect answer")
	public void playOfficeGameInCorrectAnswer() {
		officePage.getOfficeStart().click();
		officePage.getOfficeAnswer2().click();
		commonPageObject.getInCorrectAnswerModal().click();
	}
	
	@Step("Play the office game and do not select an answer")
	public void playOfficeGameNoAnswer() {
		officePage.getOfficeStart().click();
		if(commonPageObject.getTryAgainModal().isDisplayed()) {
			commonPageObject.getTryAgainModal().click();
		}
	}
}
