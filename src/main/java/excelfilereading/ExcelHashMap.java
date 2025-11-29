package excelfilereading;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.HashMap;

// Ravi
public class ExcelHashMap {

    //static  dataMap = new HashMap<>();

    public static HashMap<String, String> getExceldata (String givenRow){

        HashMap<String, String> dataMap = new HashMap<>();

        try {
            String filePath = "C:\\Users\\naved\\OneDrive\\Desktop\\testdata.xlsx";
            XSSFWorkbook workbook = new XSSFWorkbook(filePath);
            XSSFSheet sheet = workbook.getSheet("Sheet2");
            XSSFRow row = sheet.getRow(0);
            XSSFRow rowNum = null;

            for (int i =0; i<= row.getPhysicalNumberOfCells()-1; i++){
                 rowNum = sheet.getRow(i);


                if (sheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(givenRow)){

                    for (int j = 1 ; j <= row.getPhysicalNumberOfCells()-1; j++){
                        dataMap.put(row.getCell(j).getStringCellValue(), rowNum.getCell(j).getStringCellValue());


                    }
                    //System.out.println(header + "Header");
                }

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return dataMap;
    }

    public static void main(String[] args) {

        //HashMap<String, String> exceldata = getExceldata("Sister");
        //System.out.println(exceldata);
        System.out.println(getExceldata("Sister"));
    }

}