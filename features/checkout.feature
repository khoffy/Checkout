Feature: Checkout
	Scenario: Checkout a banana
		Given the price of a "banana" is 40c
		When I chekout 1 "banana"
		Then the total price should be 40c
	
