
  Feature: Test acciones en un pagina

    Scenario: Probando diferentes acciones en una pagina sandbox
      Given Navegando en sandbox page
      And Seleccionando un valor de un dropdown

    @Test
    Scenario: Como usuario, quiero obtener el valor de una grilla estatica
      Given Navegando en la grilla statica
      Then Puedo tommar el valor que quiera