package com.arun.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public File file;
	public FileInputStream fin;
	public FileOutputStream fout;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFCell cell;
	

	public ExcelReader(String filepath) throws IOException {
		file = new File(filepath);
		fin  = new FileInputStream(file);
		workbook = new XSSFWorkbook(fin);
		sheet = workbook.getSheet("Sheet1");

	}
	
	
	public int getNoOfRows() {
		
		return sheet.getLastRowNum()+1;
	}
	
	public int getNoOfCols() {
		
		return sheet.getRow(0).getLastCellNum();
	}

	public String getCellData(int row, int col) {
		
		cell = sheet.getRow(row).getCell(col);
		cell.setCellType(CellType.STRING);
		if(cell == null && cell.getCellType()== CellType.BLANK) {
			return "";
		}
		else {
			String cellData = cell.getStringCellValue();
			
			return cellData;
		}
		
		
		
	}

}