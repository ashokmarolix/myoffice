package com.empirem.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.empirem.qa.base.BaseTest;

public class UtlisTest extends BaseTest{

	public UtlisTest() throws Throwable {
		super();
	
	}
	String ExcelData ="C:\\Users\\lenovo\\eclipse-workspace\\Empiremaster\\src\\main\\java\\com\\empirem\\qa\\testdata\\Empusertypes.xlsx";
	 static  Workbook book;
	 static Sheet sheet; 
	 
	 
	public Object[][] getExcelData(String sheetname) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(ExcelData);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();

		}
		sheet = book.getSheet(sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int r = 0; r < sheet.getLastRowNum(); r++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				DataFormatter df = new DataFormatter();
				data[r][k] = df.formatCellValue(sheet.getRow(r + 1).getCell(r));
			}

		}
		return data;

	}
		
	}


