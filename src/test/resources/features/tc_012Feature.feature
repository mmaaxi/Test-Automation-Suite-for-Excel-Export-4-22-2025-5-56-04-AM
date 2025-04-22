Feature: Validar renombrado de columna de 'Status de Pago' a 'Descripción Status Pago'

  Scenario: Renombrado de columna en archivo Excel exportado
    Given I have exported the Excel file
    When I verify the column 'Status de Pago' is renamed to 'Descripción Status Pago'
    Then the renaming should match the specification