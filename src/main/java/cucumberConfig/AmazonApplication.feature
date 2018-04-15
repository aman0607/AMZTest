Feature: Amazon shopping cart
  Description: Test the application login and product checkout

  @RegressionTest
  Scenario: Login into the Amazon web application
    Given  User is on the main webpage
    When   User enters valid email and password
    Then   User is presented with the homepage

   @RegressionTest
   Scenario: Choose a product and add to cart
     Given User is on the homepage
     When  User search for the product
     And   Selects the product
     Then  Adds the product to the cart

#  @RegressionTest
#   Scenario: User selects type of shipping
#     Given User is on the checkout page
#     When  User clicks on type of checkout
#     Then  Shows the shipping method
#
#  @RegressionTest
#  Scenario: User selects payment method
#    Given  User is on the checkout page
#    When   User clicks on payment method
#    Then   User is displayed the payment options
#    And    User selects the payment option
#
#  @RegressionTest
#  Scenario: User submits the order
#    Given  User is on the checkout page
#    When   User clicks on submit
#    Then   Confirmation page is displayed


