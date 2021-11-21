package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OneRowCell {
	public static void main(String[] args) throws IOException {
		File F = new File("C:\\Users\\Vishn\\eclipse-workspace\\Mavensample\\excel\\Book1.xlsx");
	FileInputStream con = new FileInputStream(F);
		Workbook book = new XSSFWorkbook(con);
		Sheet s = book.getSheet("sheet1");
		Row r = s.getRow(2);
		for (int i = 0; i <r.getPhysicalNumberOfCells(); i++) {
			Cell c = r.getCell(i);
			System.out.println();	
	}
}
}
