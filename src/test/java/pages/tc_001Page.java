package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class tc_001Page {
    private WebDriver driver;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToReportPage() {
        // Implementación de la navegación a la página de reportes
        driver.get("URL_DE_LA_PAGINA_DE_REPORTES");
    }

    public void exportReport() {
        // Lógica para exportar el documento Excel 'Claim Accounting Report'
        WebElement exportButton = driver.findElement(By.id("exportButton"));
        exportButton.click();
    }

    public boolean isExcelExported() {
        // Verificación de que el Excel ha sido exportado correctamente
        // Podría incluir la comprobación de un archivo descargado o notificación de éxito
        return true;  // Reemplazar por la lógica real de verificación
    }

    public boolean isColumnCFormattedCorrectly() {
        // Verificación de que la columna C tenga el formato correcto
        // Esto podría implicar interacción con Excel para validar las celdas
        return true;  // Reemplazar por la lógica real de verificación
    }
}