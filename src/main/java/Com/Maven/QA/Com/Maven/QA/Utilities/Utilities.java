package Com.Maven.QA.Com.Maven.QA.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utilities {
	
    public String ReadFromExcel(int c ,int r) throws EncryptedDocumentException, IOException {
    	FileInputStream file1 = new FileInputStream(System.getProperty("user.dir") + "\\driver\\TestData1.xlsx");
   		String value1 = WorkbookFactory.create(file1).getSheet("sheet").getRow(c).getCell(r).getStringCellValue();
   		return value1;
   		
}

}
