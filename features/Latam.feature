Feature: GSQA - Prueba - ATM - Ingreso

Background: Set up test environment
  Given I am on Latam Airlines homepage

Scenario: Verify If the "Ofertas de Vuelos" redirect to the offers Page
  When I Click in the "Ofertas y destinos" button
  And I Click in the "Ofertas de vuelos" button
  Then I should redirect to the offers Page
  And The Latam Packages image should be displayed

