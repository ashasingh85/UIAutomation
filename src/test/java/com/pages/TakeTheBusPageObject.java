package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class TakeTheBusPageObject extends PageObject {

	@FindBy(id = "bus_timer_start")
	private WebElement busStart;
	@FindBy(id = "bus_answer_1")
	private WebElement busAnswer1;
	@FindBy(id = "bus_answer_1")
	private WebElement busAnswer2;

	public WebElement getBusStart() {
		return busStart;
	}

	public WebElement getBusAnswer1() {
		return busAnswer1;
	}

	public WebElement getBusAnswer2() {
		return busAnswer2;
	}

}
