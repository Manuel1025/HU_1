@test
Feature: Ver diferentes categorias de productos

  Yo como gerente de marketing de  Demonecesito implementar un portal web en el que se exhiban diferentes productos de tecnologia por categoria
  para la compra de articulos online y asi poder saber la tendencia de los articulos de tecnologia que tienen mayor demanda


  Scenario: el usuario deberia  poder ver las diferentes categorias de productos
    Given que el usuario ingresa a la pagina de inicio
    When carga el contenido
    Then deberia poder ver las diferentes categoria




  Scenario: el usuario deberia ver diferentes espacios publicitarios
    Given que el usuario esta en la seccion home de la pagina
    When carga el cuerpo  de la pagina
    Then deberia poder ver espacios de publicidad



  Scenario: el usuario deberia ver diferentes opciones en el menu
    Given que el usuario esta en el inicio del portal
    When carga la cabecera de la pagina
    Then el usuario deberia poder ver diferentes opciones en el menu