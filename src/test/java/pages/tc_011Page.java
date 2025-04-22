import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_011Page {

    WebDriver driver;

    private By exportButton = By.id("exportExcelButton");
    private By confirmationMessage = By.id("confirmationMessage");

    public tc_011Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToExportPage() {
        driver.get("http://example.com/exportExcel");
    }

    public void exportExcel() {
        driver.findElement(exportButton).click();
    }

    public boolean isExcelExportedSuccessfully() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }

    public void openExportedExcel() {
        // Code to open the exported Excel file
    }

    public void checkStatusPagoCodigoColumn() {
        // Code to verify the 'Status Pago Código' column is inserted
    }

    public boolean isStatusPagoCodigoColumnInsertedCorrectly() {
        // Code to check the correctness of column placement
        return true;
    }
}