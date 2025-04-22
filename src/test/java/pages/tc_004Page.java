package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {

    WebDriver driver;

    By botonExportar = By.id("exportarExcel");
    By columnaMontoAcumulado = By.xpath("//th[contains(text(), 'Monto acumulado Folio Reserva 5401')]");
    By celdaFormula = By.xpath("//td[contains(@data-columname, 'Monto acumulado Folio Reserva 5401')]");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarPaginaExportacion() {
        driver.get("http://url-de-la-pagina-de-exportacion");
    }

    public void exportarExcel() {
        driver.findElement(botonExportar).click();
        // Lógica para manejar exportación
        // ...
    }

    public boolean verificarExportacionExcelExitosa() {
        // Lógica para verificar que el Excel se exportó correctamente
        // Puede ser comprobando la existencia del archivo o un mensaje de éxito
        return true;
    }

    public void verificarInsercionColumna() {
        // Navegación a la parte de la hoja donde se debe verificar la columna
    }

    public boolean verificarFormulaColumna() {
        WebElement elementoCelda = driver.findElement(celdaFormula);
        String formulaEsperada = "EXPECTED_FORMULA"; // Define la fórmula esperada
        return elementoCelda.getText().contains(formulaEsperada);
    }
}