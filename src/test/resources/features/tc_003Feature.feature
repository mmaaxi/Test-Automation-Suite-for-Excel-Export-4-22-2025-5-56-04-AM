Feature: Validar actualización de campos en la columna "estado"

  Scenario: Verificar actualización y exportación de datos en la columna "estado"
    Given El usuario está en la página de gestión de documentos
    When El usuario exporta el documento Excel
    Then El Excel se exporta correctamente
    And Los datos en la columna 'estado' han sido actualizados según los requerimientos