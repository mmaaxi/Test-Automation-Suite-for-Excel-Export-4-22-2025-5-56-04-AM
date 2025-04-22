Feature: Incorporación de columna 'IVA exento' en el reporte Excel

  Scenario: Validar incorporación de columna 'IVA exento'
    Given El usuario está en la página de exportaciones
    When El usuario exporta el Excel
    Then El Excel se exporta correctamente
    And La columna 'IVA exento' se muestra con los datos correspondientes