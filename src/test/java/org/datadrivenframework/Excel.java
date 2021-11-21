package org.datadrivenframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File F = new File("C:\\Users\\Vishn\\eclipse-workspace\\Mavensample\\excel\\Book1.xlsx");
	FileInputStream con = new FileInputStream(F);
		Workbook book = new XSSFWorkbook(con);
		Sheet s = book.getSheet("sheet1");
		
		 int rowno = s.getPhysicalNumberOfRows();
		 for (int i = 0; i<rowno; i++) {
			 Row row = s.getRow(i);
			int cellno = row.getPhysicalNumberOfCells();
		for (int j = 0; j<cellno; j++) {
			Cell cell = row.getCell(j);
			System.out.println(cell);
		}
		System.out.println("------");
		 }
	}

}
