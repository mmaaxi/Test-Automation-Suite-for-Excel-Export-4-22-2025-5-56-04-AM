Feature: Validar incorporación de columna 'IVA 0%'

  Scenario: Exportar Excel y verificar la columna 'IVA 0%'
    Given el usuario exporta el Excel
    When se exporta el Excel correctamente
    Then se muestra la columna 'IVA 0%' con los montos aplicables