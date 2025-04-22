Feature: Validar exportación de Excel y formato de llave en Columna C

  Scenario: Exportar 'Claim Accounting Report' y verificar columna llave
    Given que el usuario se encuentra en la página de reportes
    When el usuario exporta el documento Excel 'Claim Accounting Report'
    Then el sistema exporta el Excel correctamente
    And la columna C contiene la llave concatenada como 'No. Siniestro_No. De autorización_status_tipo de mov_no. De movimiento'