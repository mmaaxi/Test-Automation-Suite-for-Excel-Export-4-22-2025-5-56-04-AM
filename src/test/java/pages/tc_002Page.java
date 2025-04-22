package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {

    WebDriver driver;

    private By exportButton = By.id("export-button-id");
    private String exportedExcelPath = "path/to/excel/report";
    private static final String REQUIRED_COLUMN = "Estado Código";

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportExcel(String reportName) {
        driver.findElement(exportButton).click();
        // Logic to handle file download and save the Excel report
    }

    public boolean isExcelExported() {
        // Logic to verify the Excel is downloaded successfully
        // For example, checking the file exists at a specific path
        return new java.io.File(exportedExcelPath).exists();
    }

    public boolean isNewColumnPresent() {
        // Logic to open the Excel and verify the 'Estado Código' column presence
        // This could involve reading the Excel file and checking for the specific column header
        // For demonstration, assume a method `isColumnPresent` exists that does the verification
        return isColumnPresent(REQUIRED_COLUMN);
    }

    private boolean isColumnPresent(String columnName) {
        // Implement actual logic to verify the presence of column in Excel file
        return true; // Placeholder for actual implementation
    }
}