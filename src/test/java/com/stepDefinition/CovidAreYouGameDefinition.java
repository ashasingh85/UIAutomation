package com.stepDefinition;

import com.steps.HomePageStep;
import com.steps.OfficePageStep;
import com.steps.PublicPlacePageStep;
import com.steps.TakeTheBusPageStep;
import com.steps.CommonPageStep;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.steps.AreYouGamePageStep;
import com.steps.BattleFieldGamePageStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class CovidAreYouGameDefinition {
	@Managed
	WebDriver driver;
	@Steps
	HomePageStep homeStep;
	@Steps
	BattleFieldGamePageStep BattleFieldGameStep;
	@Steps
	AreYouGamePageStep AreYouGameStep;
	@Steps
	CommonPageStep commonStep;
	@Steps
	TakeTheBusPageStep takeTheBusStep;
	@Steps
	PublicPlacePageStep publicPlaceStep;
	@Steps
	OfficePageStep officeStep;

	public void scrollToBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	@Given("^user launch the webSite$")
	public void user_launch_the_website() throws Throwable {
		homeStep.lanuchBrowser();
	}

	@When("start the journey of correct answer as {string}")
	public void start_the_journey_of_correct_answer_as(String string) {
		scrollToBottom();
		homeStep.startYourJourney("journal");

	}

	@Then("user landed on The Battlefield page")
	public void user_landed_on_the_battlefield_page() {
		BattleFieldGameStep.verifyBattlefieldPage();
	}

	@When("user start the game and provide correct answer")
	public void user_start_the_game_and_provide_correct_answer() {
		BattleFieldGameStep.startTheGame();
		AreYouGameStep.playGameCorrectAnswer();
	}

	@Then("^successfully finish the game and navigated to leaderBoard page$")
	public void successfully_finish_the_game_and_navigated_to_leaderboard_page() throws Throwable {
		commonStep.leaderBoardPage();
	}

	@When("^start the journey of incorrect answer as \"([^\"]*)\"$")
	public void start_the_journey_of_incorrect_answer_as_something(String strArg1) throws Throwable {
		scrollToBottom();
		homeStep.startYourJourney("Illuminate");
	}

	@When("user start the game and provide incorrect answer")
	public void user_start_the_game_and_provide_incorrect_answer() {
		BattleFieldGameStep.startTheGame();
		AreYouGameStep.playGameInCorrectAnswer();
	}

	@Then("^Try again modal displayed$")
	public void try_again_modal_displayed() throws Throwable {
		commonStep.tryAgainModalDisplayed();
	}

	@When("^start the journey of incomplete game as \"([^\"]*)\"$")
	public void start_the_journey_of_incomplete_game_as_something(String strArg1) throws Throwable {
		scrollToBottom();
		homeStep.startYourJourney("Reco");
	}

	@When("user start the game and provide no answer")
	public void user_start_the_game_and_provide_no_answer() {
		AreYouGameStep.playGameNoAnswer();
	}

	@Then("^TimeOut modal displayed$")
	public void timeout_modal_displayed() throws Throwable {
		commonStep.timeOutModalDisplayed();
	}

	@When("^start the journey of complete small game as \"([^\"]*)\"$")
	public void start_the_journey_of_complete_small_game_as_something(String strArg1) throws Throwable {
		scrollToBottom();
		homeStep.startYourJourney("fantom");
	}

	@When("user start the all game and provide correct answer")
	public void user_start_the_all_game_and_provide_correct_answer() {
		BattleFieldGameStep.takeTheBus();
		takeTheBusStep.playBusGameCorrectAnswer();
	//	commonStep.tryNextBattle();
		publicPlaceStep.playPublicGameCorrectAnswer();
	//	commonStep.tryNextBattle();
		officeStep.playOfficeGameCorrectAnswer();
	}

	@Then("^successfully finish each game and navigated to leaderBoard page$")
	public void successfully_finish_each_game_and_navigated_to_leaderboard_page() throws Throwable {
		commonStep.clickFinalScore();
		commonStep.leaderBoardPage();
	}

}
