package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
//import static org.apache.poi.ss.usermodel.Row.RETURN_NULL_AND_BLANK;

public class ExcelUtils {
	
	
	private static XSSFWorkbook ExcelWbook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	
	
   public static void setExcelFile(String Path, String SheetName) throws Exception{
	   try{
	   FileInputStream ExcelFile = new FileInputStream(Path);
	   
	   ExcelWbook = new XSSFWorkbook(ExcelFile);
	   
	   ExcelWSheet = ExcelWbook.getSheet(SheetName);
	   }
	   catch(Exception e){
		   throw(e);
	   }
   }
   
   ////This method is to read the test data from the Excel cell, 
   //in this we are passing parameters as Row num and Col num

   public static String getCellData(int CellNum, int RowNum){
	   
	  try{ 
	   Cell= ExcelWSheet.getRow(RowNum).getCell(CellNum);
	   
	   String cellData = Cell.getStringCellValue();
	   
	   return cellData;
	  }
	  catch(Exception e){
		  return "";
	  }
   }
   
   public static void setCellValue(String Result, int RowNum, int ColNum){
	   
	   try{
		    Row = ExcelWSheet.getRow(RowNum);
		    //Cell = Row.getCell(ColNum, Row.RETURN_NULL_AND_BLANK)
		   
	   }
	   catch(Exception e){
	   }
	   }
	   
	   
	   
	   
   }
   
   

