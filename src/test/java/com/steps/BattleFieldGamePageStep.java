package com.steps;

import static org.junit.Assert.assertEquals;

import com.pages.BattleFieldGamePageObject;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BattleFieldGamePageStep extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	BattleFieldGamePageObject battleFieldGamePage;

	@Step("Verify the logo")
	public void verifyBattlefieldPage() {
		assertEquals("COVID-19 THE GAME", battleFieldGamePage.getTheGameLogo().getText());

	}

	@Step("The game should start")
	public void startTheGame() {
		battleFieldGamePage.getaAreYouGame().click();

	}

	@Step("Take the bus")
	public void takeTheBus() {
		battleFieldGamePage.getTakeTheBus().click();
		

	}

	@Step("Go to public place")
	public void goToPublicPlace() {
		battleFieldGamePage.getGoToOffice().click();
	}

	@Step("Go to Office")
	public void goToOffice() {
		battleFieldGamePage.getGoToOffice().click();
	}

}
