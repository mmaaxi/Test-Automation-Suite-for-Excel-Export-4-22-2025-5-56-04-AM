package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_009Page {

    WebDriver driver;
    WebDriverWait wait;

    By loginButton = By.id("login-button");
    By movimientosDePagoLink = By.id("movimientos-pago");
    By exportExcelButton = By.id("export-excel");
    By movimientoPagoButton = By.id("realizar-pago");
    By excelExportedConfirmation = By.id("excel-confirmation");
    By formulaField = By.id("formula-monto-acumulado");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToLoginPage() {
        driver.get("http://miportal.com/login");
    }

    public void login(String username, String password) {
        // Código para realizar el login usando usuario y contraseña
    }

    public void navigateToMovimientosDePago() {
        driver.findElement(movimientosDePagoLink).click();
    }

    public void exportExcel() {
        driver.findElement(exportExcelButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(excelExportedConfirmation));
    }

    public void realizarMovimientoDePago() {
        driver.findElement(movimientoPagoButton).click();
    }

    public boolean isExcelExported() {
        return driver.findElement(excelExportedConfirmation).isDisplayed();
    }

    public String obtenerFormulaMontoAcumulado() {
        return driver.findElement(formulaField).getText();
    }
}