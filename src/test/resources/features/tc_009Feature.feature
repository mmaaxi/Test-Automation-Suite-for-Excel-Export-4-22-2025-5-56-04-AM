Feature: Validar actualización en la fórmula de 'Monto Acumulado Folio OPC (2121)' para movimientos de pago

  Scenario: Exportar Excel y verificar actualización de fórmula
    Given el usuario ha iniciado sesión y está en la página de movimientos de pago
    When el usuario exporta el Excel y realiza un movimiento de pago
    Then el Excel se exporta correctamente
    And la fórmula de 'Monto Acumulado Folio OPC (2121)' debe incluir la suma: Z4+AD5+AE5+AH5+AC5+AB5+AM5