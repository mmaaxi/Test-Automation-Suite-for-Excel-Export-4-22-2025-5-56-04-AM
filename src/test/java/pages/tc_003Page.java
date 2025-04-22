package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_003Page {

    private WebDriver driver;
    private WebDriverWait wait;

    private By exportButton = By.id("exportButton");
    private By stateColumn = By.xpath("//table[@id='data-table']//tr/td[contains(@class, 'estado')]");

    public tc_003Page() {
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void navigateToManagementPage() {
        driver.get("http://example.com/management");
    }

    public void exportExcelDocument() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(exportButton));
        button.click();
    }

    public boolean isExcelExportedSuccessfully() {
        // Logic to verify if the Excel is successfully exported.
        // Placeholder for the actual implementation.
        return true;
    }

    public boolean isStateColumnUpdatedCorrectly() {
        // Logic to verify if the 'estado' column is updated correctly.
        // Placeholder for the actual implementation.
        return true;
    }
}