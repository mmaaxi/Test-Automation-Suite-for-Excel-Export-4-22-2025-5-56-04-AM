package steps;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_005Page;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("I have exported the Excel file")
    public void i_have_exported_the_excel_file() {
        page.exportExcel();
    }

    @When("I verify the renamed column in the Excel file")
    public void i_verify_the_renamed_column_in_the_excel_file() {
        page.openExportedExcel();
    }

    @Then("the column should be named 'Monto Acumulado Folio OPC \\(2121\\)'")
    public void the_column_should_be_named() {
        Assert.assertTrue(page.isColumnRenamedCorrectly());
    }
}