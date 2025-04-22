package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {
    private WebDriver driver;

    private By exportButton = By.id("exportButton");
    private By ivaColumnHeader = By.xpath("//th[contains(text(), 'IVA 0%')]");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportarExcel() {
        WebElement exportBtn = driver.findElement(exportButton);
        exportBtn.click();
    }

    public boolean verificarExportacionCorrecta() {
        // Lógica para verificar que el archivo Excel se haya exportado
        return true; // Placeholder
    }

    public boolean verificarColumnaIVA0() {
        WebElement ivaColHeader = driver.findElement(ivaColumnHeader);
        return ivaColHeader.isDisplayed();
    }
}