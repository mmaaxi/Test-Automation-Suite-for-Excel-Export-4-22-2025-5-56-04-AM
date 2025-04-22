Feature: Validate update of formula for 'IVA Acumulado' column

  Scenario: Export and verify Excel formula for 'IVA Acumulado'
    Given the user is on the report export page
    When the user exports the Excel
    Then the Excel should be exported successfully

    And the user opens the Excel file
    When the user verifies the formula of the 'IVA Acumulado' column
    Then the formula should be updated to reflect all IVA types except IVA Retenido