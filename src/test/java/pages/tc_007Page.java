package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_007Page {
    WebDriver driver;

    By exportButton = By.id("export-button");
    By exportSuccessMessage = By.id("export-success-message");
    By ivaExentoColumn = By.xpath("//table//th[text()='IVA exento']");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToExportPage() {
        driver.get("http://example.com/export");
    }

    public void exportExcel() {
        driver.findElement(exportButton).click();
    }

    public boolean isExcelExportedSuccessfully() {
        WebElement successMessage = driver.findElement(exportSuccessMessage);
        return successMessage.isDisplayed();
    }

    public boolean isIvaExentoColumnPresentAndValid() {
        WebElement ivaColumn = driver.findElement(ivaExentoColumn);
        return ivaColumn.isDisplayed() && hasCorrectIvaExentoData();
    }

    private boolean hasCorrectIvaExentoData() {
        // Add logic to validate the data in 'IVA exento' column
        // This might involve reading the exported Excel and checking the data
        return true; // Placeholder for actual implementation
    }
}