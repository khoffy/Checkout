Feature: Checkout
	Scenario: Checkout a banana
		Given the price of a "banana" is 40 c
		When I checkout 1 "banana"
		Then the total price should be 40 c
	
