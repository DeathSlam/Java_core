package lr10.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFile {
    public static void main(String[] args) throws IOException {
        String filePath = "src/lr10/Excel   /ExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheet("Товары");

        for(Row row : sheet){
            for(Cell cell : row){
                System.out.println(cell.toString() + "\t");
            }
            System.out.println();
        }

        workbook.close();
        inputStream.close();
    }
}
