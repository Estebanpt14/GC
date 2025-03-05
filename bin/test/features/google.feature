Feature: Crear la busqueda en Google

Scenario: Busco algo en Google
    Given Navego por Google
    When Escribo el texto
    And Presiono enter
    Then Obtengo resultados