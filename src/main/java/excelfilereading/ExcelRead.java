package excelfilereading;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;

public class ExcelRead {

    @Test
    public static void getExtractInfo() throws IOException {
        HashMap<String, String> extractInfo = new HashMap<>();
        XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\naved\\OneDrive\\Desktop\\testdata.xlsx");
        XSSFSheet sheet = workbook.getSheet("Sheet2");
        //XSSFRow row = sheet.getRow(0); // If i declare this index as 0, I am unable to use it in for loop
        //XSSFCell cell = row.getCell(0); // If i declare this index as 0, I am unable to use it in for loop
        //System.out.println(cell.getStringCellValue());
        //sheet.getRow(2).getCell(1).setCellValue("Test111");
        //System.out.println(row.getPhysicalNumberOfCells());

        for (int i = 0; i <= sheet.getPhysicalNumberOfRows(); i++) {
            if (i == 3) {
                XSSFRow row = sheet.getRow(i);

                for (int j = 0; j <= row.getPhysicalNumberOfCells(); j++) {
                    if (j == 3) {
                        XSSFCell cell = row.getCell(j);
                        System.out.println("Value :" + cell.getStringCellValue());
                    }
                }
            }
        }


        /*int rowCount = getRowCount(sheet);
        for(int i=1; i<rowCount; i++) {
            XSSFRow row = getRow(sheet, i);
            XSSFCell cell = getCell(row, 0);
            String extractName = getCellValue(getCell(row, 0));
            if(extractName.equalsIgnoreCase(currentExtractName)) {
                int cellCount = getCellCountForARow(row);
                for(int j=0; j<cellCount; j++) {
                    String extractAttribute = getCellValue(getCell(getRow(sheet, 0), j));
                    String extractAttributeValue = getCellValue(getCell(row, j));
                    extractInfo.put(extractAttribute, extractAttributeValue);
                }
            }
        }
        return extractInfo;*/
            }
        }
