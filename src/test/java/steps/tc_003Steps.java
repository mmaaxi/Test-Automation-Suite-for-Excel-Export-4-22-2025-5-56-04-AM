package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {

    private final tc_003Page page = new tc_003Page();

    @Given("El usuario está en la página de gestión de documentos")
    public void elUsuarioEstaEnLaPaginaDeGestionDeDocumentos() {
        page.navigateToManagementPage();
    }

    @When("El usuario exporta el documento Excel")
    public void elUsuarioExportaElDocumentoExcel() {
        page.exportExcelDocument();
    }

    @Then("El Excel se exporta correctamente")
    public void elExcelSeExportaCorrectamente() {
        Assert.assertTrue("El documento Excel no fue exportado correctamente", page.isExcelExportedSuccessfully());
    }

    @Then("Los datos en la columna 'estado' han sido actualizados según los requerimientos")
    public void losDatosEnLaColumnaEstadoHanSidoActualizados() {
        Assert.assertTrue("Los datos de la columna 'estado' no se actualizaron correctamente", page.isStateColumnUpdatedCorrectly());
    }
}