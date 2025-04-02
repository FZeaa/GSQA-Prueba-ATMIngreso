Feature: GSQA - Prueba - ATM - Ingreso

Background: Set up test environment
  Given I am on Latam Airlines homepage
  And I click in the "Close login incentive" button

Scenario: Verify if the "Ofertas de Vuelos" redirect to the offers Page
  When I click in the "Ofertas y destinos" button
  And I click in the "Ofertas de vuelos" button
  Then I should redirect to the offers Page
  And The Latam Packages image should be displayed

Scenario Outline: Verify if the destination text field show the error message
  When I search for a flight from "<City>"
  And I select a random date
  And I click in the "Buscar Vuelos" button
  Then I should be able to see the error message in the Destination text field

  Examples:
  | City     |
  | Medellin |
  | Bogota   |

Scenario: aaa
  When I click in the "Solo Ida" button
  And The tab flight should be display
  Then I should not see a return date text fiel