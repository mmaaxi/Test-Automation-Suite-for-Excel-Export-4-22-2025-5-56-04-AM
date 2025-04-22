package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;
import static org.junit.Assert.assertTrue;

public class tc_001Steps {
    private tc_001Page reportPage = new tc_001Page();

    @Given("que el usuario se encuentra en la página de reportes")
    public void que_el_usuario_se_encuentra_en_la_página_de_reportes() {
        reportPage.navigateToReportPage();
    }

    @When("el usuario exporta el documento Excel 'Claim Accounting Report'")
    public void el_usuario_exporta_el_documento_Excel_Claim_Accounting_Report() {
        reportPage.exportReport();
    }

    @Then("el sistema exporta el Excel correctamente")
    public void el_sistema_exporta_el_Excel_correctamente() {
        assertTrue(reportPage.isExcelExported());
    }

    @Then("la columna C contiene la llave concatenada como 'No. Siniestro_No. De autorización_status_tipo de mov_no. De movimiento'")
    public void la_columna_C_contiene_la_llave_concatenada_correctamente() {
        assertTrue(reportPage.isColumnCFormattedCorrectly());
    }
}