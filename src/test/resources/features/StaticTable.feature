@Grid
Feature: Test acciones en una static table

  Rule:The user can return from the table and validate them.

  Background: Navigate to table web app
    Given Navegando en la grilla statica

    @Smoke @Regression
  Scenario: Como usuario, quiero obtener el valor de una grilla estatica
  Then Puedo tomar el valor que quiera

      @Regression
  Scenario: Como tester, quiero verificar la existencia de una tabla
  Then Verifico la existencia de una tabla