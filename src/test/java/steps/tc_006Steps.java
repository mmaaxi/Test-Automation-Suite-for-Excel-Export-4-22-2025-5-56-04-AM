package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_006Page;
import static org.junit.Assert.assertTrue;

public class tc_006Steps {
    tc_006Page page = new tc_006Page();

    @Given("^el usuario exporta el Excel$")
    public void elUsuarioExportaElExcel() {
        page.exportarExcel();
    }

    @When("^se exporta el Excel correctamente$")
    public void seExportaElExcelCorrectamente() {
        assertTrue(page.verificarExportacionCorrecta());
    }

    @Then("^se muestra la columna 'IVA 0%' con los montos aplicables$")
    public void seMuestraLaColumnaIVA0() {
        assertTrue(page.verificarColumnaIVA0());
    }
}