package com.Google.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub  
  FileInputStream file= new FileInputStream("TestData/Java_app_data.xlsx");//fileinputstream is use to in order to read an excel data. Define relative path by rclicking on excel file from LHS-properties-resource and the first path, do not copy projectname
	XSSFWorkbook book= new XSSFWorkbook(file);  //open excel sheet
	XSSFSheet sheet= book.getSheet("InvalidCredentialTest"); //open a sheet from that excel sheet whose name has given here
	int rowCount= sheet.getPhysicalNumberOfRows(); //get the row count of the records
	System.out.println(rowCount);    //print row count
	XSSFRow rowCheck=sheet.getRow(0);
	int cellCount= rowCheck.getPhysicalNumberOfCells();
	System.out.println(cellCount);
	
	 //data is in cell format
	
	DataFormatter format= new DataFormatter(); //we can convert cell data onto a string using DataFormatter class
	
	String[][] main= new String[rowCount-1][cellCount];
	
	for(int i=0; i<rowCount; i++)
	{
		for(int j=0; j<cellCount; j++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(j);
			String value= format.formatCellValue(cell);
			//System.out.println(value);
			System.out.println(main[i+1][j]=value);
			
		}
	}
	
	book.close();
	file.close();
	
	
	
	
	
	
	
	
	
	}

}
