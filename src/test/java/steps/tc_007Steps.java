package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {
    tc_007Page page = new tc_007Page();

    @Given("El usuario está en la página de exportaciones")
    public void el_usuario_esta_en_la_pagina_de_exportaciones() {
        page.navigateToExportPage();
    }

    @When("El usuario exporta el Excel")
    public void el_usuario_exporta_el_excel() {
        page.exportExcel();
    }

    @Then("El Excel se exporta correctamente")
    public void el_excel_se_exporta_correctamente() {
        Assert.assertTrue(page.isExcelExportedSuccessfully());
    }

    @Then("La columna 'IVA exento' se muestra con los datos correspondientes")
    public void la_columna_iva_exento_se_muestra_con_los_datos_correspondientes() {
        Assert.assertTrue(page.isIvaExentoColumnPresentAndValid());
    }
}