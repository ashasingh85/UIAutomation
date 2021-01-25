Feature: User plays the COVID-19 game 
Background: 
	Given user launch the webSite
	
	
Scenario: User launch the covidGame and play it with correct answer 
	When start the journey of correct answer as "user"	
	Then user landed on The Battlefield page
	When user start the game and provide correct answer 
	Then successfully finish the game and navigated to leaderBoard page 
	
Scenario: User launch the covidGame and play it with incorrect answer 
	When start the journey of incorrect answer as "user"
	Then user landed on The Battlefield page
	When user start the game and provide incorrect answer 
	Then Try again modal displayed 

Scenario: User launch the covidGame and do not provide an answer 
	When start the journey of incomplete game as "user"
	Then user landed on The Battlefield page 
	When user start the game and provide no answer 
	Then TimeOut modal displayed
	
Scenario: User launch the all game and play it with correct answer 
	When start the journey of complete small game as "user"
	Then user landed on The Battlefield page
	When user start the all game and provide correct answer 
	Then successfully finish each game and navigated to leaderBoard page