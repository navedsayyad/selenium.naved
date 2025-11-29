package excelfilereading;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.HashMap;

public class ExcelFilePractice {

    public static HashMap<String, String> getExceldata (String userdata){

        HashMap<String, String> mapdata = new HashMap<>();

        try {

            String filepath = "C:\\Users\\naved\\OneDrive\\Desktop\\testdata.xlsx";
            String sheetName = "Sheet2";
            XSSFWorkbook workbook = new XSSFWorkbook(filepath);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            XSSFRow row = sheet.getRow(0);
            XSSFRow rowdata = null;

            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++){
                rowdata = sheet.getRow(i);

                if (rowdata.getCell(0).getStringCellValue().equalsIgnoreCase(userdata)){
                    for (int j = 1; j < row.getPhysicalNumberOfCells(); j++){
                        mapdata.put(row.getCell(j).getStringCellValue(), rowdata.getCell(j).getStringCellValue());
                    }
                }
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return mapdata;
    }

    public static void main(String[] args) {
        System.out.println(getExceldata("brother"));
    }

}
