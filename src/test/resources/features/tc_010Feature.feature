Feature: Validar incorporación de columnas en el reporte de Excel

  Scenario: Verificar exportación de Excel con columnas específicas
    Given el usuario está en la página de reportes
    When el usuario exporta el Excel
    Then el Excel se exporta correctamente
    And las columnas 'Folio Pre solicitud' y 'Folio de Pago' deberían estar presentes en la posición indicada sin valores asignados