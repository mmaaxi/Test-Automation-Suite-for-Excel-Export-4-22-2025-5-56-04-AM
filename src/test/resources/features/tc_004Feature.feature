Feature: Validar incorporación de columna 'Monto acumulado Folio Reserva 5401'

  Scenario: Exportar Excel e insertar columna 'Monto acumulado Folio Reserva 5401'
    Given el usuario está en la página de exportación
    When el usuario exporta el Excel
    Then el Excel se exporta correctamente
    When el usuario verifica la columna 'Monto acumulado Folio Reserva 5401'
    Then la columna se muestra correctamente con la fórmula adecuada