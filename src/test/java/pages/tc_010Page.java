package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    WebDriver driver;

    private By exportButton = By.id("exportExcel");
    private By reportPageLocator = By.id("reportPage");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToReportPage() {
        // Implementación para navegar a la página de reportes
        driver.get("http://example.com/reportpage");
    }

    public void exportExcel() {
        driver.findElement(exportButton).click();
    }

    public boolean isExcelExported() {
        // Lógica para verificar si el Excel fue exportado correctamente
        return true; // Implementar método real
    }

    public boolean areColumnsPresent() {
        // Lógica para verificar columnas "Folio Pre solicitud" y "Folio de Pago"
        return true; // Implementar método real que compruebe las columnas
    }
}