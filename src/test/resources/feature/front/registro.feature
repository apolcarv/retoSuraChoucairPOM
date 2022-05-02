Feature: Crear cuenta para el portal web automationpractice


  @Registro_exitoso
  Scenario Outline: 001- Creacion de una cuenta para el porta web AutomationPractice
    Given que el usuario ingresa a la pagina web para la creacion de una cuenta en automationpractice "<ESCENARIO>" "<FUNCIONALIDAD>"
    When ingresa el modulo de registro y llena todo el formulario de datos personas y direccion
    Then el usuario crea su cuenta automationpractice con exito

    Examples:
      | ESCENARIO             | FUNCIONALIDAD                                                |
      | 001- CREAR UNA CUENTA | CREACION DE UNA CUENTA PARA EL PORTAL WEB AUTOMATIONPRACTICE |