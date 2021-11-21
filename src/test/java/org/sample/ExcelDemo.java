package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Vishn\\eclipse-workspace\\Mavensample\\excel\\Book1.xlsx");
	FileInputStream s = new FileInputStream(file);
	Workbook book = new XSSFWorkbook(s);
	Sheet sheet = book.getSheet("Sheet1");
	
	Row r = sheet.getRow(6);
	Cell c = r.getCell(0);
	System.out.println(c);
	
	int type = c.getCellType();
	if (type==0) {
	if (DateUtil.isCellDateFormatted(c)) {
Date d = c.getDateCellValue();
	SimpleDateFormat si = new SimpleDateFormat();
	String v = si.format(d);
	System.out.println(v);
	}
	
	
	}
	
	}

}
