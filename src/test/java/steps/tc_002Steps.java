package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page excelPage = new tc_002Page();

    @Given("the user exports the {string} Excel")
    public void the_user_exports_the_excel(String reportName) {
        excelPage.exportExcel(reportName);
    }

    @When("the Excel is exported successfully")
    public void the_excel_is_exported_successfully() {
        Assert.assertTrue(excelPage.isExcelExported());
    }

    @Then("the new column 'Estado Código' should be added to the right of column 'i'")
    public void the_new_column_estado_codigo_should_be_added_to_the_right_of_column_i() {
        Assert.assertTrue(excelPage.isNewColumnPresent());
    }
}