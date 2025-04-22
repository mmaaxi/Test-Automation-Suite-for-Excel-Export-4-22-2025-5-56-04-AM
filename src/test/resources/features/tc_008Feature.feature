Feature: Validate addition of 'IVA retenido' column

  Scenario: Verify 'IVA retenido' column in Excel export
    Given the Excel is exported
    When I check the exported Excel file
    Then the 'IVA retenido' column should be present with retained amounts filled correctly