Feature: Add product to wishList and Remove it

Scenario: Add to WishList and Remove

Given User in the HomePage
When User login to Account
And User adds product to wishlist
And user remove from wishlist
Then User will see empty wishList message