
  Feature: Test acciones en un pagina

    Scenario: Probando diferentes acciones en una pagina sandbox
      Given Navegando en sandbox page
      And Seleccionando un valor de un dropdown

    Scenario: Como usuario, quiero obtener el valor de una grilla estatica
      Given Navegando en la grilla statica
      Then Puedo tomar el valor que quiera

    @Test
    Scenario: Como tester, quiero verificar la existencia de una tabla
      Given Testeando una pagina web
      Then Verifico la existencia de una tabla