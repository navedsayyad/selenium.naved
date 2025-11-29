package excelfilereading;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

// Ravi shared the details on 26 Oct 2025 (DataTestProvider class in test package)
public class DataProviderRavi {

    @DataProvider(name = "Sample")
    public static Object[][] getExceldata() {

        Object[][] data = new Object[][]{
        };

        try {
            String filePath = "C:\\Users\\naved\\OneDrive\\Desktop\\testdata.xlsx";
            XSSFWorkbook workbook = new XSSFWorkbook(filePath);
            XSSFSheet sheet = workbook.getSheet("Sheet2");
            XSSFRow row = sheet.getRow(0);

            int noOfRows = sheet.getPhysicalNumberOfRows();
            int noOfCols = row.getLastCellNum();
            Cell cell;
            data = new Object[noOfRows - 1][noOfCols];

            for (int i = 1; i < noOfRows; i++) {
                for (int j = 0; j < noOfCols; j++) {
                    row = sheet.getRow(i);
                    cell = row.getCell(j);
                    data[i - 1][j] = cell.getStringCellValue();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}






