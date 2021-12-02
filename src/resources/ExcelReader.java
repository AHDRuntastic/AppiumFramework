package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	
	static FileInputStream fis = null; //Define empty file
	
	public FileInputStream getFileInputStream()
	{
		String filePath = System.getProperty("user.dir")+"/src/resources/Loginusersdata.xlsx"; //Get the excel file
		File srcfile = new File(filePath);
		
		try {
			fis = new FileInputStream(srcfile);
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist please check file path");
			System.exit(0);
		}
		
		return fis;
	}
	
	
	public Object[][] getExcelData() throws IOException
	{
		
		fis = getFileInputStream();
		XSSFWorkbook wb = new XSSFWorkbook(fis); //Get whole excel file
		XSSFSheet sheet = wb.getSheetAt(0);  //Get sheet inside the file
		
		int TotalNumberOfRows = (sheet.getLastRowNum()+1); 
		int TotalNumberOfColumns = 2;
		
		String [][] ArrayData = new String[TotalNumberOfRows][TotalNumberOfColumns];
		
		for (int i = 0; i < TotalNumberOfRows; i++) // we go through all data in the sheet and take it one by one
		{
			for (int j = 0; j < TotalNumberOfColumns; j++) 
			{

				XSSFRow row = sheet.getRow(i);
				ArrayData[i][j] = row.getCell(j).toString();
					
				

			}
		}
		wb.close();
		return ArrayData;
		
		
	}
}
