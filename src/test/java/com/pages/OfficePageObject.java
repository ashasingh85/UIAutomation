package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class OfficePageObject extends PageObject {

	@FindBy(id = "start")
	private WebElement officeStart;
	@FindBy(id = "office_answer_1")
	private WebElement officeAnswer1;
	@FindBy(id = "office_answer_2")
	private WebElement officeAnswer2;

	public WebElement getOfficeStart() {
		return officeStart;
	}

	public WebElement getOfficeAnswer1() {
		return officeAnswer1;
	}

	public WebElement getOfficeAnswer2() {
		return officeAnswer2;
	}
}
