package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("el usuario ha iniciado sesión y está en la página de movimientos de pago")
    public void elUsuarioHaIniciadoSesion() {
        page.navigateToLoginPage();
        page.login("usuario", "contraseña");
        page.navigateToMovimientosDePago();
    }

    @When("el usuario exporta el Excel y realiza un movimiento de pago")
    public void elUsuarioExportaExcelYRealizaMovimientoPago() {
        page.exportExcel();
        page.realizarMovimientoDePago();
    }

    @Then("el Excel se exporta correctamente")
    public void elExcelSeExportaCorrectamente() {
        Assert.assertTrue(page.isExcelExported());
    }

    @And("la fórmula de 'Monto Acumulado Folio OPC \\(2121)' debe incluir la suma: Z4\\+AD5\\+AE5\\+AH5\\+AC5\\+AB5\\+AM5")
    public void validarFormulaMontoAcumulado() {
        String formulaEsperada = "Z4+AD5+AE5+AH5+AC5+AB5+AM5";
        Assert.assertEquals(formulaEsperada, page.obtenerFormulaMontoAcumulado());
    }
}