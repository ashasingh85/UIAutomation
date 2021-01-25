package com.steps;

import com.pages.HomePageObject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@DefaultUrl("https://www.seleniumeasy.com/test/")
public class HomePageStep extends ScenarioSteps {
	private static final long serialVersionUID = 1L;
	HomePageObject homePage;

	@Step("Launch Browser")
	public void lanuchBrowser() {
		homePage.open();
	}

	@Step("Start the Covid-19 Journey")
	public void startYourJourney(String name) {
		homePage.getWarriorName().sendKeys(name);
		homePage.getCreateWarriorButton().click();
		homePage.getStartYourJourney().click();
	}



}
