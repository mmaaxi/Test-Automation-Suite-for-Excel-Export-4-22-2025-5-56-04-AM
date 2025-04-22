import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_011Page;

public class tc_011Steps {

    tc_011Page exportPage = new tc_011Page();
    
    @Given("^el usuario está en la página de exportación de Excel$")
    public void el_usuario_está_en_la_página_de_exportación_de_Excel() {
        exportPage.navigateToExportPage();
    }

    @When("^el usuario exporta el Excel$")
    public void el_usuario_exporta_el_Excel() {
        exportPage.exportExcel();
    }

    @Then("^se exporta el Excel correctamente$")
    public void se_exporta_el_Excel_correctamente() {
        Assert.assertTrue(exportPage.isExcelExportedSuccessfully());
    }

    @Given("^el usuario abre el Excel exportado$")
    public void el_usuario_abre_el_Excel_exportado() {
        exportPage.openExportedExcel();
    }

    @When("^el usuario verifica la columna 'Status Pago Código'$")
    public void el_usuario_verifica_la_columna_Status_Pago_Código() {
        exportPage.checkStatusPagoCodigoColumn();
    }

    @Then("^la columna se muestra en la posición correcta sin valores asignados inicialmente$")
    public void la_columna_se_muestra_en_la_posición_correcta_sin_valores_asignados_inicialmente() {
        Assert.assertTrue(exportPage.isStatusPagoCodigoColumnInsertedCorrectly());
    }
}