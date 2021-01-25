package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PublicPlacePageObject extends PageObject {

	@FindBy(id = "restaurant_timer_start")
	private WebElement restaurantStart;
	@FindBy(id = "restaurant_answer_1")
	private WebElement restaurantAnswer1;
	@FindBy(id = "restaurant_answer_2")
	private WebElement restaurantAnswer2;

	public WebElement getRestaurantStart() {
		return restaurantStart;
	}

	public WebElement getrestaurantAnswer1() {
		return restaurantAnswer1;
	}

	public WebElement getrestaurantAnswer2() {
		return restaurantAnswer2;
	}

}
