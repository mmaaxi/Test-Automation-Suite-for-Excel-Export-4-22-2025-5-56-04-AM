Feature: Validate renaming of column to 'Monto Acumulado Folio OPC (2121)'

  Scenario: Export Excel and check the renamed column
    Given I have exported the Excel file
    When I verify the renamed column in the Excel file
    Then the column should be named 'Monto Acumulado Folio OPC (2121)'