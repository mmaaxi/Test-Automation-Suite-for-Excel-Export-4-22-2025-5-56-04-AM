Feature: Validar inserción de columna 'Status Pago Código'

  @exportarExcel
  Scenario: Exportar el Excel y verificar la nueva columna
    Given el usuario está en la página de exportación de Excel
    When el usuario exporta el Excel
    Then se exporta el Excel correctamente

  @verificarColumna
  Scenario: Verificar inserción de columna 'Status Pago Código'
    Given el usuario abre el Excel exportado
    When el usuario verifica la columna 'Status Pago Código'
    Then la columna se muestra en la posición correcta sin valores asignados inicialmente