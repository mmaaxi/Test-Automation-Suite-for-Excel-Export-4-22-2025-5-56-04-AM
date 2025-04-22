package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("el usuario está en la página de exportación")
    public void elUsuarioEstaEnLaPaginaDeExportacion() {
        page.navegarPaginaExportacion();
    }

    @When("el usuario exporta el Excel")
    public void elUsuarioExportaElExcel() {
        page.exportarExcel();
    }

    @Then("el Excel se exporta correctamente")
    public void elExcelSeExportaCorrectamente() {
        Assert.assertTrue(page.verificarExportacionExcelExitosa());
    }

    @When("el usuario verifica la columna 'Monto acumulado Folio Reserva 5401'")
    public void elUsuarioVerificaLaColumna() {
        page.verificarInsercionColumna();
    }

    @Then("la columna se muestra correctamente con la fórmula adecuada")
    public void laColumnaSeMuestraCorrectamenteConFormulaAdecuada() {
        Assert.assertTrue(page.verificarFormulaColumna());
    }
}