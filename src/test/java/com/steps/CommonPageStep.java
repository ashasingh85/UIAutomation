package com.steps;

import static org.junit.Assert.assertEquals;

import com.pages.CommonPageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class CommonPageStep extends ScenarioSteps {
	private static final long serialVersionUID = 1L;
	CommonPageObject commonPage;

	@Step("leader board page  displayed")
	public void leaderBoardPage() {
		assertEquals(true, commonPage.getLeaderBoardPage().isDisplayed());
	}
	@Step(" Try Again Modal displayed")
	public void tryAgainModalDisplayed() {
		//assertEquals(true,commonPage.getTryAgainModal().isDisplayed());
		commonPage.getTryAgainModal().click();
	}
	@Step(" Incorrect Answer Modal displayed")
	public void timeOutModalDisplayed() {
		assertEquals(true,commonPage.getInCorrectAnswerModal().isDisplayed());
		commonPage.getInCorrectAnswerModal().click();
	}
	@Step(" Try Next Battle Modal displayed")
	public void tryNextBattle() {
		assertEquals(true,commonPage.getInCorrectAnswerModal().isDisplayed());
		commonPage.getTryNextBattle().click();
	}
	@Step(" Click on Check on your final Score")
	public void clickFinalScore() {
		commonPage.getfinalScoreLink().click();
	}

}
