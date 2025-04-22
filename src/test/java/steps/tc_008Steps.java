package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {

    private tc_008Page page;

    public tc_008Steps() {
        page = new tc_008Page();
    }

    @Given("the Excel is exported")
    public void exportExcel() {
        page.exportExcel();
    }

    @When("I check the exported Excel file")
    public void checkExportedExcel() {
        // No action needed as it's part of the assertion check below
    }

    @Then("the 'IVA retenido' column should be present with retained amounts filled correctly")
    public void verifyRetainedTaxColumn() {
        boolean isColumnPresentAndCorrect = page.isRetainedTaxColumnPresentAndCorrect();
        Assert.assertTrue("The 'IVA retenido' column is either missing or not filled correctly", isColumnPresentAndCorrect);
    }
}