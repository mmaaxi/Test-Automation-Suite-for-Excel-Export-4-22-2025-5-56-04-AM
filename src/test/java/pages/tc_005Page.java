package pages;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class tc_005Page {

    public void exportExcel() {
        // Code to trigger the export of the Excel file
        // This should trigger the UI action or service that exports the file
    }

    public void openExportedExcel() {
        // Code to open the exported Excel file
        // Typically, you would open the file and read it into Apache POI Workbook
    }

    public boolean isColumnRenamedCorrectly() {
        boolean isRenamedCorrectly = false;
        try {
            FileInputStream file = new FileInputStream(new File("path/to/exportedExcel.xlsx"));
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(0); // assuming headers are in the first row
            for (Cell cell : row) {
                if ("Monto Acumulado Folio OPC (2121)".equals(cell.getStringCellValue())) {
                    isRenamedCorrectly = true;
                    break;
                }
            }
            workbook.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isRenamedCorrectly;
    }
}