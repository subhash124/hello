package one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static String tc(int row, int col) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\subhash\\Desktop\\shailaja cred.xlsx");
		
		return WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(col).getStringCellValue();
		
		
	}

}
