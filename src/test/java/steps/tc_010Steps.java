package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page reportPage;

    @Given("el usuario está en la página de reportes")
    public void elUsuarioEstaEnLaPaginaDeReportes() {
        reportPage = new tc_010Page(driver);
        reportPage.navigateToReportPage();
    }

    @When("el usuario exporta el Excel")
    public void elUsuarioExportaElExcel() {
        reportPage.exportExcel();
    }

    @Then("el Excel se exporta correctamente")
    public void elExcelSeExportaCorrectamente() {
        Assert.assertTrue(reportPage.isExcelExported());
    }

    @Then("las columnas 'Folio Pre solicitud' y 'Folio de Pago' deberían estar presentes en la posición indicada sin valores asignados")
    public void lasColumnasDeberianEstarPresentes() {
        Assert.assertTrue(reportPage.areColumnsPresent());
    }
}