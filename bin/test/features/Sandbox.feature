
  Feature: Test acciones en un pagina

    Scenario: Probando diferentes acciones en una pagina sandbox
      Given Navegando en sandbox page
      And Seleccionando un valor de un dropdown

      @Imagen
    Scenario: Como usuario, quiero subir una imagen
      Given Navegando por una pagina web
      And Dar click en subir imagen
      When Subo la imagen
      Then la imagen se sube a la pagina web

