package com.steps;

import static org.junit.Assert.assertEquals;

import com.pages.AreYouGamePageObject;
import com.pages.CommonPageObject;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AreYouGamePageStep extends ScenarioSteps{

	private static final long serialVersionUID = 1L;
	AreYouGamePageObject areYouGamePage;
	CommonPageObject commonPageObject;
	@Step("Play the game with correct answer")
	public void playGameCorrectAnswer() {
		
		areYouGamePage.getStartButton().click();
		//1st question
		areYouGamePage.getAnswer1().click();
		areYouGamePage.getContinueButton().click();
		//2nd question
		areYouGamePage.getAnswer1().click();
		areYouGamePage.getContinueButton().click();
		//3rd question
		areYouGamePage.getAnswer1().click();
		areYouGamePage.getContinueButton().click();
		//4th question
		areYouGamePage.getAnswer2().click();
		areYouGamePage.getContinueButton().click();
		//5th question
		areYouGamePage.getAnswer1().click();
		areYouGamePage.getContinueButton().click();
		//6th question
		areYouGamePage.getAnswer2().click();
		areYouGamePage.getContinueButton().click();
		//7th question
		areYouGamePage.getAnswer1().click();
		areYouGamePage.getContinueButton().click();
		//8th question
		areYouGamePage.getAnswer2().click();
		areYouGamePage.getContinueButton().click();
		//9th question
		areYouGamePage.getAnswer2().click();
		areYouGamePage.getContinueButton().click();
		//10th question
		areYouGamePage.getAnswer1().click();
		areYouGamePage.getContinueButton().click();
		//11th question
		areYouGamePage.getAnswer1().click();
		areYouGamePage.getContinueButton().click();

	}
	@Step("Play the game with incorrect answer")
	public void playGameInCorrectAnswer() {
		
		areYouGamePage.getStartButton().click();
		//1st question
		areYouGamePage.getAnswer2().click();
		
	}
	
	@Step("Play the game with no answer")
	public void playGameNoAnswer() {
		areYouGamePage.getStartButton().click();
	}
	

	
	
}
