package LearnDataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {   
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	//1.
	FileInputStream fis=new FileInputStream("./src/test/resources/VtigerProject.xlsx");
	
	//2.
	Workbook book=WorkbookFactory.create(fis);
	
	String data1 = book.getSheet("TestData").getRow(10).getCell(2).getStringCellValue();
	double data2 = book.getSheet("TestData").getRow(1).getCell(0).getNumericCellValue();
	boolean data3 = book.getSheet("TestData").getRow(0).getCell(0).getBooleanCellValue();
	
	
	//write-----> new sheet, new row
	book.createSheet("BatchDetail").createRow(0).createCell(0).setCellValue("A4");
	
	
	//write-----> existing sheet, existing row
	book.getSheet("BatchDetail").getRow(0).createCell(0).setCellValue("A5");
	
	
	//write-----> existing sheet, new row
		book.getSheet("BatchDetail").createRow(0).createCell(2).setCellValue("A6");
		 
	
	//4.
	FileOutputStream fos = new FileOutputStream("./src/test/resources/VtigerProject.xlsx");
    //5.
	book.write(fos);
	//6.
	book.close();
	
	
}
}
