package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TaskSheet1 {
public static void main(String[] args) throws IOException {
//find the path of excel sheet
	File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\MavenProjectSample\\Excel Sheets\\Data.xlsx");
//get objects /bytes from file
	FileInputStream stream = new FileInputStream(file);
//create the workbook >>>> collection of sheet	
	Workbook workbook = new XSSFWorkbook(stream);
//get the sheet 	
	Sheet sheet = workbook.getSheet("Sheet2");
//get the row	
	Row row = sheet.getRow(2);
//get the cell	
	Cell cell = row.getCell(0);
	System.out.println(cell);
//get the count from row
int count = sheet.getPhysicalNumberOfRows();
	System.out.println(count);
//cell Count from cell	
int cellscount = row.getPhysicalNumberOfCells();
	System.out.println(cellscount);

	
	
	
	
	
}
}
