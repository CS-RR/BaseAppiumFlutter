
Feature: App Flutter App
  Yo como usuario deseo hacer uso de una app en flutter

  @scenario2
  Scenario: Login aplicacion de flutter
    Given Laura se autentica en su app
      | username | password |
      | company  | company  |

  @scenario3
  Scenario: Uso boton incremento en aplicacion de flutter
    Given Laura abré la app.
    When Hace uso del boton incrementar.
    Then El contador llegar a 10 y termina.

