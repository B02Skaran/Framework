package org.maven;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleSheet {
	public static void main(String[] args) throws InvalidFormatException, IOException {

		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\MavenProjectSample\\Excel Sheets\\Data.xlsx");
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("Sheet1");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();
				switch (cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat Dateinfo = new SimpleDateFormat("dd-MMM-yy");
						String string = Dateinfo.format(dateCellValue);
						System.out.println(string);

					} else {
						double d = cell.getNumericCellValue();
						BigDecimal big = BigDecimal.valueOf(d);
						String string = big.toString();
						System.out.println(string);

					}
				}
			}
		}
	}
}
