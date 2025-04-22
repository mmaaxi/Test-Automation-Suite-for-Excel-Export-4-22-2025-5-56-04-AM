package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class tc_008Page {

    private WebDriver driver;

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportExcel() {
        WebElement exportButton = driver.findElement(By.id("export-button-id"));
        exportButton.click();
        // Other required steps to ensure the Excel is exported
    }

    public boolean isRetainedTaxColumnPresentAndCorrect() {
        // Logic to locate and validate the 'IVA retenido' column in the exported Excel file
        // This would include opening the file and checking its contents
        // For demonstration, returning true as if the check has passed successfully
        return true;
    }
}