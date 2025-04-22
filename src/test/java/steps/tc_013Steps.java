package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_013Page;
import static org.junit.Assert.assertTrue;

public class tc_013Steps {

    WebDriver driver;
    tc_013Page page = new tc_013Page(driver);

    @Given("the user is on the report export page")
    public void user_on_export_page() {
        page.navigateToExportPage();
    }

    @When("the user exports the Excel")
    public void user_exports_excel() {
        page.exportExcel();
    }

    @Then("the Excel should be exported successfully")
    public void excel_exported_successfully() {
        assertTrue(page.isExcelExported());
    }

    @And("the user opens the Excel file")
    public void user_opens_excel_file() {
        page.openExcelFile();
    }

    @When("the user verifies the formula of the 'IVA Acumulado' column")
    public void user_verifies_formula() {
        page.verifyIvaFormula();
    }

    @Then("the formula should be updated to reflect all IVA types except IVA Retenido")
    public void formula_updated_correctly() {
        assertTrue(page.isFormulaCorrect());
    }
}