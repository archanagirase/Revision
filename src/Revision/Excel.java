package Revision;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream file= new FileInputStream("E:\\excel sheet\\28jan.xlsx");
		 String value=WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		 System.out.println(value);
	//	Workbook book=WorkbookFactory.create(file);    //diffclassname.methodname();
	//	Sheet sh=book.getSheet("sheet1");
	//	Row rw = sh.getRow(0);
	//	Cell C1=rw.getCell(0);
	// String value = C1.getStringCellValue();
	//	System.out.println(value);
		
		
	}

}



