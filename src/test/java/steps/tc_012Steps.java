import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_012Page;

public class tc_012Steps {
    tc_012Page page = new tc_012Page();

    @Given("I have exported the Excel file")
    public void exportExcelFile() {
        page.exportExcel();
        Assert.assertTrue("Excel file should be exported successfully", page.isExcelExported());
    }

    @When("I verify the column 'Status de Pago' is renamed to 'Descripción Status Pago'")
    public void verifyColumnRenaming() {
        boolean isRenamed = page.checkColumnRenaming("Status de Pago", "Descripción Status Pago");
        Assert.assertTrue("Column should be renamed correctly", isRenamed);
    }

    @Then("the renaming should match the specification")
    public void validateRenamingSpecification() {
        Assert.assertTrue("Renaming should follow the specification", page.validateRenamingSpecification());
    }
}