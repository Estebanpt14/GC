Feature: Crear la busqueda en Google

Scenario: Busco algo en Google
    Given Navego por Google
    When Busco algo
    Then Obtengo resultados