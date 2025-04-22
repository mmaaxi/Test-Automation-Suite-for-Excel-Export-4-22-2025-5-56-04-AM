package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_013Page {

    WebDriver driver;

    By exportButton = By.id("exportButton");
    By excelFile = By.id("exportedExcel");

    public tc_013Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToExportPage() {
        driver.get("http://example.com/report/export");
    }

    public void exportExcel() {
        driver.findElement(exportButton).click();
    }

    public boolean isExcelExported() {
        // Placeholder method for checking if Excel is exported
        return true;
    }

    public void openExcelFile() {
        // Placeholder method for opening Excel file
    }

    public void verifyIvaFormula() {
        // Placeholder method for verifying IVA formula
    }

    public boolean isFormulaCorrect() {
        // Placeholder method for checking the correctness of the IVA formula
        return true;
    }
}