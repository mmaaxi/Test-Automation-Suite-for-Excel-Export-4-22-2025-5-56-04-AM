Feature: Validate the addition of 'Estado Código' column to the Excel report

  Scenario: Validate incorporation of column 'Estado Código'
    Given the user exports the "Claim Accounting Report" Excel
    When the Excel is exported successfully
    Then the new column 'Estado Código' should be added to the right of column 'i'